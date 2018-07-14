package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;
    private int numberOfForumUsers;
    private int numberOfForumPosts;
    private int numberOfForumComments;

    private double averageNumberOfPostsPerForumUser;
    private double averageNumberOfCommentsPerForumUser;
    private double averageNumberOfCommentsPerPost;

    public void setNumberOfForumUsers(Statistics statistics) {
        this.numberOfForumUsers = statistics.userNames().size();
    }

    public void setNumberOfForumPosts(Statistics statistics){
        this.numberOfForumPosts = statistics.postCount();
    }

    public void setNumberOfForumComments(Statistics statistics) {
        this.numberOfForumComments = statistics.commentsCount();
    }

    public void calculateAdvStatistics(Statistics statistics) {
        setNumberOfForumComments(statistics);
        setNumberOfForumPosts(statistics);
        setNumberOfForumUsers(statistics);
        averageNumberOfPostsPerForumUser = (double) numberOfForumPosts / numberOfForumUsers;
        averageNumberOfCommentsPerForumUser = (double) numberOfForumComments / numberOfForumUsers;
        averageNumberOfCommentsPerPost = (double) numberOfForumComments / numberOfForumPosts;

        if (numberOfForumUsers == 0) {
            averageNumberOfCommentsPerForumUser = 0;
            averageNumberOfPostsPerForumUser = 0;
        } else if (numberOfForumPosts == 0) {
            averageNumberOfCommentsPerPost = 0;
        } else if (numberOfForumComments == 0) {
            averageNumberOfCommentsPerPost = 0;
            averageNumberOfCommentsPerForumUser = 0;
        } else {
            averageNumberOfPostsPerForumUser = (double) numberOfForumPosts / numberOfForumUsers;
            averageNumberOfCommentsPerForumUser = (double) numberOfForumComments / numberOfForumUsers;
            averageNumberOfCommentsPerPost = (double) numberOfForumComments / numberOfForumPosts;
        }
    }

    public double getAverageNumberOfPostsPerForumUser() {
        return averageNumberOfPostsPerForumUser;
    }

    public double getAverageNumberOfCommentsPerForumUser() {
        return averageNumberOfCommentsPerForumUser;
    }

    public double getAverageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public int getNumberOfForumUsers() {
        return numberOfForumUsers;
    }

    public int getNumberOfForumPosts() {
        return numberOfForumPosts;
    }

    public int getNumberOfForumComments() {
        return numberOfForumComments;
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
