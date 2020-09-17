package com.example.bot;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties
public class PullRequestEvent {

    /**
     * action : opened
     * number : 2
     * pull_request : {"url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2","id":488641088,"node_id":"MDExOlB1bGxSZXF1ZXN0NDg4NjQxMDg4","html_url":"https://github.com/blindpirate/bot-test/pull/2","diff_url":"https://github.com/blindpirate/bot-test/pull/2.diff","patch_url":"https://github.com/blindpirate/bot-test/pull/2.patch","issue_url":"https://api.github.com/repos/blindpirate/bot-test/issues/2","number":2,"state":"open","locked":false,"title":"Update README.md","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"body":"","created_at":"2020-09-17T12:43:41Z","updated_at":"2020-09-17T12:43:41Z","closed_at":null,"merged_at":null,"merge_commit_sha":null,"assignee":null,"assignees":[],"requested_reviewers":[],"requested_teams":[],"labels":[],"milestone":null,"draft":false,"commits_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits","review_comments_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments","review_comment_url":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2","head":{"label":"blindpirate:blindpirate-patch-1","ref":"blindpirate-patch-1","sha":"481756348e34daf8528593137deb06d400dbd5c2","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}},"base":{"label":"blindpirate:master","ref":"master","sha":"6798e2ed5899df42bc7096305cef05ea93fb937d","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}},"_links":{"self":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2"},"html":{"href":"https://github.com/blindpirate/bot-test/pull/2"},"issue":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2"},"comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments"},"review_comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments"},"review_comment":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}"},"commits":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits"},"statuses":{"href":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2"}},"author_association":"OWNER","active_lock_reason":null,"merged":false,"mergeable":null,"rebaseable":null,"mergeable_state":"unknown","merged_by":null,"comments":0,"review_comments":0,"maintainer_can_modify":false,"commits":1,"additions":1,"deletions":0,"changed_files":1}
     * repository : {"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master"}
     * sender : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
     */

    private String action;
    private int number;
    private PullRequestBean pull_request;
    private RepositoryBean repository;
    private SenderBean sender;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public PullRequestBean getPull_request() {
        return pull_request;
    }

    public void setPull_request(PullRequestBean pull_request) {
        this.pull_request = pull_request;
    }

    public RepositoryBean getRepository() {
        return repository;
    }

    public void setRepository(RepositoryBean repository) {
        this.repository = repository;
    }

    public SenderBean getSender() {
        return sender;
    }

    public void setSender(SenderBean sender) {
        this.sender = sender;
    }

    public static class PullRequestBean {
        /**
         * url : https://api.github.com/repos/blindpirate/bot-test/pulls/2
         * id : 488641088
         * node_id : MDExOlB1bGxSZXF1ZXN0NDg4NjQxMDg4
         * html_url : https://github.com/blindpirate/bot-test/pull/2
         * diff_url : https://github.com/blindpirate/bot-test/pull/2.diff
         * patch_url : https://github.com/blindpirate/bot-test/pull/2.patch
         * issue_url : https://api.github.com/repos/blindpirate/bot-test/issues/2
         * number : 2
         * state : open
         * locked : false
         * title : Update README.md
         * user : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
         * body :
         * created_at : 2020-09-17T12:43:41Z
         * updated_at : 2020-09-17T12:43:41Z
         * closed_at : null
         * merged_at : null
         * merge_commit_sha : null
         * assignee : null
         * assignees : []
         * requested_reviewers : []
         * requested_teams : []
         * labels : []
         * milestone : null
         * draft : false
         * commits_url : https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits
         * review_comments_url : https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments
         * review_comment_url : https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}
         * comments_url : https://api.github.com/repos/blindpirate/bot-test/issues/2/comments
         * statuses_url : https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2
         * head : {"label":"blindpirate:blindpirate-patch-1","ref":"blindpirate-patch-1","sha":"481756348e34daf8528593137deb06d400dbd5c2","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}}
         * base : {"label":"blindpirate:master","ref":"master","sha":"6798e2ed5899df42bc7096305cef05ea93fb937d","user":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"repo":{"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}}
         * _links : {"self":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2"},"html":{"href":"https://github.com/blindpirate/bot-test/pull/2"},"issue":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2"},"comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments"},"review_comments":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments"},"review_comment":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}"},"commits":{"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits"},"statuses":{"href":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2"}}
         * author_association : OWNER
         * active_lock_reason : null
         * merged : false
         * mergeable : null
         * rebaseable : null
         * mergeable_state : unknown
         * merged_by : null
         * comments : 0
         * review_comments : 0
         * maintainer_can_modify : false
         * commits : 1
         * additions : 1
         * deletions : 0
         * changed_files : 1
         */

        private String url;
        private int id;
        private String node_id;
        private String html_url;
        private String diff_url;
        private String patch_url;
        private String issue_url;
        private int number;
        private String state;
        private boolean locked;
        private String title;
        private UserBean user;
        private String body;
        private String created_at;
        private String updated_at;
        private Object closed_at;
        private Object merged_at;
        private Object merge_commit_sha;
        private Object assignee;
        private Object milestone;
        private boolean draft;
        private String commits_url;
        private String review_comments_url;
        private String review_comment_url;
        private String comments_url;
        private String statuses_url;
        private HeadBean head;
        private BaseBean base;
        private LinksBean _links;
        private String author_association;
        private Object active_lock_reason;
        private boolean merged;
        private Object mergeable;
        private Object rebaseable;
        private String mergeable_state;
        private Object merged_by;
        private int comments;
        private int review_comments;
        private boolean maintainer_can_modify;
        private int commits;
        private int additions;
        private int deletions;
        private int changed_files;
        private List<?> assignees;
        private List<?> requested_reviewers;
        private List<?> requested_teams;
        private List<?> labels;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getDiff_url() {
            return diff_url;
        }

        public void setDiff_url(String diff_url) {
            this.diff_url = diff_url;
        }

        public String getPatch_url() {
            return patch_url;
        }

        public void setPatch_url(String patch_url) {
            this.patch_url = patch_url;
        }

        public String getIssue_url() {
            return issue_url;
        }

