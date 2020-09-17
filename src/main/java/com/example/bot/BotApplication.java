package com.example.bot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1. 当有人来提交一个PR/MR的时候，自动打上一个标签：waiting-for-review
 * 2. 如果有人review过代码，他可以在评论中打一个/lgtm
 * 此时，若该PR通过了CI，则机器人执行自动的合并
 */
@SpringBootApplication
@RestController
public class BotApplication {
    private final ObjectMapper objectMapper = new ObjectMapper();
    private final HttpClient client = HttpClient.newHttpClient();

    public BotApplication() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public static void main(String[] args) {
        SpringApplication.run(BotApplication.class, args);
    }

    @PostMapping("/bot")
    public String endpoint(@RequestBody String body, HttpServletRequest request) throws IOException, InterruptedException {
        String eventType = request.getHeader("X-GitHub-Event");
        switch (eventType) {
            case "issue_comment":
                processIssueCommentEvent(body);
                break;
            case "pull_request":
                processPullRequestEvent(body);
                break;
            default:
                System.out.println("丢弃不认识的event");
        }

        return "OK";
    }

    private void processIssueCommentEvent(String body) throws IOException, InterruptedException {
        IssueCommentEvent event = objectMapper.readValue(body, IssueCommentEvent.class);
        if (event.getComment().getBody().contains("/lgtm")) {
            // 检查CI是不是通过了，如果通过了，执行合并
            // 1. 拿到PR上所有的commits，检查最新的那个commit上的statuses
            // 2. 如果所有的statuses都是绿色，说明通过了

            PullRequest pullRequest = getPullRequest(event.getRepository().getOwner().getLogin(),
                    event.getRepository().getName(),
                    event.getIssue().getNumber());

            String headCommit = pullRequest.getHead().getSha();

            if (isCiPassed(event.getRepository().getOwner().getLogin(),
                    event.getRepository().getName(), headCommit)) {
                //
            } else {
                comment(event.getRepository().getOwner().getLogin(),
                        event.getRepository().getName(),
                        event.getIssue().getNumber(),
                        "CI还没通过，等通过了我会自动合并的，请首长放心！");
            }
            // 否则评论：CI还没通过，等通过了我会自动合并的，请首长放心
        } else {
            System.out.println("这个评论跟机器人我没关系，我不管它");
        }
    }

    private void comment(String owner, String repo, int issueNumber, String comment) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("body", comment);
        String json = objectMapper.writeValueAsString(map);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/" + owner + "/" + repo + "/issues/" + issueNumber + "/comments"))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .header("Accept", "application/vnd.github.v3+json")
                .header("Authorization", "token " + System.getenv("GITHUB_TOKEN"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }

    // 检查这个commit对应的CI是不是都通过了，都是绿色返回true，否则返回false
    // 如果没有status，返回false
    private boolean isCiPassed(String owner, String repo, String commitId) throws IOException, InterruptedException {
        List<Status> statuses = getStatuses(owner, repo, commitId);
        if (statuses.isEmpty()) {
            return false;
        } else {
            return statuses.stream().allMatch(status -> "success".equals(status.getState()));
        }
    }

    private List<Status> getStatuses(String owner, String repo, String commitId) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/" + owner + "/" + repo + "/commits/" + commitId + "/statuses"))
                .header("Accept", "application/vnd.github.v3+json")
                .header("Authorization", "token " + System.getenv("GITHUB_TOKEN"))
                .build();
        String json = client.send(request, HttpResponse.BodyHandlers.ofString())
                .body();
        return objectMapper.readValue(json, new TypeReference<>() {
        });
    }

    private PullRequest getPullRequest(String owner, String repo, int issueNumber) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/" + owner + "/" + repo + "/pulls/" + issueNumber))
                .header("Accept", "application/vnd.github.v3+json")
                .header("Authorization", "token " + System.getenv("GITHUB_TOKEN"))
                .build();
        String body = client.send(request, HttpResponse.BodyHandlers.ofString())
                .body();
        return objectMapper.readValue(body, PullRequest.class);
    }

    private void processPullRequestEvent(String body) throws JsonProcessingException {
        PullRequestEvent event = objectMapper.readValue(body, PullRequestEvent.class);

        if ("opened".equals(event.getAction())) {
            labelPullRequest(event.getRepository().getOwner().getLogin(),
                    event.getRepository().getName(),
                    event.getNumber(),
                    "waiting-for-review");
        }
    }

    private void labelPullRequest(String owner, String repo, int issueNumber, String label) throws JsonProcessingException {
        Map<String, Object> map = new HashMap<>();
        map.put("labels", Arrays.asList(label));
        String json = objectMapper.writeValueAsString(map);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://api.github.com/repos/" + owner + "/" + repo + "/issues/" + issueNumber + "/labels"))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .header("Accept", "application/vnd.github.v3+json")
                .header("Authorization", "token " + System.getenv("GITHUB_TOKEN"))
                .build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}
/*

pull_request
{"action":"opened","number":2,"pull_request":{"url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2","id":488641088,"node_id":"MDExOlB1bGxSZXF1ZXN0NDg4NjQxMDg4","html_url":"https://github.com/blindpirate/bot-test/pull/2","diff_url":"https://github.com/blindpirate/bot-test/pull/2.diff","patch_url":"https://github.com/blindpirate/bot-test/pull/2.patch","issue_url":"https://api.github.com/repos/blindpirate/bot-test/issues/2","number":2,"state":"open","locked":false,"title":"Update README.md","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"body":"","created_at":"2020-09-17T12:43:41Z","updated_at":"2020-09-17T12:43:41Z","closed_at":null,"merged_at":null,"merge_commit_sha":null,"assignee":null,"assignees":[],"requested_reviewers":[],"requested_teams":[],"labels":[],"milestone":null,"draft":false,"commits_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits","review_comments_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments","review_comment_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2","head":{"label":"blindpirate:blindpirate-patch-1","ref":"blindpirate-patch-1","sha":"481756348e34daf8528593137deb06d400dbd5c2","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}},"base":{"label":"blindpirate:master","ref":"master","sha":"6798e2ed5899df42bc7096305cef05ea93fb937d","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}},"_links":{"self":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2"},"html":{"href":"https://github.com/blindpirate/bot-test/pull/2"},"issue":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2"},"comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments"},"review_comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments"},"review_comment":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}"},"commits":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits"},"statuses":{"href":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2"}},"author_association":"OWNER","active_lock_reason":null,"merged":false,"mergeable":null,"rebaseable":null,"mergeable_state":"unknown","merged_by":null,"comments":0,"review_comments":0,"maintainer_can_modify":false,"commits":1,"additions":1,"deletions":0,"changed_files":1},"repository":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master"},"sender":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}}

 */

