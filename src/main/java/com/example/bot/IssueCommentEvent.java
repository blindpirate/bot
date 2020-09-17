package com.example.bot;

import java.util.List;

public class IssueCommentEvent {

    /**
     * action : created
     * issue : {"url":"https://api.github.com/repos/Codertocat/Hello-World/issues/1","repository_url":"https://api.github.com/repos/Codertocat/Hello-World","labels_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/1/labels{/name}","comments_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/1/comments","events_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/1/events","html_url":"https://github.com/Codertocat/Hello-World/issues/1","id":444500041,"node_id":"MDU6SXNzdWU0NDQ1MDAwNDE=","number":1,"title":"Spelling error in the README file","user":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"labels":[{"id":1362934389,"node_id":"MDU6TGFiZWwxMzYyOTM0Mzg5","url":"https://api.github.com/repos/Codertocat/Hello-World/labels/bug","name":"bug","color":"d73a4a","default":true}],"state":"open","locked":false,"assignee":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"assignees":[{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}],"milestone":{"url":"https://api.github.com/repos/Codertocat/Hello-World/milestones/1","html_url":"https://github.com/Codertocat/Hello-World/milestone/1","labels_url":"https://api.github.com/repos/Codertocat/Hello-World/milestones/1/labels","id":4317517,"node_id":"MDk6TWlsZXN0b25lNDMxNzUxNw==","number":1,"title":"v1.0","description":"Add new space flight simulator","creator":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"open_issues":1,"closed_issues":0,"state":"closed","created_at":"2019-05-15T15:20:17Z","updated_at":"2019-05-15T15:20:18Z","due_on":"2019-05-23T07:00:00Z","closed_at":"2019-05-15T15:20:18Z"},"comments":0,"created_at":"2019-05-15T15:20:18Z","updated_at":"2019-05-15T15:20:21Z","closed_at":null,"author_association":"OWNER","body":"It looks like you accidently spelled 'commit' with two 't's."}
     * comment : {"url":"https://api.github.com/repos/Codertocat/Hello-World/issues/comments/492700400","html_url":"https://github.com/Codertocat/Hello-World/issues/1#issuecomment-492700400","issue_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/1","id":492700400,"node_id":"MDEyOklzc3VlQ29tbWVudDQ5MjcwMDQwMA==","user":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"created_at":"2019-05-15T15:20:21Z","updated_at":"2019-05-15T15:20:21Z","author_association":"OWNER","body":"You are totally right! I'll get this fixed right away."}
     * repository : {"id":186853002,"node_id":"MDEwOlJlcG9zaXRvcnkxODY4NTMwMDI=","name":"Hello-World","full_name":"Codertocat/Hello-World","private":false,"owner":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"html_url":"https://github.com/Codertocat/Hello-World","description":null,"fork":false,"url":"https://api.github.com/repos/Codertocat/Hello-World","forks_url":"https://api.github.com/repos/Codertocat/Hello-World/forks","keys_url":"https://api.github.com/repos/Codertocat/Hello-World/keys{/key_id}","collaborators_url":"https://api.github.com/repos/Codertocat/Hello-World/collaborators{/collaborator}","teams_url":"https://api.github.com/repos/Codertocat/Hello-World/teams","hooks_url":"https://api.github.com/repos/Codertocat/Hello-World/hooks","issue_events_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/events{/number}","events_url":"https://api.github.com/repos/Codertocat/Hello-World/events","assignees_url":"https://api.github.com/repos/Codertocat/Hello-World/assignees{/user}","branches_url":"https://api.github.com/repos/Codertocat/Hello-World/branches{/branch}","tags_url":"https://api.github.com/repos/Codertocat/Hello-World/tags","blobs_url":"https://api.github.com/repos/Codertocat/Hello-World/git/blobs{/sha}","git_tags_url":"https://api.github.com/repos/Codertocat/Hello-World/git/tags{/sha}","git_refs_url":"https://api.github.com/repos/Codertocat/Hello-World/git/refs{/sha}","trees_url":"https://api.github.com/repos/Codertocat/Hello-World/git/trees{/sha}","statuses_url":"https://api.github.com/repos/Codertocat/Hello-World/statuses/{sha}","languages_url":"https://api.github.com/repos/Codertocat/Hello-World/languages","stargazers_url":"https://api.github.com/repos/Codertocat/Hello-World/stargazers","contributors_url":"https://api.github.com/repos/Codertocat/Hello-World/contributors","subscribers_url":"https://api.github.com/repos/Codertocat/Hello-World/subscribers","subscription_url":"https://api.github.com/repos/Codertocat/Hello-World/subscription","commits_url":"https://api.github.com/repos/Codertocat/Hello-World/commits{/sha}","git_commits_url":"https://api.github.com/repos/Codertocat/Hello-World/git/commits{/sha}","comments_url":"https://api.github.com/repos/Codertocat/Hello-World/comments{/number}","issue_comment_url":"https://api.github.com/repos/Codertocat/Hello-World/issues/comments{/number}","contents_url":"https://api.github.com/repos/Codertocat/Hello-World/contents/{+path}","compare_url":"https://api.github.com/repos/Codertocat/Hello-World/compare/{base}...{head}","merges_url":"https://api.github.com/repos/Codertocat/Hello-World/merges","archive_url":"https://api.github.com/repos/Codertocat/Hello-World/{archive_format}{/ref}","downloads_url":"https://api.github.com/repos/Codertocat/Hello-World/downloads","issues_url":"https://api.github.com/repos/Codertocat/Hello-World/issues{/number}","pulls_url":"https://api.github.com/repos/Codertocat/Hello-World/pulls{/number}","milestones_url":"https://api.github.com/repos/Codertocat/Hello-World/milestones{/number}","notifications_url":"https://api.github.com/repos/Codertocat/Hello-World/notifications{?since,all,participating}","labels_url":"https://api.github.com/repos/Codertocat/Hello-World/labels{/name}","releases_url":"https://api.github.com/repos/Codertocat/Hello-World/releases{/id}","deployments_url":"https://api.github.com/repos/Codertocat/Hello-World/deployments","created_at":"2019-05-15T15:19:25Z","updated_at":"2019-05-15T15:19:27Z","pushed_at":"2019-05-15T15:20:13Z","git_url":"git://github.com/Codertocat/Hello-World.git","ssh_url":"git@github.com:Codertocat/Hello-World.git","clone_url":"https://github.com/Codertocat/Hello-World.git","svn_url":"https://github.com/Codertocat/Hello-World","homepage":null,"size":0,"stargazers_count":0,"watchers_count":0,"language":null,"has_issues":true,"has_projects":true,"has_downloads":true,"has_wiki":true,"has_pages":true,"forks_count":0,"mirror_url":null,"archived":false,"disabled":false,"open_issues_count":1,"license":null,"forks":0,"open_issues":1,"watchers":0,"default_branch":"master"}
     * sender : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
     */