        public void setIssue_url(String issue_url) {
            this.issue_url = issue_url;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public boolean isLocked() {
            return locked;
        }

        public void setLocked(boolean locked) {
            this.locked = locked;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public Object getClosed_at() {
            return closed_at;
        }

        public void setClosed_at(Object closed_at) {
            this.closed_at = closed_at;
        }

        public Object getMerged_at() {
            return merged_at;
        }

        public void setMerged_at(Object merged_at) {
            this.merged_at = merged_at;
        }

        public Object getMerge_commit_sha() {
            return merge_commit_sha;
        }

        public void setMerge_commit_sha(Object merge_commit_sha) {
            this.merge_commit_sha = merge_commit_sha;
        }

        public Object getAssignee() {
            return assignee;
        }

        public void setAssignee(Object assignee) {
            this.assignee = assignee;
        }

        public Object getMilestone() {
            return milestone;
        }

        public void setMilestone(Object milestone) {
            this.milestone = milestone;
        }

        public boolean isDraft() {
            return draft;
        }

        public void setDraft(boolean draft) {
            this.draft = draft;
        }

        public String getCommits_url() {
            return commits_url;
        }

        public void setCommits_url(String commits_url) {
            this.commits_url = commits_url;
        }

        public String getReview_comments_url() {
            return review_comments_url;
        }

        public void setReview_comments_url(String review_comments_url) {
            this.review_comments_url = review_comments_url;
        }

        public String getReview_comment_url() {
            return review_comment_url;
        }

        public void setReview_comment_url(String review_comment_url) {
            this.review_comment_url = review_comment_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public String getStatuses_url() {
            return statuses_url;
        }

        public void setStatuses_url(String statuses_url) {
            this.statuses_url = statuses_url;
        }

        public HeadBean getHead() {
            return head;
        }

        public void setHead(HeadBean head) {
            this.head = head;
        }

        public BaseBean getBase() {
            return base;
        }

        public void setBase(BaseBean base) {
            this.base = base;
        }

        public LinksBean get_links() {
            return _links;
        }

        public void set_links(LinksBean _links) {
            this._links = _links;
        }

        public String getAuthor_association() {
            return author_association;
        }

        public void setAuthor_association(String author_association) {
            this.author_association = author_association;
        }

        public Object getActive_lock_reason() {
            return active_lock_reason;
        }

        public void setActive_lock_reason(Object active_lock_reason) {
            this.active_lock_reason = active_lock_reason;
        }

        public boolean isMerged() {
            return merged;
        }

        public void setMerged(boolean merged) {
            this.merged = merged;
        }

        public Object getMergeable() {
            return mergeable;
        }

        public void setMergeable(Object mergeable) {
            this.mergeable = mergeable;
        }

        public Object getRebaseable() {
            return rebaseable;
        }

        public void setRebaseable(Object rebaseable) {
            this.rebaseable = rebaseable;
        }

        public String getMergeable_state() {
            return mergeable_state;
        }

        public void setMergeable_state(String mergeable_state) {
            this.mergeable_state = mergeable_state;
        }

        public Object getMerged_by() {
            return merged_by;
        }

        public void setMerged_by(Object merged_by) {
            this.merged_by = merged_by;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
        }

        public int getReview_comments() {
            return review_comments;
        }

        public void setReview_comments(int review_comments) {
            this.review_comments = review_comments;
        }

        public boolean isMaintainer_can_modify() {
            return maintainer_can_modify;
        }

        public void setMaintainer_can_modify(boolean maintainer_can_modify) {
            this.maintainer_can_modify = maintainer_can_modify;
        }

        public int getCommits() {
            return commits;
        }

        public void setCommits(int commits) {
            this.commits = commits;
        }

        public int getAdditions() {
            return additions;
        }

        public void setAdditions(int additions) {
            this.additions = additions;
        }

        public int getDeletions() {
            return deletions;
        }

        public void setDeletions(int deletions) {
            this.deletions = deletions;
        }

        public int getChanged_files() {
            return changed_files;
        }

        public void setChanged_files(int changed_files) {
            this.changed_files = changed_files;
        }

        public List<?> getAssignees() {
            return assignees;
        }

        public void setAssignees(List<?> assignees) {
            this.assignees = assignees;
        }

        public List<?> getRequested_reviewers() {
            return requested_reviewers;
        }

        public void setRequested_reviewers(List<?> requested_reviewers) {
            this.requested_reviewers = requested_reviewers;
        }

        public List<?> getRequested_teams() {
            return requested_teams;
        }

        public void setRequested_teams(List<?> requested_teams) {
            this.requested_teams = requested_teams;
        }

        public List<?> getLabels() {
            return labels;
        }

        public void setLabels(List<?> labels) {
            this.labels = labels;
        }

        public static class UserBean {
            /**
             * login : blindpirate
             * id : 12689835
             * node_id : MDQ6VXNlcjEyNjg5ODM1
             * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
             * gravatar_id :
             * url : https://api.github.com/users/blindpirate
             * html_url : https://github.com/blindpirate
             * followers_url : https://api.github.com/users/blindpirate/followers
             * following_url : https://api.github.com/users/blindpirate/following{/other_user}
             * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
             * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
             * organizations_url : https://api.github.com/users/blindpirate/orgs
             * repos_url : https://api.github.com/users/blindpirate/repos
             * events_url : https://api.github.com/users/blindpirate/events{/privacy}
             * received_events_url : https://api.github.com/users/blindpirate/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }

        public static class HeadBean {
            /**
             * label : blindpirate:blindpirate-patch-1
             * ref : blindpirate-patch-1
             * sha : 481756348e34daf8528593137deb06d400dbd5c2
             * user : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
             * repo : {"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}
             */

            private String label;
            private String ref;
            private String sha;
            private UserBeanX user;
            private RepoBean repo;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getRef() {
                return ref;
            }

            public void setRef(String ref) {
                this.ref = ref;
            }

            public String getSha() {
                return sha;
            }

            public void setSha(String sha) {
                this.sha = sha;
            }

            public UserBeanX getUser() {
                return user;
            }

            public void setUser(UserBeanX user) {
                this.user = user;
            }

            public RepoBean getRepo() {
                return repo;
            }

            public void setRepo(RepoBean repo) {
                this.repo = repo;
            }

            public static class UserBeanX {
                /**
                 * login : blindpirate
                 * id : 12689835
                 * node_id : MDQ6VXNlcjEyNjg5ODM1
                 * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
                 * gravatar_id :
                 * url : https://api.github.com/users/blindpirate
                 * html_url : https://github.com/blindpirate
                 * followers_url : https://api.github.com/users/blindpirate/followers
                 * following_url : https://api.github.com/users/blindpirate/following{/other_user}
                 * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
                 * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
                 * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
                 * organizations_url : https://api.github.com/users/blindpirate/orgs
                 * repos_url : https://api.github.com/users/blindpirate/repos
                 * events_url : https://api.github.com/users/blindpirate/events{/privacy}
                 * received_events_url : https://api.github.com/users/blindpirate/received_events
                 * type : User
                 * site_admin : false
                 */

                private String login;
                private int id;
                private String node_id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }

            @JsonIgnoreProperties
            public static class RepoBean {
                /**
                 * id : 296313786
                 * node_id : MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=
                 * name : bot-test
                 * full_name : blindpirate/bot-test
                 * private : false
                 * owner : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
                 * html_url : https://github.com/blindpirate/bot-test
                 * description : null
                 * fork : false
                 * url : https://api.github.com/repos/blindpirate/bot-test
                 * forks_url : https://api.github.com/repos/blindpirate/bot-test/forks
                 * keys_url : https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}
                 * collaborators_url : https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}
                 * teams_url : https://api.github.com/repos/blindpirate/bot-test/teams
                 * hooks_url : https://api.github.com/repos/blindpirate/bot-test/hooks
                 * issue_events_url : https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}
                 * events_url : https://api.github.com/repos/blindpirate/bot-test/events
                 * assignees_url : https://api.github.com/repos/blindpirate/bot-test/assignees{/user}
                 * branches_url : https://api.github.com/repos/blindpirate/bot-test/branches{/branch}
                 * tags_url : https://api.github.com/repos/blindpirate/bot-test/tags
                 * blobs_url : https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}
                 * git_tags_url : https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}
                 * git_refs_url : https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}
                 * trees_url : https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}
                 * statuses_url : https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}
                 * languages_url : https://api.github.com/repos/blindpirate/bot-test/languages
                 * stargazers_url : https://api.github.com/repos/blindpirate/bot-test/stargazers
                 * contributors_url : https://api.github.com/repos/blindpirate/bot-test/contributors
                 * subscribers_url : https://api.github.com/repos/blindpirate/bot-test/subscribers
                 * subscription_url : https://api.github.com/repos/blindpirate/bot-test/subscription
                 * commits_url : https://api.github.com/repos/blindpirate/bot-test/commits{/sha}
                 * git_commits_url : https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}
                 * comments_url : https://api.github.com/repos/blindpirate/bot-test/comments{/number}
                 * issue_comment_url : https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}
                 * contents_url : https://api.github.com/repos/blindpirate/bot-test/contents/{+path}
                 * compare_url : https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}
                 * merges_url : https://api.github.com/repos/blindpirate/bot-test/merges
                 * archive_url : https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}
                 * downloads_url : https://api.github.com/repos/blindpirate/bot-test/downloads
                 * issues_url : https://api.github.com/repos/blindpirate/bot-test/issues{/number}
                 * pulls_url : https://api.github.com/repos/blindpirate/bot-test/pulls{/number}
                 * milestones_url : https://api.github.com/repos/blindpirate/bot-test/milestones{/number}
                 * notifications_url : https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}
                 * labels_url : https://api.github.com/repos/blindpirate/bot-test/labels{/name}
                 * releases_url : https://api.github.com/repos/blindpirate/bot-test/releases{/id}
                 * deployments_url : https://api.github.com/repos/blindpirate/bot-test/deployments
                 * created_at : 2020-09-17T12:03:01Z
                 * updated_at : 2020-09-17T12:41:40Z
                 * pushed_at : 2020-09-17T12:43:36Z
                 * git_url : git://github.com/blindpirate/bot-test.git
                 * ssh_url : git@github.com:blindpirate/bot-test.git
                 * clone_url : https://github.com/blindpirate/bot-test.git
                 * svn_url : https://github.com/blindpirate/bot-test
                 * homepage : null
                 * size : 0
                 * stargazers_count : 0
                 * watchers_count : 0
                 * language : Java
                 * has_issues : true
                 * has_projects : true
                 * has_downloads : true
                 * has_wiki : true
                 * has_pages : false
                 * forks_count : 0
                 * mirror_url : null
                 * archived : false
                 * disabled : false
                 * open_issues_count : 2
                 * license : null
                 * forks : 0
                 * open_issues : 2
                 * watchers : 0
                 * default_branch : master
                 * allow_squash_merge : true
                 * allow_merge_commit : true
                 * allow_rebase_merge : true
                 * delete_branch_on_merge : false
                 */

                private int id;
                private String node_id;
                private String name;
                private String full_name;
                private boolean privateX;
                private OwnerBean owner;
                private String html_url;
                private Object description;
                private boolean fork;
                private String url;
                private String forks_url;
                private String keys_url;
                private String collaborators_url;
                private String teams_url;
                private String hooks_url;
                private String issue_events_url;
                private String events_url;
                private String assignees_url;
                private String branches_url;
                private String tags_url;
                private String blobs_url;
                private String git_tags_url;
                private String git_refs_url;
                private String trees_url;
                private String statuses_url;
                private String languages_url;
                private String stargazers_url;
                private String contributors_url;
                private String subscribers_url;
                private String subscription_url;
                private String commits_url;
                private String git_commits_url;
                private String comments_url;
                private String issue_comment_url;
                private String contents_url;
                private String compare_url;
                private String merges_url;
                private String archive_url;
                private String downloads_url;
                private String issues_url;
                private String pulls_url;
                private String milestones_url;
                private String notifications_url;
                private String labels_url;
                private String releases_url;
                private String deployments_url;
                private String created_at;
                private String updated_at;
                private String pushed_at;
                private String git_url;
                private String ssh_url;
                private String clone_url;
                private String svn_url;
                private Object homepage;
                private int size;
                private int stargazers_count;
                private int watchers_count;
                private String language;
                private boolean has_issues;
                private boolean has_projects;
                private boolean has_downloads;
                private boolean has_wiki;
                private boolean has_pages;
                private int forks_count;
                private Object mirror_url;
                private boolean archived;
                private boolean disabled;
                private int open_issues_count;
                private Object license;
                private int forks;
                private int open_issues;
                private int watchers;
                private String default_branch;
                private boolean allow_squash_merge;
                private boolean allow_merge_commit;
                private boolean allow_rebase_merge;
                private boolean delete_branch_on_merge;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getFull_name() {
                    return full_name;
                }

                public void setFull_name(String full_name) {
                    this.full_name = full_name;
                }

                public boolean isPrivateX() {
                    return privateX;
                }

                public void setPrivateX(boolean privateX) {
                    this.privateX = privateX;
                }

                public OwnerBean getOwner() {
                    return owner;
                }

                public void setOwner(OwnerBean owner) {
                    this.owner = owner;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public boolean isFork() {
                    return fork;
                }

                public void setFork(boolean fork) {
                    this.fork = fork;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getForks_url() {
                    return forks_url;
                }

                public void setForks_url(String forks_url) {
                    this.forks_url = forks_url;
                }

                public String getKeys_url() {
                    return keys_url;
                }

                public void setKeys_url(String keys_url) {
                    this.keys_url = keys_url;
                }

                public String getCollaborators_url() {
                    return collaborators_url;
                }

                public void setCollaborators_url(String collaborators_url) {
                    this.collaborators_url = collaborators_url;
                }

                public String getTeams_url() {
                    return teams_url;
                }

                public void setTeams_url(String teams_url) {
                    this.teams_url = teams_url;
                }

                public String getHooks_url() {
                    return hooks_url;
                }

                public void setHooks_url(String hooks_url) {
                    this.hooks_url = hooks_url;
                }

                public String getIssue_events_url() {
                    return issue_events_url;
                }

                public void setIssue_events_url(String issue_events_url) {
                    this.issue_events_url = issue_events_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getAssignees_url() {
                    return assignees_url;
                }

                public void setAssignees_url(String assignees_url) {
                    this.assignees_url = assignees_url;
                }

                public String getBranches_url() {
                    return branches_url;
                }

                public void setBranches_url(String branches_url) {
                    this.branches_url = branches_url;
                }

                public String getTags_url() {
                    return tags_url;
                }

                public void setTags_url(String tags_url) {
                    this.tags_url = tags_url;
                }

                public String getBlobs_url() {
                    return blobs_url;
                }

                public void setBlobs_url(String blobs_url) {
                    this.blobs_url = blobs_url;
                }

                public String getGit_tags_url() {
                    return git_tags_url;
                }

                public void setGit_tags_url(String git_tags_url) {
                    this.git_tags_url = git_tags_url;
                }

                public String getGit_refs_url() {
                    return git_refs_url;
                }

                public void setGit_refs_url(String git_refs_url) {
                    this.git_refs_url = git_refs_url;
                }

                public String getTrees_url() {
                    return trees_url;
                }

                public void setTrees_url(String trees_url) {
                    this.trees_url = trees_url;
                }

                public String getStatuses_url() {
                    return statuses_url;
                }

                public void setStatuses_url(String statuses_url) {
                    this.statuses_url = statuses_url;
                }

                public String getLanguages_url() {
                    return languages_url;
                }

                public void setLanguages_url(String languages_url) {
                    this.languages_url = languages_url;
                }

                public String getStargazers_url() {
                    return stargazers_url;
                }

                public void setStargazers_url(String stargazers_url) {
                    this.stargazers_url = stargazers_url;
                }

                public String getContributors_url() {
                    return contributors_url;
                }

                public void setContributors_url(String contributors_url) {
                    this.contributors_url = contributors_url;
                }

                public String getSubscribers_url() {
                    return subscribers_url;
                }

                public void setSubscribers_url(String subscribers_url) {
                    this.subscribers_url = subscribers_url;
                }

                public String getSubscription_url() {
                    return subscription_url;
                }

                public void setSubscription_url(String subscription_url) {
                    this.subscription_url = subscription_url;
                }

                public String getCommits_url() {
                    return commits_url;
                }

                public void setCommits_url(String commits_url) {
                    this.commits_url = commits_url;
                }

                public String getGit_commits_url() {
                    return git_commits_url;
                }

                public void setGit_commits_url(String git_commits_url) {
                    this.git_commits_url = git_commits_url;
                }

                public String getComments_url() {
                    return comments_url;
                }

                public void setComments_url(String comments_url) {
                    this.comments_url = comments_url;
                }

                public String getIssue_comment_url() {
                    return issue_comment_url;
                }

                public void setIssue_comment_url(String issue_comment_url) {
                    this.issue_comment_url = issue_comment_url;
                }

                public String getContents_url() {
                    return contents_url;
                }

                public void setContents_url(String contents_url) {
                    this.contents_url = contents_url;
                }

                public String getCompare_url() {
                    return compare_url;
                }

                public void setCompare_url(String compare_url) {
                    this.compare_url = compare_url;
                }

                public String getMerges_url() {
                    return merges_url;
                }

                public void setMerges_url(String merges_url) {
                    this.merges_url = merges_url;
                }

                public String getArchive_url() {
                    return archive_url;
                }

                public void setArchive_url(String archive_url) {
                    this.archive_url = archive_url;
                }

                public String getDownloads_url() {
                    return downloads_url;
                }

                public void setDownloads_url(String downloads_url) {
                    this.downloads_url = downloads_url;
                }

                public String getIssues_url() {
                    return issues_url;
                }

                public void setIssues_url(String issues_url) {
                    this.issues_url = issues_url;
                }

                public String getPulls_url() {
                    return pulls_url;
                }

                public void setPulls_url(String pulls_url) {
                    this.pulls_url = pulls_url;
                }

                public String getMilestones_url() {
                    return milestones_url;
                }

                public void setMilestones_url(String milestones_url) {
                    this.milestones_url = milestones_url;
                }

                public String getNotifications_url() {
                    return notifications_url;
                }

                public void setNotifications_url(String notifications_url) {
                    this.notifications_url = notifications_url;
                }

                public String getLabels_url() {
                    return labels_url;
                }

                public void setLabels_url(String labels_url) {
                    this.labels_url = labels_url;
                }

                public String getReleases_url() {
                    return releases_url;
                }

                public void setReleases_url(String releases_url) {
                    this.releases_url = releases_url;
                }

                public String getDeployments_url() {
                    return deployments_url;
                }

                public void setDeployments_url(String deployments_url) {
                    this.deployments_url = deployments_url;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public String getPushed_at() {
                    return pushed_at;
                }

                public void setPushed_at(String pushed_at) {
                    this.pushed_at = pushed_at;
                }

                public String getGit_url() {
                    return git_url;
                }

                public void setGit_url(String git_url) {
                    this.git_url = git_url;
                }

                public String getSsh_url() {
                    return ssh_url;
                }

                public void setSsh_url(String ssh_url) {
                    this.ssh_url = ssh_url;
                }

                public String getClone_url() {
                    return clone_url;
                }

                public void setClone_url(String clone_url) {
                    this.clone_url = clone_url;
                }

                public String getSvn_url() {
                    return svn_url;
                }

                public void setSvn_url(String svn_url) {
                    this.svn_url = svn_url;
                }

                public Object getHomepage() {
                    return homepage;
                }

                public void setHomepage(Object homepage) {
                    this.homepage = homepage;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getStargazers_count() {
                    return stargazers_count;
                }

                public void setStargazers_count(int stargazers_count) {
                    this.stargazers_count = stargazers_count;
                }

                public int getWatchers_count() {
                    return watchers_count;
                }

                public void setWatchers_count(int watchers_count) {
                    this.watchers_count = watchers_count;
                }

                public String getLanguage() {
                    return language;
                }

                public void setLanguage(String language) {
                    this.language = language;
                }

                public boolean isHas_issues() {
                    return has_issues;
                }

                public void setHas_issues(boolean has_issues) {
                    this.has_issues = has_issues;
                }

                public boolean isHas_projects() {
                    return has_projects;
                }

                public void setHas_projects(boolean has_projects) {
                    this.has_projects = has_projects;
                }

                public boolean isHas_downloads() {
                    return has_downloads;
                }

                public void setHas_downloads(boolean has_downloads) {
                    this.has_downloads = has_downloads;
                }

                public boolean isHas_wiki() {
                    return has_wiki;
                }

                public void setHas_wiki(boolean has_wiki) {
                    this.has_wiki = has_wiki;
                }

                public boolean isHas_pages() {
                    return has_pages;
                }

                public void setHas_pages(boolean has_pages) {
                    this.has_pages = has_pages;
                }

                public int getForks_count() {
                    return forks_count;
                }

                public void setForks_count(int forks_count) {
                    this.forks_count = forks_count;
                }

                public Object getMirror_url() {
                    return mirror_url;
                }

                public void setMirror_url(Object mirror_url) {
                    this.mirror_url = mirror_url;
                }

                public boolean isArchived() {
                    return archived;
                }

                public void setArchived(boolean archived) {
                    this.archived = archived;
                }

                public boolean isDisabled() {
                    return disabled;
                }

                public void setDisabled(boolean disabled) {
                    this.disabled = disabled;
                }

                public int getOpen_issues_count() {
                    return open_issues_count;
                }

                public void setOpen_issues_count(int open_issues_count) {
                    this.open_issues_count = open_issues_count;
                }

                public Object getLicense() {
                    return license;
                }

                public void setLicense(Object license) {
                    this.license = license;
                }

                public int getForks() {
                    return forks;
                }

                public void setForks(int forks) {
                    this.forks = forks;
                }

                public int getOpen_issues() {
                    return open_issues;
                }

                public void setOpen_issues(int open_issues) {
                    this.open_issues = open_issues;
                }

                public int getWatchers() {
                    return watchers;
                }

                public void setWatchers(int watchers) {
                    this.watchers = watchers;
                }

                public String getDefault_branch() {
                    return default_branch;
                }

                public void setDefault_branch(String default_branch) {
                    this.default_branch = default_branch;
                }

                public boolean isAllow_squash_merge() {
                    return allow_squash_merge;
                }

                public void setAllow_squash_merge(boolean allow_squash_merge) {
                    this.allow_squash_merge = allow_squash_merge;
                }

                public boolean isAllow_merge_commit() {
                    return allow_merge_commit;
                }

                public void setAllow_merge_commit(boolean allow_merge_commit) {
                    this.allow_merge_commit = allow_merge_commit;
                }

                public boolean isAllow_rebase_merge() {
                    return allow_rebase_merge;
                }

                public void setAllow_rebase_merge(boolean allow_rebase_merge) {
                    this.allow_rebase_merge = allow_rebase_merge;
                }

                public boolean isDelete_branch_on_merge() {
                    return delete_branch_on_merge;
                }

                public void setDelete_branch_on_merge(boolean delete_branch_on_merge) {
                    this.delete_branch_on_merge = delete_branch_on_merge;
                }

                public static class OwnerBean {
                    /**
                     * login : blindpirate
                     * id : 12689835
                     * node_id : MDQ6VXNlcjEyNjg5ODM1
                     * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
                     * gravatar_id :
                     * url : https://api.github.com/users/blindpirate
                     * html_url : https://github.com/blindpirate
                     * followers_url : https://api.github.com/users/blindpirate/followers
                     * following_url : https://api.github.com/users/blindpirate/following{/other_user}
                     * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
                     * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
                     * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
                     * organizations_url : https://api.github.com/users/blindpirate/orgs
                     * repos_url : https://api.github.com/users/blindpirate/repos
                     * events_url : https://api.github.com/users/blindpirate/events{/privacy}
                     * received_events_url : https://api.github.com/users/blindpirate/received_events
                     * type : User
                     * site_admin : false
                     */

                    private String login;
                    private int id;
                    private String node_id;
                    private String avatar_url;
                    private String gravatar_id;
                    private String url;
                    private String html_url;
                    private String followers_url;
                    private String following_url;
                    private String gists_url;
                    private String starred_url;
                    private String subscriptions_url;
                    private String organizations_url;
                    private String repos_url;
                    private String events_url;
                    private String received_events_url;
                    private String type;
                    private boolean site_admin;

                    public String getLogin() {
                        return login;
                    }

                    public void setLogin(String login) {
                        this.login = login;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getNode_id() {
                        return node_id;
                    }

                    public void setNode_id(String node_id) {
                        this.node_id = node_id;
                    }

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public String getGravatar_id() {
                        return gravatar_id;
                    }

                    public void setGravatar_id(String gravatar_id) {
                        this.gravatar_id = gravatar_id;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getHtml_url() {
                        return html_url;
                    }

                    public void setHtml_url(String html_url) {
                        this.html_url = html_url;
                    }

                    public String getFollowers_url() {
                        return followers_url;
                    }

                    public void setFollowers_url(String followers_url) {
                        this.followers_url = followers_url;
                    }

                    public String getFollowing_url() {
                        return following_url;
                    }

                    public void setFollowing_url(String following_url) {
                        this.following_url = following_url;
                    }

                    public String getGists_url() {
                        return gists_url;
                    }

                    public void setGists_url(String gists_url) {
                        this.gists_url = gists_url;
                    }

                    public String getStarred_url() {
                        return starred_url;
                    }

                    public void setStarred_url(String starred_url) {
                        this.starred_url = starred_url;
                    }

                    public String getSubscriptions_url() {
                        return subscriptions_url;
                    }

                    public void setSubscriptions_url(String subscriptions_url) {
                        this.subscriptions_url = subscriptions_url;
                    }

                    public String getOrganizations_url() {
                        return organizations_url;
                    }

                    public void setOrganizations_url(String organizations_url) {
                        this.organizations_url = organizations_url;
                    }

                    public String getRepos_url() {
                        return repos_url;
                    }

                    public void setRepos_url(String repos_url) {
                        this.repos_url = repos_url;
                    }

                    public String getEvents_url() {
                        return events_url;
                    }

                    public void setEvents_url(String events_url) {
                        this.events_url = events_url;
                    }

                    public String getReceived_events_url() {
                        return received_events_url;
                    }

                    public void setReceived_events_url(String received_events_url) {
                        this.received_events_url = received_events_url;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isSite_admin() {
                        return site_admin;
                    }

                    public void setSite_admin(boolean site_admin) {
                        this.site_admin = site_admin;
                    }
                }
            }
        }

        public static class BaseBean {
            /**
             * label : blindpirate:master
             * ref : master
             * sha : 6798e2ed5899df42bc7096305cef05ea93fb937d
             * user : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
             * repo : {"id":296313786,"node_id":"MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=","name":"bot-test","full_name":"blindpirate/bot-test","private":false,"owner":{"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false},"html_url":"https://github.com/blindpirate/bot-test","description":null,"fork":false,"url":"https://api.github.com/repos/blindpirate/bot-test","forks_url":"https://api.github.com/repos/blindpirate/bot-test/forks","keys_url":"https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}","collaborators_url":"https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/blindpirate/bot-test/teams","hooks_url":"https://api.github.com/repos/blindpirate/bot-test/hooks","issue_events_url":"https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}","events_url":"https://api.github.com/repos/blindpirate/bot-test/events","assignees_url":"https://api.github.com/repos/blindpirate/bot-test/assignees{/user}","branches_url":"https://api.github.com/repos/blindpirate/bot-test/branches{/branch}","tags_url":"https://api.github.com/repos/blindpirate/bot-test/tags","blobs_url":"https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}","trees_url":"https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}","statuses_url":"https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}","languages_url":"https://api.github.com/repos/blindpirate/bot-test/languages","stargazers_url":"https://api.github.com/repos/blindpirate/bot-test/stargazers","contributors_url":"https://api.github.com/repos/blindpirate/bot-test/contributors","subscribers_url":"https://api.github.com/repos/blindpirate/bot-test/subscribers","subscription_url":"https://api.github.com/repos/blindpirate/bot-test/subscription","commits_url":"https://api.github.com/repos/blindpirate/bot-test/commits{/sha}","git_commits_url":"https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}","comments_url":"https://api.github.com/repos/blindpirate/bot-test/comments{/number}","issue_comment_url":"https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}","contents_url":"https://api.github.com/repos/blindpirate/bot-test/contents/{+path}","compare_url":"https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}","merges_url":"https://api.github.com/repos/blindpirate/bot-test/merges","archive_url":"https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/blindpirate/bot-test/downloads","issues_url":"https://api.github.com/repos/blindpirate/bot-test/issues{/number}","pulls_url":"https://api.github.com/repos/blindpirate/bot-test/pulls{/number}","milestones_url":"https://api.github.com/repos/blindpirate/bot-test/milestones{/number}","notifications_url":"https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/blindpirate/bot-test/labels{/name}","releases_url":"https://api.github.com/repos/blindpirate/bot-test/releases{/id}","deployments_url":"https://api.github.com/repos/blindpirate/bot-test/deployments","created_at":"2020-09-17T12:03:01Z","updated_at":"2020-09-17T12:41:40Z","pushed_at":"2020-09-17T12:43:36Z","git_url":"git://github.com/blindpirate/bot-test.git","ssh_url":"git@github.com:blindpirate/bot-test.git","clone_url":"https://github.com/blindpirate/bot-test.git","svn_url":"https://github.com/blindpirate/bot-test","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":"Java","has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":false,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":2,"license":null,"forks":0,"open_issues":2,"watchers":0,"default_branch":"master","allow_squash_merge":true,"allow_merge_commit":true,"allow_rebase_merge":true,"delete_branch_on_merge":false}
             */

            private String label;
            private String ref;
            private String sha;
            private UserBeanXX user;
            private RepoBeanX repo;

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public String getRef() {
                return ref;
            }

            public void setRef(String ref) {
                this.ref = ref;
            }

            public String getSha() {
                return sha;
            }

            public void setSha(String sha) {
                this.sha = sha;
            }

            public UserBeanXX getUser() {
                return user;
            }

            public void setUser(UserBeanXX user) {
                this.user = user;
            }

            public RepoBeanX getRepo() {
                return repo;
            }

            public void setRepo(RepoBeanX repo) {
                this.repo = repo;
            }

            public static class UserBeanXX {
                /**
                 * login : blindpirate
                 * id : 12689835
                 * node_id : MDQ6VXNlcjEyNjg5ODM1
                 * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
                 * gravatar_id :
                 * url : https://api.github.com/users/blindpirate
                 * html_url : https://github.com/blindpirate
                 * followers_url : https://api.github.com/users/blindpirate/followers
                 * following_url : https://api.github.com/users/blindpirate/following{/other_user}
                 * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
                 * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
                 * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
                 * organizations_url : https://api.github.com/users/blindpirate/orgs
                 * repos_url : https://api.github.com/users/blindpirate/repos
                 * events_url : https://api.github.com/users/blindpirate/events{/privacy}
                 * received_events_url : https://api.github.com/users/blindpirate/received_events
                 * type : User
                 * site_admin : false
                 */

                private String login;
                private int id;
                private String node_id;
                private String avatar_url;
                private String gravatar_id;
                private String url;
                private String html_url;
                private String followers_url;
                private String following_url;
                private String gists_url;
                private String starred_url;
                private String subscriptions_url;
                private String organizations_url;
                private String repos_url;
                private String events_url;
                private String received_events_url;
                private String type;
                private boolean site_admin;

                public String getLogin() {
                    return login;
                }

                public void setLogin(String login) {
                    this.login = login;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getGravatar_id() {
                    return gravatar_id;
                }

                public void setGravatar_id(String gravatar_id) {
                    this.gravatar_id = gravatar_id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public String getFollowers_url() {
                    return followers_url;
                }

                public void setFollowers_url(String followers_url) {
                    this.followers_url = followers_url;
                }

                public String getFollowing_url() {
                    return following_url;
                }

                public void setFollowing_url(String following_url) {
                    this.following_url = following_url;
                }

                public String getGists_url() {
                    return gists_url;
                }

                public void setGists_url(String gists_url) {
                    this.gists_url = gists_url;
                }

                public String getStarred_url() {
                    return starred_url;
                }

                public void setStarred_url(String starred_url) {
                    this.starred_url = starred_url;
                }

                public String getSubscriptions_url() {
                    return subscriptions_url;
                }

                public void setSubscriptions_url(String subscriptions_url) {
                    this.subscriptions_url = subscriptions_url;
                }

                public String getOrganizations_url() {
                    return organizations_url;
                }

                public void setOrganizations_url(String organizations_url) {
                    this.organizations_url = organizations_url;
                }

                public String getRepos_url() {
                    return repos_url;
                }

                public void setRepos_url(String repos_url) {
                    this.repos_url = repos_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getReceived_events_url() {
                    return received_events_url;
                }

                public void setReceived_events_url(String received_events_url) {
                    this.received_events_url = received_events_url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public boolean isSite_admin() {
                    return site_admin;
                }

                public void setSite_admin(boolean site_admin) {
                    this.site_admin = site_admin;
                }
            }

            @JsonIgnoreProperties
            public static class RepoBeanX {
                /**
                 * id : 296313786
                 * node_id : MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=
                 * name : bot-test
                 * full_name : blindpirate/bot-test
                 * private : false
                 * owner : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
                 * html_url : https://github.com/blindpirate/bot-test
                 * description : null
                 * fork : false
                 * url : https://api.github.com/repos/blindpirate/bot-test
                 * forks_url : https://api.github.com/repos/blindpirate/bot-test/forks
                 * keys_url : https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}
                 * collaborators_url : https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}
                 * teams_url : https://api.github.com/repos/blindpirate/bot-test/teams
                 * hooks_url : https://api.github.com/repos/blindpirate/bot-test/hooks
                 * issue_events_url : https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}
                 * events_url : https://api.github.com/repos/blindpirate/bot-test/events
                 * assignees_url : https://api.github.com/repos/blindpirate/bot-test/assignees{/user}
                 * branches_url : https://api.github.com/repos/blindpirate/bot-test/branches{/branch}
                 * tags_url : https://api.github.com/repos/blindpirate/bot-test/tags
                 * blobs_url : https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}
                 * git_tags_url : https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}
                 * git_refs_url : https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}
                 * trees_url : https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}
                 * statuses_url : https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}
                 * languages_url : https://api.github.com/repos/blindpirate/bot-test/languages
                 * stargazers_url : https://api.github.com/repos/blindpirate/bot-test/stargazers
                 * contributors_url : https://api.github.com/repos/blindpirate/bot-test/contributors
                 * subscribers_url : https://api.github.com/repos/blindpirate/bot-test/subscribers
                 * subscription_url : https://api.github.com/repos/blindpirate/bot-test/subscription
                 * commits_url : https://api.github.com/repos/blindpirate/bot-test/commits{/sha}
                 * git_commits_url : https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}
                 * comments_url : https://api.github.com/repos/blindpirate/bot-test/comments{/number}
                 * issue_comment_url : https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}
                 * contents_url : https://api.github.com/repos/blindpirate/bot-test/contents/{+path}
                 * compare_url : https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}
                 * merges_url : https://api.github.com/repos/blindpirate/bot-test/merges
                 * archive_url : https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}
                 * downloads_url : https://api.github.com/repos/blindpirate/bot-test/downloads
                 * issues_url : https://api.github.com/repos/blindpirate/bot-test/issues{/number}
                 * pulls_url : https://api.github.com/repos/blindpirate/bot-test/pulls{/number}
                 * milestones_url : https://api.github.com/repos/blindpirate/bot-test/milestones{/number}
                 * notifications_url : https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}
                 * labels_url : https://api.github.com/repos/blindpirate/bot-test/labels{/name}
                 * releases_url : https://api.github.com/repos/blindpirate/bot-test/releases{/id}
                 * deployments_url : https://api.github.com/repos/blindpirate/bot-test/deployments
                 * created_at : 2020-09-17T12:03:01Z
                 * updated_at : 2020-09-17T12:41:40Z
                 * pushed_at : 2020-09-17T12:43:36Z
                 * git_url : git://github.com/blindpirate/bot-test.git
                 * ssh_url : git@github.com:blindpirate/bot-test.git
                 * clone_url : https://github.com/blindpirate/bot-test.git
                 * svn_url : https://github.com/blindpirate/bot-test
                 * homepage : null
                 * size : 0
                 * stargazers_count : 0
                 * watchers_count : 0
                 * language : Java
                 * has_issues : true
                 * has_projects : true
                 * has_downloads : true
                 * has_wiki : true
                 * has_pages : false
                 * forks_count : 0
                 * mirror_url : null
                 * archived : false
                 * disabled : false
                 * open_issues_count : 2
                 * license : null
                 * forks : 0
                 * open_issues : 2
                 * watchers : 0
                 * default_branch : master
                 * allow_squash_merge : true
                 * allow_merge_commit : true
                 * allow_rebase_merge : true
                 * delete_branch_on_merge : false
                 */

                private int id;
                private String node_id;
                private String name;
                private String full_name;
                private boolean privateX;
                private OwnerBeanX owner;
                private String html_url;
                private Object description;
                private boolean fork;
                private String url;
                private String forks_url;
                private String keys_url;
                private String collaborators_url;
                private String teams_url;
                private String hooks_url;
                private String issue_events_url;
                private String events_url;
                private String assignees_url;
                private String branches_url;
                private String tags_url;
                private String blobs_url;
                private String git_tags_url;
                private String git_refs_url;
                private String trees_url;
                private String statuses_url;
                private String languages_url;
                private String stargazers_url;
                private String contributors_url;
                private String subscribers_url;
                private String subscription_url;
                private String commits_url;
                private String git_commits_url;
                private String comments_url;
                private String issue_comment_url;
                private String contents_url;
                private String compare_url;
                private String merges_url;
                private String archive_url;
                private String downloads_url;
                private String issues_url;
                private String pulls_url;
                private String milestones_url;
                private String notifications_url;
                private String labels_url;
                private String releases_url;
                private String deployments_url;
                private String created_at;
                private String updated_at;
                private String pushed_at;
                private String git_url;
                private String ssh_url;
                private String clone_url;
                private String svn_url;
                private Object homepage;
                private int size;
                private int stargazers_count;
                private int watchers_count;
                private String language;
                private boolean has_issues;
                private boolean has_projects;
                private boolean has_downloads;
                private boolean has_wiki;
                private boolean has_pages;
                private int forks_count;
                private Object mirror_url;
                private boolean archived;
                private boolean disabled;
                private int open_issues_count;
                private Object license;
                private int forks;
                private int open_issues;
                private int watchers;
                private String default_branch;
                private boolean allow_squash_merge;
                private boolean allow_merge_commit;
                private boolean allow_rebase_merge;
                private boolean delete_branch_on_merge;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNode_id() {
                    return node_id;
                }

                public void setNode_id(String node_id) {
                    this.node_id = node_id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getFull_name() {
                    return full_name;
                }

                public void setFull_name(String full_name) {
                    this.full_name = full_name;
                }

                public boolean isPrivateX() {
                    return privateX;
                }

                public void setPrivateX(boolean privateX) {
                    this.privateX = privateX;
                }

                public OwnerBeanX getOwner() {
                    return owner;
                }

                public void setOwner(OwnerBeanX owner) {
                    this.owner = owner;
                }

                public String getHtml_url() {
                    return html_url;
                }

                public void setHtml_url(String html_url) {
                    this.html_url = html_url;
                }

                public Object getDescription() {
                    return description;
                }

                public void setDescription(Object description) {
                    this.description = description;
                }

                public boolean isFork() {
                    return fork;
                }

                public void setFork(boolean fork) {
                    this.fork = fork;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getForks_url() {
                    return forks_url;
                }

                public void setForks_url(String forks_url) {
                    this.forks_url = forks_url;
                }

                public String getKeys_url() {
                    return keys_url;
                }

                public void setKeys_url(String keys_url) {
                    this.keys_url = keys_url;
                }

                public String getCollaborators_url() {
                    return collaborators_url;
                }

                public void setCollaborators_url(String collaborators_url) {
                    this.collaborators_url = collaborators_url;
                }

                public String getTeams_url() {
                    return teams_url;
                }

                public void setTeams_url(String teams_url) {
                    this.teams_url = teams_url;
                }

                public String getHooks_url() {
                    return hooks_url;
                }

                public void setHooks_url(String hooks_url) {
                    this.hooks_url = hooks_url;
                }

                public String getIssue_events_url() {
                    return issue_events_url;
                }

                public void setIssue_events_url(String issue_events_url) {
                    this.issue_events_url = issue_events_url;
                }

                public String getEvents_url() {
                    return events_url;
                }

                public void setEvents_url(String events_url) {
                    this.events_url = events_url;
                }

                public String getAssignees_url() {
                    return assignees_url;
                }

                public void setAssignees_url(String assignees_url) {
                    this.assignees_url = assignees_url;
                }

                public String getBranches_url() {
                    return branches_url;
                }

                public void setBranches_url(String branches_url) {
                    this.branches_url = branches_url;
                }

                public String getTags_url() {
                    return tags_url;
                }

                public void setTags_url(String tags_url) {
                    this.tags_url = tags_url;
                }

                public String getBlobs_url() {
                    return blobs_url;
                }

                public void setBlobs_url(String blobs_url) {
                    this.blobs_url = blobs_url;
                }

                public String getGit_tags_url() {
                    return git_tags_url;
                }

                public void setGit_tags_url(String git_tags_url) {
                    this.git_tags_url = git_tags_url;
                }

                public String getGit_refs_url() {
                    return git_refs_url;
                }

                public void setGit_refs_url(String git_refs_url) {
                    this.git_refs_url = git_refs_url;
                }

                public String getTrees_url() {
                    return trees_url;
                }

                public void setTrees_url(String trees_url) {
                    this.trees_url = trees_url;
                }

                public String getStatuses_url() {
                    return statuses_url;
                }

                public void setStatuses_url(String statuses_url) {
                    this.statuses_url = statuses_url;
                }

                public String getLanguages_url() {
                    return languages_url;
                }

                public void setLanguages_url(String languages_url) {
                    this.languages_url = languages_url;
                }

                public String getStargazers_url() {
                    return stargazers_url;
                }

                public void setStargazers_url(String stargazers_url) {
                    this.stargazers_url = stargazers_url;
                }

                public String getContributors_url() {
                    return contributors_url;
                }

                public void setContributors_url(String contributors_url) {
                    this.contributors_url = contributors_url;
                }

                public String getSubscribers_url() {
                    return subscribers_url;
                }

                public void setSubscribers_url(String subscribers_url) {
                    this.subscribers_url = subscribers_url;
                }

                public String getSubscription_url() {
                    return subscription_url;
                }

                public void setSubscription_url(String subscription_url) {
                    this.subscription_url = subscription_url;
                }

                public String getCommits_url() {
                    return commits_url;
                }

                public void setCommits_url(String commits_url) {
                    this.commits_url = commits_url;
                }

                public String getGit_commits_url() {
                    return git_commits_url;
                }

                public void setGit_commits_url(String git_commits_url) {
                    this.git_commits_url = git_commits_url;
                }

                public String getComments_url() {
                    return comments_url;
                }

                public void setComments_url(String comments_url) {
                    this.comments_url = comments_url;
                }

                public String getIssue_comment_url() {
                    return issue_comment_url;
                }

                public void setIssue_comment_url(String issue_comment_url) {
                    this.issue_comment_url = issue_comment_url;
                }

                public String getContents_url() {
                    return contents_url;
                }

                public void setContents_url(String contents_url) {
                    this.contents_url = contents_url;
                }

                public String getCompare_url() {
                    return compare_url;
                }

                public void setCompare_url(String compare_url) {
                    this.compare_url = compare_url;
                }

                public String getMerges_url() {
                    return merges_url;
                }

                public void setMerges_url(String merges_url) {
                    this.merges_url = merges_url;
                }

                public String getArchive_url() {
                    return archive_url;
                }

                public void setArchive_url(String archive_url) {
                    this.archive_url = archive_url;
                }

                public String getDownloads_url() {
                    return downloads_url;
                }

                public void setDownloads_url(String downloads_url) {
                    this.downloads_url = downloads_url;
                }

                public String getIssues_url() {
                    return issues_url;
                }

                public void setIssues_url(String issues_url) {
                    this.issues_url = issues_url;
                }

                public String getPulls_url() {
                    return pulls_url;
                }

                public void setPulls_url(String pulls_url) {
                    this.pulls_url = pulls_url;
                }

                public String getMilestones_url() {
                    return milestones_url;
                }

                public void setMilestones_url(String milestones_url) {
                    this.milestones_url = milestones_url;
                }

                public String getNotifications_url() {
                    return notifications_url;
                }

                public void setNotifications_url(String notifications_url) {
                    this.notifications_url = notifications_url;
                }

                public String getLabels_url() {
                    return labels_url;
                }

                public void setLabels_url(String labels_url) {
                    this.labels_url = labels_url;
                }

                public String getReleases_url() {
                    return releases_url;
                }

                public void setReleases_url(String releases_url) {
                    this.releases_url = releases_url;
                }

                public String getDeployments_url() {
                    return deployments_url;
                }

                public void setDeployments_url(String deployments_url) {
                    this.deployments_url = deployments_url;
                }

                public String getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(String created_at) {
                    this.created_at = created_at;
                }

                public String getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(String updated_at) {
                    this.updated_at = updated_at;
                }

                public String getPushed_at() {
                    return pushed_at;
                }

                public void setPushed_at(String pushed_at) {
                    this.pushed_at = pushed_at;
                }

                public String getGit_url() {
                    return git_url;
                }

                public void setGit_url(String git_url) {
                    this.git_url = git_url;
                }

                public String getSsh_url() {
                    return ssh_url;
                }

                public void setSsh_url(String ssh_url) {
                    this.ssh_url = ssh_url;
                }

                public String getClone_url() {
                    return clone_url;
                }

                public void setClone_url(String clone_url) {
                    this.clone_url = clone_url;
                }

                public String getSvn_url() {
                    return svn_url;
                }

                public void setSvn_url(String svn_url) {
                    this.svn_url = svn_url;
                }

                public Object getHomepage() {
                    return homepage;
                }

                public void setHomepage(Object homepage) {
                    this.homepage = homepage;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getStargazers_count() {
                    return stargazers_count;
                }

                public void setStargazers_count(int stargazers_count) {
                    this.stargazers_count = stargazers_count;
                }

                public int getWatchers_count() {
                    return watchers_count;
                }

                public void setWatchers_count(int watchers_count) {
                    this.watchers_count = watchers_count;
                }

                public String getLanguage() {
                    return language;
                }

                public void setLanguage(String language) {
                    this.language = language;
                }

                public boolean isHas_issues() {
                    return has_issues;
                }

                public void setHas_issues(boolean has_issues) {
                    this.has_issues = has_issues;
                }

                public boolean isHas_projects() {
                    return has_projects;
                }

                public void setHas_projects(boolean has_projects) {
                    this.has_projects = has_projects;
                }

                public boolean isHas_downloads() {
                    return has_downloads;
                }

                public void setHas_downloads(boolean has_downloads) {
                    this.has_downloads = has_downloads;
                }

                public boolean isHas_wiki() {
                    return has_wiki;
                }

                public void setHas_wiki(boolean has_wiki) {
                    this.has_wiki = has_wiki;
                }

                public boolean isHas_pages() {
                    return has_pages;
                }

                public void setHas_pages(boolean has_pages) {
                    this.has_pages = has_pages;
                }

                public int getForks_count() {
                    return forks_count;
                }

                public void setForks_count(int forks_count) {
                    this.forks_count = forks_count;
                }

                public Object getMirror_url() {
                    return mirror_url;
                }

                public void setMirror_url(Object mirror_url) {
                    this.mirror_url = mirror_url;
                }

                public boolean isArchived() {
                    return archived;
                }

                public void setArchived(boolean archived) {
                    this.archived = archived;
                }

                public boolean isDisabled() {
                    return disabled;
                }

                public void setDisabled(boolean disabled) {
                    this.disabled = disabled;
                }

                public int getOpen_issues_count() {
                    return open_issues_count;
                }

                public void setOpen_issues_count(int open_issues_count) {
                    this.open_issues_count = open_issues_count;
                }

                public Object getLicense() {
                    return license;
                }

                public void setLicense(Object license) {
                    this.license = license;
                }

                public int getForks() {
                    return forks;
                }

                public void setForks(int forks) {
                    this.forks = forks;
                }

                public int getOpen_issues() {
                    return open_issues;
                }

                public void setOpen_issues(int open_issues) {
                    this.open_issues = open_issues;
                }

                public int getWatchers() {
                    return watchers;
                }

                public void setWatchers(int watchers) {
                    this.watchers = watchers;
                }

                public String getDefault_branch() {
                    return default_branch;
                }

                public void setDefault_branch(String default_branch) {
                    this.default_branch = default_branch;
                }

                public boolean isAllow_squash_merge() {
                    return allow_squash_merge;
                }

                public void setAllow_squash_merge(boolean allow_squash_merge) {
                    this.allow_squash_merge = allow_squash_merge;
                }

                public boolean isAllow_merge_commit() {
                    return allow_merge_commit;
                }

                public void setAllow_merge_commit(boolean allow_merge_commit) {
                    this.allow_merge_commit = allow_merge_commit;
                }

                public boolean isAllow_rebase_merge() {
                    return allow_rebase_merge;
                }

                public void setAllow_rebase_merge(boolean allow_rebase_merge) {
                    this.allow_rebase_merge = allow_rebase_merge;
                }

                public boolean isDelete_branch_on_merge() {
                    return delete_branch_on_merge;
                }

                public void setDelete_branch_on_merge(boolean delete_branch_on_merge) {
                    this.delete_branch_on_merge = delete_branch_on_merge;
                }

                public static class OwnerBeanX {
                    /**
                     * login : blindpirate
                     * id : 12689835
                     * node_id : MDQ6VXNlcjEyNjg5ODM1
                     * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
                     * gravatar_id :
                     * url : https://api.github.com/users/blindpirate
                     * html_url : https://github.com/blindpirate
                     * followers_url : https://api.github.com/users/blindpirate/followers
                     * following_url : https://api.github.com/users/blindpirate/following{/other_user}
                     * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
                     * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
                     * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
                     * organizations_url : https://api.github.com/users/blindpirate/orgs
                     * repos_url : https://api.github.com/users/blindpirate/repos
                     * events_url : https://api.github.com/users/blindpirate/events{/privacy}
                     * received_events_url : https://api.github.com/users/blindpirate/received_events
                     * type : User
                     * site_admin : false
                     */

                    private String login;
                    private int id;
                    private String node_id;
                    private String avatar_url;
                    private String gravatar_id;
                    private String url;
                    private String html_url;
                    private String followers_url;
                    private String following_url;
                    private String gists_url;
                    private String starred_url;
                    private String subscriptions_url;
                    private String organizations_url;
                    private String repos_url;
                    private String events_url;
                    private String received_events_url;
                    private String type;
                    private boolean site_admin;

                    public String getLogin() {
                        return login;
                    }

                    public void setLogin(String login) {
                        this.login = login;
                    }

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getNode_id() {
                        return node_id;
                    }

                    public void setNode_id(String node_id) {
                        this.node_id = node_id;
                    }

                    public String getAvatar_url() {
                        return avatar_url;
                    }

                    public void setAvatar_url(String avatar_url) {
                        this.avatar_url = avatar_url;
                    }

                    public String getGravatar_id() {
                        return gravatar_id;
                    }

                    public void setGravatar_id(String gravatar_id) {
                        this.gravatar_id = gravatar_id;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public String getHtml_url() {
                        return html_url;
                    }

                    public void setHtml_url(String html_url) {
                        this.html_url = html_url;
                    }

                    public String getFollowers_url() {
                        return followers_url;
                    }

                    public void setFollowers_url(String followers_url) {
                        this.followers_url = followers_url;
                    }

                    public String getFollowing_url() {
                        return following_url;
                    }

                    public void setFollowing_url(String following_url) {
                        this.following_url = following_url;
                    }

                    public String getGists_url() {
                        return gists_url;
                    }

                    public void setGists_url(String gists_url) {
                        this.gists_url = gists_url;
                    }

                    public String getStarred_url() {
                        return starred_url;
                    }

                    public void setStarred_url(String starred_url) {
                        this.starred_url = starred_url;
                    }

                    public String getSubscriptions_url() {
                        return subscriptions_url;
                    }

                    public void setSubscriptions_url(String subscriptions_url) {
                        this.subscriptions_url = subscriptions_url;
                    }

                    public String getOrganizations_url() {
                        return organizations_url;
                    }

                    public void setOrganizations_url(String organizations_url) {
                        this.organizations_url = organizations_url;
                    }

                    public String getRepos_url() {
                        return repos_url;
                    }

                    public void setRepos_url(String repos_url) {
                        this.repos_url = repos_url;
                    }

                    public String getEvents_url() {
                        return events_url;
                    }

                    public void setEvents_url(String events_url) {
                        this.events_url = events_url;
                    }

                    public String getReceived_events_url() {
                        return received_events_url;
                    }

                    public void setReceived_events_url(String received_events_url) {
                        this.received_events_url = received_events_url;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public boolean isSite_admin() {
                        return site_admin;
                    }

                    public void setSite_admin(boolean site_admin) {
                        this.site_admin = site_admin;
                    }
                }
            }
        }

        public static class LinksBean {
            /**
             * self : {"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2"}
             * html : {"href":"https://github.com/blindpirate/bot-test/pull/2"}
             * issue : {"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2"}
             * comments : {"href":"https://api.github.com/repos/blindpirate/bot-test/issues/2/comments"}
             * review_comments : {"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments"}
             * review_comment : {"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}"}
             * commits : {"href":"https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits"}
             * statuses : {"href":"https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2"}
             */

            private SelfBean self;
            private HtmlBean html;
            private IssueBean issue;
            private CommentsBean comments;
            private ReviewCommentsBean review_comments;
            private ReviewCommentBean review_comment;
            private CommitsBean commits;
            private StatusesBean statuses;

            public SelfBean getSelf() {
                return self;
            }

            public void setSelf(SelfBean self) {
                this.self = self;
            }

            public HtmlBean getHtml() {
                return html;
            }

            public void setHtml(HtmlBean html) {
                this.html = html;
            }

            public IssueBean getIssue() {
                return issue;
            }

            public void setIssue(IssueBean issue) {
                this.issue = issue;
            }

            public CommentsBean getComments() {
                return comments;
            }

            public void setComments(CommentsBean comments) {
                this.comments = comments;
            }

            public ReviewCommentsBean getReview_comments() {
                return review_comments;
            }

            public void setReview_comments(ReviewCommentsBean review_comments) {
                this.review_comments = review_comments;
            }

            public ReviewCommentBean getReview_comment() {
                return review_comment;
            }

            public void setReview_comment(ReviewCommentBean review_comment) {
                this.review_comment = review_comment;
            }

            public CommitsBean getCommits() {
                return commits;
            }

            public void setCommits(CommitsBean commits) {
                this.commits = commits;
            }

            public StatusesBean getStatuses() {
                return statuses;
            }

            public void setStatuses(StatusesBean statuses) {
                this.statuses = statuses;
            }

            public static class SelfBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/pulls/2
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class HtmlBean {
                /**
                 * href : https://github.com/blindpirate/bot-test/pull/2
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class IssueBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/issues/2
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class CommentsBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/issues/2/comments
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class ReviewCommentsBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/pulls/2/comments
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class ReviewCommentBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/pulls/comments{/number}
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class CommitsBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/pulls/2/commits
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }

            public static class StatusesBean {
                /**
                 * href : https://api.github.com/repos/blindpirate/bot-test/statuses/481756348e34daf8528593137deb06d400dbd5c2
                 */

                private String href;

                public String getHref() {
                    return href;
                }

                public void setHref(String href) {
                    this.href = href;
                }
            }
        }
    }

    @JsonIgnoreProperties
    public static class RepositoryBean {
        /**
         * id : 296313786
         * node_id : MDEwOlJlcG9zaXRvcnkyOTYzMTM3ODY=
         * name : bot-test
         * full_name : blindpirate/bot-test
         * private : false
         * owner : {"login":"blindpirate","id":12689835,"node_id":"MDQ6VXNlcjEyNjg5ODM1","avatar_url":"https://avatars3.githubusercontent.com/u/12689835?v=4","gravatar_id":"","url":"https://api.github.com/users/blindpirate","html_url":"https://github.com/blindpirate","followers_url":"https://api.github.com/users/blindpirate/followers","following_url":"https://api.github.com/users/blindpirate/following{/other_user}","gists_url":"https://api.github.com/users/blindpirate/gists{/gist_id}","starred_url":"https://api.github.com/users/blindpirate/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/blindpirate/subscriptions","organizations_url":"https://api.github.com/users/blindpirate/orgs","repos_url":"https://api.github.com/users/blindpirate/repos","events_url":"https://api.github.com/users/blindpirate/events{/privacy}","received_events_url":"https://api.github.com/users/blindpirate/received_events","type":"User","site_admin":false}
         * html_url : https://github.com/blindpirate/bot-test
         * description : null
         * fork : false
         * url : https://api.github.com/repos/blindpirate/bot-test
         * forks_url : https://api.github.com/repos/blindpirate/bot-test/forks
         * keys_url : https://api.github.com/repos/blindpirate/bot-test/keys{/key_id}
         * collaborators_url : https://api.github.com/repos/blindpirate/bot-test/collaborators{/collaborator}
         * teams_url : https://api.github.com/repos/blindpirate/bot-test/teams
         * hooks_url : https://api.github.com/repos/blindpirate/bot-test/hooks
         * issue_events_url : https://api.github.com/repos/blindpirate/bot-test/issues/events{/number}
         * events_url : https://api.github.com/repos/blindpirate/bot-test/events
         * assignees_url : https://api.github.com/repos/blindpirate/bot-test/assignees{/user}
         * branches_url : https://api.github.com/repos/blindpirate/bot-test/branches{/branch}
         * tags_url : https://api.github.com/repos/blindpirate/bot-test/tags
         * blobs_url : https://api.github.com/repos/blindpirate/bot-test/git/blobs{/sha}
         * git_tags_url : https://api.github.com/repos/blindpirate/bot-test/git/tags{/sha}
         * git_refs_url : https://api.github.com/repos/blindpirate/bot-test/git/refs{/sha}
         * trees_url : https://api.github.com/repos/blindpirate/bot-test/git/trees{/sha}
         * statuses_url : https://api.github.com/repos/blindpirate/bot-test/statuses/{sha}
         * languages_url : https://api.github.com/repos/blindpirate/bot-test/languages
         * stargazers_url : https://api.github.com/repos/blindpirate/bot-test/stargazers
         * contributors_url : https://api.github.com/repos/blindpirate/bot-test/contributors
         * subscribers_url : https://api.github.com/repos/blindpirate/bot-test/subscribers
         * subscription_url : https://api.github.com/repos/blindpirate/bot-test/subscription
         * commits_url : https://api.github.com/repos/blindpirate/bot-test/commits{/sha}
         * git_commits_url : https://api.github.com/repos/blindpirate/bot-test/git/commits{/sha}
         * comments_url : https://api.github.com/repos/blindpirate/bot-test/comments{/number}
         * issue_comment_url : https://api.github.com/repos/blindpirate/bot-test/issues/comments{/number}
         * contents_url : https://api.github.com/repos/blindpirate/bot-test/contents/{+path}
         * compare_url : https://api.github.com/repos/blindpirate/bot-test/compare/{base}...{head}
         * merges_url : https://api.github.com/repos/blindpirate/bot-test/merges
         * archive_url : https://api.github.com/repos/blindpirate/bot-test/{archive_format}{/ref}
         * downloads_url : https://api.github.com/repos/blindpirate/bot-test/downloads
         * issues_url : https://api.github.com/repos/blindpirate/bot-test/issues{/number}
         * pulls_url : https://api.github.com/repos/blindpirate/bot-test/pulls{/number}
         * milestones_url : https://api.github.com/repos/blindpirate/bot-test/milestones{/number}
         * notifications_url : https://api.github.com/repos/blindpirate/bot-test/notifications{?since,all,participating}
         * labels_url : https://api.github.com/repos/blindpirate/bot-test/labels{/name}
         * releases_url : https://api.github.com/repos/blindpirate/bot-test/releases{/id}
         * deployments_url : https://api.github.com/repos/blindpirate/bot-test/deployments
         * created_at : 2020-09-17T12:03:01Z
         * updated_at : 2020-09-17T12:41:40Z
         * pushed_at : 2020-09-17T12:43:36Z
         * git_url : git://github.com/blindpirate/bot-test.git
         * ssh_url : git@github.com:blindpirate/bot-test.git
         * clone_url : https://github.com/blindpirate/bot-test.git
         * svn_url : https://github.com/blindpirate/bot-test
         * homepage : null
         * size : 0
         * stargazers_count : 0
         * watchers_count : 0
         * language : Java
         * has_issues : true
         * has_projects : true
         * has_downloads : true
         * has_wiki : true
         * has_pages : false
         * forks_count : 0
         * mirror_url : null
         * archived : false
         * disabled : false
         * open_issues_count : 2
         * license : null
         * forks : 0
         * open_issues : 2
         * watchers : 0
         * default_branch : master
         */

        private int id;
        private String node_id;
        private String name;
        private String full_name;
        private boolean privateX;
        private OwnerBeanXX owner;
        private String html_url;
        private Object description;
        private boolean fork;
        private String url;
        private String forks_url;
        private String keys_url;
        private String collaborators_url;
        private String teams_url;
        private String hooks_url;
        private String issue_events_url;
        private String events_url;
        private String assignees_url;
        private String branches_url;
        private String tags_url;
        private String blobs_url;
        private String git_tags_url;
        private String git_refs_url;
        private String trees_url;
        private String statuses_url;
        private String languages_url;
        private String stargazers_url;
        private String contributors_url;
        private String subscribers_url;
        private String subscription_url;
        private String commits_url;
        private String git_commits_url;
        private String comments_url;
        private String issue_comment_url;
        private String contents_url;
        private String compare_url;
        private String merges_url;
        private String archive_url;
        private String downloads_url;
        private String issues_url;
        private String pulls_url;
        private String milestones_url;
        private String notifications_url;
        private String labels_url;
        private String releases_url;
        private String deployments_url;
        private String created_at;
        private String updated_at;
        private String pushed_at;
        private String git_url;
        private String ssh_url;
        private String clone_url;
        private String svn_url;
        private Object homepage;
        private int size;
        private int stargazers_count;
        private int watchers_count;
        private String language;
        private boolean has_issues;
        private boolean has_projects;
        private boolean has_downloads;
        private boolean has_wiki;
        private boolean has_pages;
        private int forks_count;
        private Object mirror_url;
        private boolean archived;
        private boolean disabled;
        private int open_issues_count;
        private Object license;
        private int forks;
        private int open_issues;
        private int watchers;
        private String default_branch;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFull_name() {
            return full_name;
        }

        public void setFull_name(String full_name) {
            this.full_name = full_name;
        }

        public boolean isPrivateX() {
            return privateX;
        }

        public void setPrivateX(boolean privateX) {
            this.privateX = privateX;
        }

        public OwnerBeanXX getOwner() {
            return owner;
        }

        public void setOwner(OwnerBeanXX owner) {
            this.owner = owner;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public boolean isFork() {
            return fork;
        }

        public void setFork(boolean fork) {
            this.fork = fork;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getForks_url() {
            return forks_url;
        }

        public void setForks_url(String forks_url) {
            this.forks_url = forks_url;
        }

        public String getKeys_url() {
            return keys_url;
        }

        public void setKeys_url(String keys_url) {
            this.keys_url = keys_url;
        }

        public String getCollaborators_url() {
            return collaborators_url;
        }

        public void setCollaborators_url(String collaborators_url) {
            this.collaborators_url = collaborators_url;
        }

        public String getTeams_url() {
            return teams_url;
        }

        public void setTeams_url(String teams_url) {
            this.teams_url = teams_url;
        }

        public String getHooks_url() {
            return hooks_url;
        }

        public void setHooks_url(String hooks_url) {
            this.hooks_url = hooks_url;
        }

        public String getIssue_events_url() {
            return issue_events_url;
        }

        public void setIssue_events_url(String issue_events_url) {
            this.issue_events_url = issue_events_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getAssignees_url() {
            return assignees_url;
        }

        public void setAssignees_url(String assignees_url) {
            this.assignees_url = assignees_url;
        }

        public String getBranches_url() {
            return branches_url;
        }

        public void setBranches_url(String branches_url) {
            this.branches_url = branches_url;
        }

        public String getTags_url() {
            return tags_url;
        }

        public void setTags_url(String tags_url) {
            this.tags_url = tags_url;
        }

        public String getBlobs_url() {
            return blobs_url;
        }

        public void setBlobs_url(String blobs_url) {
            this.blobs_url = blobs_url;
        }

        public String getGit_tags_url() {
            return git_tags_url;
        }

        public void setGit_tags_url(String git_tags_url) {
            this.git_tags_url = git_tags_url;
        }

        public String getGit_refs_url() {
            return git_refs_url;
        }

        public void setGit_refs_url(String git_refs_url) {
            this.git_refs_url = git_refs_url;
        }

        public String getTrees_url() {
            return trees_url;
        }

        public void setTrees_url(String trees_url) {
            this.trees_url = trees_url;
        }

        public String getStatuses_url() {
            return statuses_url;
        }

        public void setStatuses_url(String statuses_url) {
            this.statuses_url = statuses_url;
        }

        public String getLanguages_url() {
            return languages_url;
        }

        public void setLanguages_url(String languages_url) {
            this.languages_url = languages_url;
        }

        public String getStargazers_url() {
            return stargazers_url;
        }

        public void setStargazers_url(String stargazers_url) {
            this.stargazers_url = stargazers_url;
        }

        public String getContributors_url() {
            return contributors_url;
        }

        public void setContributors_url(String contributors_url) {
            this.contributors_url = contributors_url;
        }

        public String getSubscribers_url() {
            return subscribers_url;
        }

        public void setSubscribers_url(String subscribers_url) {
            this.subscribers_url = subscribers_url;
        }

        public String getSubscription_url() {
            return subscription_url;
        }

        public void setSubscription_url(String subscription_url) {
            this.subscription_url = subscription_url;
        }

        public String getCommits_url() {
            return commits_url;
        }

        public void setCommits_url(String commits_url) {
            this.commits_url = commits_url;
        }

        public String getGit_commits_url() {
            return git_commits_url;
        }

        public void setGit_commits_url(String git_commits_url) {
            this.git_commits_url = git_commits_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public String getIssue_comment_url() {
            return issue_comment_url;
        }

        public void setIssue_comment_url(String issue_comment_url) {
            this.issue_comment_url = issue_comment_url;
        }

        public String getContents_url() {
            return contents_url;
        }

        public void setContents_url(String contents_url) {
            this.contents_url = contents_url;
        }

        public String getCompare_url() {
            return compare_url;
        }

        public void setCompare_url(String compare_url) {
            this.compare_url = compare_url;
        }

        public String getMerges_url() {
            return merges_url;
        }

        public void setMerges_url(String merges_url) {
            this.merges_url = merges_url;
        }

        public String getArchive_url() {
            return archive_url;
        }

        public void setArchive_url(String archive_url) {
            this.archive_url = archive_url;
        }

        public String getDownloads_url() {
            return downloads_url;
        }

        public void setDownloads_url(String downloads_url) {
            this.downloads_url = downloads_url;
        }

        public String getIssues_url() {
            return issues_url;
        }

        public void setIssues_url(String issues_url) {
            this.issues_url = issues_url;
        }

        public String getPulls_url() {
            return pulls_url;
        }

        public void setPulls_url(String pulls_url) {
            this.pulls_url = pulls_url;
        }

        public String getMilestones_url() {
            return milestones_url;
        }

        public void setMilestones_url(String milestones_url) {
            this.milestones_url = milestones_url;
        }

        public String getNotifications_url() {
            return notifications_url;
        }

        public void setNotifications_url(String notifications_url) {
            this.notifications_url = notifications_url;
        }

        public String getLabels_url() {
            return labels_url;
        }

        public void setLabels_url(String labels_url) {
            this.labels_url = labels_url;
        }

        public String getReleases_url() {
            return releases_url;
        }

        public void setReleases_url(String releases_url) {
            this.releases_url = releases_url;
        }

        public String getDeployments_url() {
            return deployments_url;
        }

        public void setDeployments_url(String deployments_url) {
            this.deployments_url = deployments_url;
        }

        public String getCreated_at() {
            return created_at;
        }

        public void setCreated_at(String created_at) {
            this.created_at = created_at;
        }

        public String getUpdated_at() {
            return updated_at;
        }

        public void setUpdated_at(String updated_at) {
            this.updated_at = updated_at;
        }

        public String getPushed_at() {
            return pushed_at;
        }

        public void setPushed_at(String pushed_at) {
            this.pushed_at = pushed_at;
        }

        public String getGit_url() {
            return git_url;
        }

        public void setGit_url(String git_url) {
            this.git_url = git_url;
        }

        public String getSsh_url() {
            return ssh_url;
        }

        public void setSsh_url(String ssh_url) {
            this.ssh_url = ssh_url;
        }

        public String getClone_url() {
            return clone_url;
        }

        public void setClone_url(String clone_url) {
            this.clone_url = clone_url;
        }

        public String getSvn_url() {
            return svn_url;
        }

        public void setSvn_url(String svn_url) {
            this.svn_url = svn_url;
        }

        public Object getHomepage() {
            return homepage;
        }

        public void setHomepage(Object homepage) {
            this.homepage = homepage;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getStargazers_count() {
            return stargazers_count;
        }

        public void setStargazers_count(int stargazers_count) {
            this.stargazers_count = stargazers_count;
        }

        public int getWatchers_count() {
            return watchers_count;
        }

        public void setWatchers_count(int watchers_count) {
            this.watchers_count = watchers_count;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isHas_issues() {
            return has_issues;
        }

        public void setHas_issues(boolean has_issues) {
            this.has_issues = has_issues;
        }

        public boolean isHas_projects() {
            return has_projects;
        }

        public void setHas_projects(boolean has_projects) {
            this.has_projects = has_projects;
        }

        public boolean isHas_downloads() {
            return has_downloads;
        }

        public void setHas_downloads(boolean has_downloads) {
            this.has_downloads = has_downloads;
        }

        public boolean isHas_wiki() {
            return has_wiki;
        }

        public void setHas_wiki(boolean has_wiki) {
            this.has_wiki = has_wiki;
        }

        public boolean isHas_pages() {
            return has_pages;
        }

        public void setHas_pages(boolean has_pages) {
            this.has_pages = has_pages;
        }

        public int getForks_count() {
            return forks_count;
        }

        public void setForks_count(int forks_count) {
            this.forks_count = forks_count;
        }

        public Object getMirror_url() {
            return mirror_url;
        }

        public void setMirror_url(Object mirror_url) {
            this.mirror_url = mirror_url;
        }

        public boolean isArchived() {
            return archived;
        }

        public void setArchived(boolean archived) {
            this.archived = archived;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        public int getOpen_issues_count() {
            return open_issues_count;
        }

        public void setOpen_issues_count(int open_issues_count) {
            this.open_issues_count = open_issues_count;
        }

        public Object getLicense() {
            return license;
        }

        public void setLicense(Object license) {
            this.license = license;
        }

        public int getForks() {
            return forks;
        }

        public void setForks(int forks) {
            this.forks = forks;
        }

        public int getOpen_issues() {
            return open_issues;
        }

        public void setOpen_issues(int open_issues) {
            this.open_issues = open_issues;
        }

        public int getWatchers() {
            return watchers;
        }

        public void setWatchers(int watchers) {
            this.watchers = watchers;
        }

        public String getDefault_branch() {
            return default_branch;
        }

        public void setDefault_branch(String default_branch) {
            this.default_branch = default_branch;
        }

        public static class OwnerBeanXX {
            /**
             * login : blindpirate
             * id : 12689835
             * node_id : MDQ6VXNlcjEyNjg5ODM1
             * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
             * gravatar_id :
             * url : https://api.github.com/users/blindpirate
             * html_url : https://github.com/blindpirate
             * followers_url : https://api.github.com/users/blindpirate/followers
             * following_url : https://api.github.com/users/blindpirate/following{/other_user}
             * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
             * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
             * organizations_url : https://api.github.com/users/blindpirate/orgs
             * repos_url : https://api.github.com/users/blindpirate/repos
             * events_url : https://api.github.com/users/blindpirate/events{/privacy}
             * received_events_url : https://api.github.com/users/blindpirate/received_events
             * type : User
             * site_admin : false
             */

            private String login;
            private int id;
            private String node_id;
            private String avatar_url;
            private String gravatar_id;
            private String url;
            private String html_url;
            private String followers_url;
            private String following_url;
            private String gists_url;
            private String starred_url;
            private String subscriptions_url;
            private String organizations_url;
            private String repos_url;
            private String events_url;
            private String received_events_url;
            private String type;
            private boolean site_admin;

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getAvatar_url() {
                return avatar_url;
            }

            public void setAvatar_url(String avatar_url) {
                this.avatar_url = avatar_url;
            }

            public String getGravatar_id() {
                return gravatar_id;
            }

            public void setGravatar_id(String gravatar_id) {
                this.gravatar_id = gravatar_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getHtml_url() {
                return html_url;
            }

            public void setHtml_url(String html_url) {
                this.html_url = html_url;
            }

            public String getFollowers_url() {
                return followers_url;
            }

            public void setFollowers_url(String followers_url) {
                this.followers_url = followers_url;
            }

            public String getFollowing_url() {
                return following_url;
            }

            public void setFollowing_url(String following_url) {
                this.following_url = following_url;
            }

            public String getGists_url() {
                return gists_url;
            }

            public void setGists_url(String gists_url) {
                this.gists_url = gists_url;
            }

            public String getStarred_url() {
                return starred_url;
            }

            public void setStarred_url(String starred_url) {
                this.starred_url = starred_url;
            }

            public String getSubscriptions_url() {
                return subscriptions_url;
            }

            public void setSubscriptions_url(String subscriptions_url) {
                this.subscriptions_url = subscriptions_url;
            }

            public String getOrganizations_url() {
                return organizations_url;
            }

            public void setOrganizations_url(String organizations_url) {
                this.organizations_url = organizations_url;
            }

            public String getRepos_url() {
                return repos_url;
            }

            public void setRepos_url(String repos_url) {
                this.repos_url = repos_url;
            }

            public String getEvents_url() {
                return events_url;
            }

            public void setEvents_url(String events_url) {
                this.events_url = events_url;
            }

            public String getReceived_events_url() {
                return received_events_url;
            }

            public void setReceived_events_url(String received_events_url) {
                this.received_events_url = received_events_url;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public boolean isSite_admin() {
                return site_admin;
            }

            public void setSite_admin(boolean site_admin) {
                this.site_admin = site_admin;
            }
        }
    }

    public static class SenderBean {
        /**
         * login : blindpirate
         * id : 12689835
         * node_id : MDQ6VXNlcjEyNjg5ODM1
         * avatar_url : https://avatars3.githubusercontent.com/u/12689835?v=4
         * gravatar_id :
         * url : https://api.github.com/users/blindpirate
         * html_url : https://github.com/blindpirate
         * followers_url : https://api.github.com/users/blindpirate/followers
         * following_url : https://api.github.com/users/blindpirate/following{/other_user}
         * gists_url : https://api.github.com/users/blindpirate/gists{/gist_id}
         * starred_url : https://api.github.com/users/blindpirate/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/blindpirate/subscriptions
         * organizations_url : https://api.github.com/users/blindpirate/orgs
         * repos_url : https://api.github.com/users/blindpirate/repos
         * events_url : https://api.github.com/users/blindpirate/events{/privacy}
         * received_events_url : https://api.github.com/users/blindpirate/received_events
         * type : User
         * site_admin : false
         */

        private String login;
        private int id;
        private String node_id;
        private String avatar_url;
        private String gravatar_id;
        private String url;
        private String html_url;
        private String followers_url;
        private String following_url;
        private String gists_url;
        private String starred_url;
        private String subscriptions_url;
        private String organizations_url;
        private String repos_url;
        private String events_url;
        private String received_events_url;
        private String type;
        private boolean site_admin;

        public String getLogin() {
            return login;
        }

        public void setLogin(String login) {
            this.login = login;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNode_id() {
            return node_id;
        }

        public void setNode_id(String node_id) {
            this.node_id = node_id;
        }

        public String getAvatar_url() {
            return avatar_url;
        }

        public void setAvatar_url(String avatar_url) {
            this.avatar_url = avatar_url;
        }

        public String getGravatar_id() {
            return gravatar_id;
        }

        public void setGravatar_id(String gravatar_id) {
            this.gravatar_id = gravatar_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
        }

        public String getFollowers_url() {
            return followers_url;
        }

        public void setFollowers_url(String followers_url) {
            this.followers_url = followers_url;
        }

        public String getFollowing_url() {
            return following_url;
        }

        public void setFollowing_url(String following_url) {
            this.following_url = following_url;
        }

        public String getGists_url() {
            return gists_url;
        }

        public void setGists_url(String gists_url) {
            this.gists_url = gists_url;
        }

        public String getStarred_url() {
            return starred_url;
        }

        public void setStarred_url(String starred_url) {
            this.starred_url = starred_url;
        }

        public String getSubscriptions_url() {
            return subscriptions_url;
        }

        public void setSubscriptions_url(String subscriptions_url) {
            this.subscriptions_url = subscriptions_url;
        }

        public String getOrganizations_url() {
            return organizations_url;
        }

        public void setOrganizations_url(String organizations_url) {
            this.organizations_url = organizations_url;
        }

        public String getRepos_url() {
            return repos_url;
        }

        public void setRepos_url(String repos_url) {
            this.repos_url = repos_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getReceived_events_url() {
            return received_events_url;
        }

        public void setReceived_events_url(String received_events_url) {
            this.received_events_url = received_events_url;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public boolean isSite_admin() {
            return site_admin;
        }

        public void setSite_admin(boolean site_admin) {
            this.site_admin = site_admin;
        }
    }
}
