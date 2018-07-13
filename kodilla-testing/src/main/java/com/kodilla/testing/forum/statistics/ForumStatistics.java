package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private Statistics statistics;
    private double averageNumberOfPostsPerForumUser;
    private double averageNumberOfCommentsPerForumUser;
    private double averageNumberOfCommentsPerPost;


    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }


    public int getNumberOfForumUsers() {
        int numberOfForumUsers = statistics.userNames().size();
        return numberOfForumUsers;
    }

    public int getNumberOfForumPosts() {
        int numberOfForumPosts = statistics.postCount();
        return numberOfForumPosts;
    }

    public int getNumberOfForumComments() {
        int numberOfForumComments = statistics.commentsCount();
        return numberOfForumComments;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        if (statistics.commentsCount() == 0 && statistics.userNames().size() == 0) {
            averageNumberOfCommentsPerForumUser = 0;
        } else if (statistics.userNames().size() == 0) {
            averageNumberOfCommentsPerForumUser = 0;
        } else {
            averageNumberOfCommentsPerForumUser = (double) statistics.commentsCount() / statistics.userNames().size();
        }

        if (statistics.commentsCount() == 0 && statistics.postCount() == 0) {
            averageNumberOfCommentsPerPost = 0;
        } else if (statistics.postCount() == 0) {
            averageNumberOfCommentsPerPost = 0;
        } else {
            averageNumberOfCommentsPerPost = (double) statistics.commentsCount() / statistics.postCount();
        }

        if (statistics.postCount() == 0 && statistics.userNames().size() == 0){
            averageNumberOfPostsPerForumUser = 0;
        } else if (statistics.userNames().size() == 0) {
            averageNumberOfPostsPerForumUser =0;
        } else {
            averageNumberOfPostsPerForumUser = (double) statistics.postCount() / statistics.userNames().size();
        }
    }

    public void showStatistics() {
        System.out.println("Number of forum users: " + getNumberOfForumUsers());
        System.out.println("Number of forum posts: " + getNumberOfForumPosts());
        System.out.println("Number of forum comments: " + getNumberOfForumComments());
        System.out.println("Average number of posts per forum users: " + averageNumberOfPostsPerForumUser);
        System.out.println("Average number of comments per forum users: " + averageNumberOfCommentsPerForumUser);
        System.out.println("Average number comments per post: " + averageNumberOfCommentsPerPost);
    }
}