    private String action;
    private IssueBean issue;
    private CommentBean comment;
    private RepositoryBean repository;
    private SenderBean sender;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public IssueBean getIssue() {
        return issue;
    }

    public void setIssue(IssueBean issue) {
        this.issue = issue;
    }

    public CommentBean getComment() {
        return comment;
    }

    public void setComment(CommentBean comment) {
        this.comment = comment;
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

    public static class IssueBean {
        /**
         * url : https://api.github.com/repos/Codertocat/Hello-World/issues/1
         * repository_url : https://api.github.com/repos/Codertocat/Hello-World
         * labels_url : https://api.github.com/repos/Codertocat/Hello-World/issues/1/labels{/name}
         * comments_url : https://api.github.com/repos/Codertocat/Hello-World/issues/1/comments
         * events_url : https://api.github.com/repos/Codertocat/Hello-World/issues/1/events
         * html_url : https://github.com/Codertocat/Hello-World/issues/1
         * id : 444500041
         * node_id : MDU6SXNzdWU0NDQ1MDAwNDE=
         * number : 1
         * title : Spelling error in the README file
         * user : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
         * labels : [{"id":1362934389,"node_id":"MDU6TGFiZWwxMzYyOTM0Mzg5","url":"https://api.github.com/repos/Codertocat/Hello-World/labels/bug","name":"bug","color":"d73a4a","default":true}]
         * state : open
         * locked : false
         * assignee : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
         * assignees : [{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}]
         * milestone : {"url":"https://api.github.com/repos/Codertocat/Hello-World/milestones/1","html_url":"https://github.com/Codertocat/Hello-World/milestone/1","labels_url":"https://api.github.com/repos/Codertocat/Hello-World/milestones/1/labels","id":4317517,"node_id":"MDk6TWlsZXN0b25lNDMxNzUxNw==","number":1,"title":"v1.0","description":"Add new space flight simulator","creator":{"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false},"open_issues":1,"closed_issues":0,"state":"closed","created_at":"2019-05-15T15:20:17Z","updated_at":"2019-05-15T15:20:18Z","due_on":"2019-05-23T07:00:00Z","closed_at":"2019-05-15T15:20:18Z"}
         * comments : 0
         * created_at : 2019-05-15T15:20:18Z
         * updated_at : 2019-05-15T15:20:21Z
         * closed_at : null
         * author_association : OWNER
         * body : It looks like you accidently spelled 'commit' with two 't's.
         */

        private String url;
        private String repository_url;
        private String labels_url;
        private String comments_url;
        private String events_url;
        private String html_url;
        private int id;
        private String node_id;
        private int number;
        private String title;
        private UserBean user;
        private String state;
        private boolean locked;
        private AssigneeBean assignee;
        private MilestoneBean milestone;
        private int comments;
        private String created_at;
        private String updated_at;
        private Object closed_at;
        private String author_association;
        private String body;
        private List<LabelsBean> labels;
        private List<AssigneesBean> assignees;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getRepository_url() {
            return repository_url;
        }

        public void setRepository_url(String repository_url) {
            this.repository_url = repository_url;
        }

        public String getLabels_url() {
            return labels_url;
        }

        public void setLabels_url(String labels_url) {
            this.labels_url = labels_url;
        }

        public String getComments_url() {
            return comments_url;
        }

        public void setComments_url(String comments_url) {
            this.comments_url = comments_url;
        }

        public String getEvents_url() {
            return events_url;
        }

        public void setEvents_url(String events_url) {
            this.events_url = events_url;
        }

        public String getHtml_url() {
            return html_url;
        }

        public void setHtml_url(String html_url) {
            this.html_url = html_url;
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

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
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

        public AssigneeBean getAssignee() {
            return assignee;
        }

        public void setAssignee(AssigneeBean assignee) {
            this.assignee = assignee;
        }

        public MilestoneBean getMilestone() {
            return milestone;
        }

        public void setMilestone(MilestoneBean milestone) {
            this.milestone = milestone;
        }

        public int getComments() {
            return comments;
        }

        public void setComments(int comments) {
            this.comments = comments;
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

        public String getAuthor_association() {
            return author_association;
        }

        public void setAuthor_association(String author_association) {
            this.author_association = author_association;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public List<LabelsBean> getLabels() {
            return labels;
        }

        public void setLabels(List<LabelsBean> labels) {
            this.labels = labels;
        }

        public List<AssigneesBean> getAssignees() {
            return assignees;
        }

        public void setAssignees(List<AssigneesBean> assignees) {
            this.assignees = assignees;
        }

        public static class UserBean {
            /**
             * login : Codertocat
             * id : 21031067
             * node_id : MDQ6VXNlcjIxMDMxMDY3
             * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Codertocat
             * html_url : https://github.com/Codertocat
             * followers_url : https://api.github.com/users/Codertocat/followers
             * following_url : https://api.github.com/users/Codertocat/following{/other_user}
             * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
             * organizations_url : https://api.github.com/users/Codertocat/orgs
             * repos_url : https://api.github.com/users/Codertocat/repos
             * events_url : https://api.github.com/users/Codertocat/events{/privacy}
             * received_events_url : https://api.github.com/users/Codertocat/received_events
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

        public static class AssigneeBean {
            /**
             * login : Codertocat
             * id : 21031067
             * node_id : MDQ6VXNlcjIxMDMxMDY3
             * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Codertocat
             * html_url : https://github.com/Codertocat
             * followers_url : https://api.github.com/users/Codertocat/followers
             * following_url : https://api.github.com/users/Codertocat/following{/other_user}
             * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
             * organizations_url : https://api.github.com/users/Codertocat/orgs
             * repos_url : https://api.github.com/users/Codertocat/repos
             * events_url : https://api.github.com/users/Codertocat/events{/privacy}
             * received_events_url : https://api.github.com/users/Codertocat/received_events
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

        public static class MilestoneBean {
            /**
             * url : https://api.github.com/repos/Codertocat/Hello-World/milestones/1
             * html_url : https://github.com/Codertocat/Hello-World/milestone/1
             * labels_url : https://api.github.com/repos/Codertocat/Hello-World/milestones/1/labels
             * id : 4317517
             * node_id : MDk6TWlsZXN0b25lNDMxNzUxNw==
             * number : 1
             * title : v1.0
             * description : Add new space flight simulator
             * creator : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
             * open_issues : 1
             * closed_issues : 0
             * state : closed
             * created_at : 2019-05-15T15:20:17Z
             * updated_at : 2019-05-15T15:20:18Z
             * due_on : 2019-05-23T07:00:00Z
             * closed_at : 2019-05-15T15:20:18Z
             */

            private String url;
            private String html_url;
            private String labels_url;
            private int id;
            private String node_id;
            private int number;
            private String title;
            private String description;
            private CreatorBean creator;
            private int open_issues;
            private int closed_issues;
            private String state;
            private String created_at;
            private String updated_at;
            private String due_on;
            private String closed_at;

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

            public String getLabels_url() {
                return labels_url;
            }

            public void setLabels_url(String labels_url) {
                this.labels_url = labels_url;
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

            public int getNumber() {
                return number;
            }

            public void setNumber(int number) {
                this.number = number;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public CreatorBean getCreator() {
                return creator;
            }

            public void setCreator(CreatorBean creator) {
                this.creator = creator;
            }

            public int getOpen_issues() {
                return open_issues;
            }

            public void setOpen_issues(int open_issues) {
                this.open_issues = open_issues;
            }

            public int getClosed_issues() {
                return closed_issues;
            }

            public void setClosed_issues(int closed_issues) {
                this.closed_issues = closed_issues;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
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

            public String getDue_on() {
                return due_on;
            }

            public void setDue_on(String due_on) {
                this.due_on = due_on;
            }

            public String getClosed_at() {
                return closed_at;
            }

            public void setClosed_at(String closed_at) {
                this.closed_at = closed_at;
            }

            public static class CreatorBean {
                /**
                 * login : Codertocat
                 * id : 21031067
                 * node_id : MDQ6VXNlcjIxMDMxMDY3
                 * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
                 * gravatar_id :
                 * url : https://api.github.com/users/Codertocat
                 * html_url : https://github.com/Codertocat
                 * followers_url : https://api.github.com/users/Codertocat/followers
                 * following_url : https://api.github.com/users/Codertocat/following{/other_user}
                 * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
                 * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
                 * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
                 * organizations_url : https://api.github.com/users/Codertocat/orgs
                 * repos_url : https://api.github.com/users/Codertocat/repos
                 * events_url : https://api.github.com/users/Codertocat/events{/privacy}
                 * received_events_url : https://api.github.com/users/Codertocat/received_events
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

        public static class LabelsBean {
            /**
             * id : 1362934389
             * node_id : MDU6TGFiZWwxMzYyOTM0Mzg5
             * url : https://api.github.com/repos/Codertocat/Hello-World/labels/bug
             * name : bug
             * color : d73a4a
             * default : true
             */

            private long id;
            private String node_id;
            private String url;
            private String name;
            private String color;
            private boolean defaultX;

            public long getId() {
                return id;
            }

            public void setId(long id) {
                this.id = id;
            }

            public String getNode_id() {
                return node_id;
            }

            public void setNode_id(String node_id) {
                this.node_id = node_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getColor() {
                return color;
            }

            public void setColor(String color) {
                this.color = color;
            }

            public boolean isDefaultX() {
                return defaultX;
            }

            public void setDefaultX(boolean defaultX) {
                this.defaultX = defaultX;
            }
        }

        public static class AssigneesBean {
            /**
             * login : Codertocat
             * id : 21031067
             * node_id : MDQ6VXNlcjIxMDMxMDY3
             * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Codertocat
             * html_url : https://github.com/Codertocat
             * followers_url : https://api.github.com/users/Codertocat/followers
             * following_url : https://api.github.com/users/Codertocat/following{/other_user}
             * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
             * organizations_url : https://api.github.com/users/Codertocat/orgs
             * repos_url : https://api.github.com/users/Codertocat/repos
             * events_url : https://api.github.com/users/Codertocat/events{/privacy}
             * received_events_url : https://api.github.com/users/Codertocat/received_events
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

    public static class CommentBean {
        /**
         * url : https://api.github.com/repos/Codertocat/Hello-World/issues/comments/492700400
         * html_url : https://github.com/Codertocat/Hello-World/issues/1#issuecomment-492700400
         * issue_url : https://api.github.com/repos/Codertocat/Hello-World/issues/1
         * id : 492700400
         * node_id : MDEyOklzc3VlQ29tbWVudDQ5MjcwMDQwMA==
         * user : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
         * created_at : 2019-05-15T15:20:21Z
         * updated_at : 2019-05-15T15:20:21Z
         * author_association : OWNER
         * body : You are totally right! I'll get this fixed right away.
         */

        private String url;
        private String html_url;
        private String issue_url;
        private int id;
        private String node_id;
        private UserBeanX user;
        private String created_at;
        private String updated_at;
        private String author_association;
        private String body;

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

        public String getIssue_url() {
            return issue_url;
        }

        public void setIssue_url(String issue_url) {
            this.issue_url = issue_url;
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

        public UserBeanX getUser() {
            return user;
        }

        public void setUser(UserBeanX user) {
            this.user = user;
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

        public String getAuthor_association() {
            return author_association;
        }

        public void setAuthor_association(String author_association) {
            this.author_association = author_association;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public static class UserBeanX {
            /**
             * login : Codertocat
             * id : 21031067
             * node_id : MDQ6VXNlcjIxMDMxMDY3
             * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Codertocat
             * html_url : https://github.com/Codertocat
             * followers_url : https://api.github.com/users/Codertocat/followers
             * following_url : https://api.github.com/users/Codertocat/following{/other_user}
             * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
             * organizations_url : https://api.github.com/users/Codertocat/orgs
             * repos_url : https://api.github.com/users/Codertocat/repos
             * events_url : https://api.github.com/users/Codertocat/events{/privacy}
             * received_events_url : https://api.github.com/users/Codertocat/received_events
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

    public static class RepositoryBean {
        /**
         * id : 186853002
         * node_id : MDEwOlJlcG9zaXRvcnkxODY4NTMwMDI=
         * name : Hello-World
         * full_name : Codertocat/Hello-World
         * private : false
         * owner : {"login":"Codertocat","id":21031067,"node_id":"MDQ6VXNlcjIxMDMxMDY3","avatar_url":"https://avatars1.githubusercontent.com/u/21031067?v=4","gravatar_id":"","url":"https://api.github.com/users/Codertocat","html_url":"https://github.com/Codertocat","followers_url":"https://api.github.com/users/Codertocat/followers","following_url":"https://api.github.com/users/Codertocat/following{/other_user}","gists_url":"https://api.github.com/users/Codertocat/gists{/gist_id}","starred_url":"https://api.github.com/users/Codertocat/starred{/owner}{/repo}","subscriptions_url":"https://api.github.com/users/Codertocat/subscriptions","organizations_url":"https://api.github.com/users/Codertocat/orgs","repos_url":"https://api.github.com/users/Codertocat/repos","events_url":"https://api.github.com/users/Codertocat/events{/privacy}","received_events_url":"https://api.github.com/users/Codertocat/received_events","type":"User","site_admin":false}
         * html_url : https://github.com/Codertocat/Hello-World
         * description : null
         * fork : false
         * url : https://api.github.com/repos/Codertocat/Hello-World
         * forks_url : https://api.github.com/repos/Codertocat/Hello-World/forks
         * keys_url : https://api.github.com/repos/Codertocat/Hello-World/keys{/key_id}
         * collaborators_url : https://api.github.com/repos/Codertocat/Hello-World/collaborators{/collaborator}
         * teams_url : https://api.github.com/repos/Codertocat/Hello-World/teams
         * hooks_url : https://api.github.com/repos/Codertocat/Hello-World/hooks
         * issue_events_url : https://api.github.com/repos/Codertocat/Hello-World/issues/events{/number}
         * events_url : https://api.github.com/repos/Codertocat/Hello-World/events
         * assignees_url : https://api.github.com/repos/Codertocat/Hello-World/assignees{/user}
         * branches_url : https://api.github.com/repos/Codertocat/Hello-World/branches{/branch}
         * tags_url : https://api.github.com/repos/Codertocat/Hello-World/tags
         * blobs_url : https://api.github.com/repos/Codertocat/Hello-World/git/blobs{/sha}
         * git_tags_url : https://api.github.com/repos/Codertocat/Hello-World/git/tags{/sha}
         * git_refs_url : https://api.github.com/repos/Codertocat/Hello-World/git/refs{/sha}
         * trees_url : https://api.github.com/repos/Codertocat/Hello-World/git/trees{/sha}
         * statuses_url : https://api.github.com/repos/Codertocat/Hello-World/statuses/{sha}
         * languages_url : https://api.github.com/repos/Codertocat/Hello-World/languages
         * stargazers_url : https://api.github.com/repos/Codertocat/Hello-World/stargazers
         * contributors_url : https://api.github.com/repos/Codertocat/Hello-World/contributors
         * subscribers_url : https://api.github.com/repos/Codertocat/Hello-World/subscribers
         * subscription_url : https://api.github.com/repos/Codertocat/Hello-World/subscription
         * commits_url : https://api.github.com/repos/Codertocat/Hello-World/commits{/sha}
         * git_commits_url : https://api.github.com/repos/Codertocat/Hello-World/git/commits{/sha}
         * comments_url : https://api.github.com/repos/Codertocat/Hello-World/comments{/number}
         * issue_comment_url : https://api.github.com/repos/Codertocat/Hello-World/issues/comments{/number}
         * contents_url : https://api.github.com/repos/Codertocat/Hello-World/contents/{+path}
         * compare_url : https://api.github.com/repos/Codertocat/Hello-World/compare/{base}...{head}
         * merges_url : https://api.github.com/repos/Codertocat/Hello-World/merges
         * archive_url : https://api.github.com/repos/Codertocat/Hello-World/{archive_format}{/ref}
         * downloads_url : https://api.github.com/repos/Codertocat/Hello-World/downloads
         * issues_url : https://api.github.com/repos/Codertocat/Hello-World/issues{/number}
         * pulls_url : https://api.github.com/repos/Codertocat/Hello-World/pulls{/number}
         * milestones_url : https://api.github.com/repos/Codertocat/Hello-World/milestones{/number}
         * notifications_url : https://api.github.com/repos/Codertocat/Hello-World/notifications{?since,all,participating}
         * labels_url : https://api.github.com/repos/Codertocat/Hello-World/labels{/name}
         * releases_url : https://api.github.com/repos/Codertocat/Hello-World/releases{/id}
         * deployments_url : https://api.github.com/repos/Codertocat/Hello-World/deployments
         * created_at : 2019-05-15T15:19:25Z
         * updated_at : 2019-05-15T15:19:27Z
         * pushed_at : 2019-05-15T15:20:13Z
         * git_url : git://github.com/Codertocat/Hello-World.git
         * ssh_url : git@github.com:Codertocat/Hello-World.git
         * clone_url : https://github.com/Codertocat/Hello-World.git
         * svn_url : https://github.com/Codertocat/Hello-World
         * homepage : null
         * size : 0
         * stargazers_count : 0
         * watchers_count : 0
         * language : null
         * has_issues : true
         * has_projects : true
         * has_downloads : true
         * has_wiki : true
         * has_pages : true
         * forks_count : 0
         * mirror_url : null
         * archived : false
         * disabled : false
         * open_issues_count : 1
         * license : null
         * forks : 0
         * open_issues : 1
         * watchers : 0
         * default_branch : master
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
        private Object language;
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

        public Object getLanguage() {
            return language;
        }

        public void setLanguage(Object language) {
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

        public static class OwnerBean {
            /**
             * login : Codertocat
             * id : 21031067
             * node_id : MDQ6VXNlcjIxMDMxMDY3
             * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
             * gravatar_id :
             * url : https://api.github.com/users/Codertocat
             * html_url : https://github.com/Codertocat
             * followers_url : https://api.github.com/users/Codertocat/followers
             * following_url : https://api.github.com/users/Codertocat/following{/other_user}
             * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
             * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
             * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
             * organizations_url : https://api.github.com/users/Codertocat/orgs
             * repos_url : https://api.github.com/users/Codertocat/repos
             * events_url : https://api.github.com/users/Codertocat/events{/privacy}
             * received_events_url : https://api.github.com/users/Codertocat/received_events
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
         * login : Codertocat
         * id : 21031067
         * node_id : MDQ6VXNlcjIxMDMxMDY3
         * avatar_url : https://avatars1.githubusercontent.com/u/21031067?v=4
         * gravatar_id :
         * url : https://api.github.com/users/Codertocat
         * html_url : https://github.com/Codertocat
         * followers_url : https://api.github.com/users/Codertocat/followers
         * following_url : https://api.github.com/users/Codertocat/following{/other_user}
         * gists_url : https://api.github.com/users/Codertocat/gists{/gist_id}
         * starred_url : https://api.github.com/users/Codertocat/starred{/owner}{/repo}
         * subscriptions_url : https://api.github.com/users/Codertocat/subscriptions
         * organizations_url : https://api.github.com/users/Codertocat/orgs
         * repos_url : https://api.github.com/users/Codertocat/repos
         * events_url : https://api.github.com/users/Codertocat/events{/privacy}
         * received_events_url : https://api.github.com/users/Codertocat/received_events
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
