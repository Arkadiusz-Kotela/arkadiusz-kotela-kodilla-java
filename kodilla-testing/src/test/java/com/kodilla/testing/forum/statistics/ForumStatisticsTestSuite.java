package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Mock
    Statistics statisticMock = mock(Statistics.class);

    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        List<String> usersList = userListGenerator(1234);
        int comments = 13726;
        int posts = 0;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(11.13, avgComPerUser, 0.01);
        Assert.assertEquals(0.0, avgPostPerUser, 0.0);
        Assert.assertEquals(0.0, avgComPerPost, 0.00);
    }
    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        List<String> usersList = userListGenerator(1234);
        int comments = 13726;
        int posts = 1000;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(11.13, avgComPerUser, 0.01);
        Assert.assertEquals(0.81, avgPostPerUser, 0.01);
        Assert.assertEquals(13.73, avgComPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        List<String> usersList = userListGenerator(1234);
        int comments = 0;
        int posts = 567;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.0, avgComPerUser, 0.0);
        Assert.assertEquals(0.46, avgPostPerUser, 0.01);
        Assert.assertEquals(0.0, avgComPerPost, 0.0);
    }

    @Test
    public void testCalculateAdvStatistics4() {
        //Given
        List<String> usersList = userListGenerator(1234);
        int comments = 137;
        int posts = 567;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.12, avgComPerUser, 0.01);
        Assert.assertEquals(0.46, avgPostPerUser, 0.01);
        Assert.assertEquals(0.24, avgComPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics5() {
        //Given
        List<String> usersList = userListGenerator(1234);
        int comments = 568;
        int posts = 567;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.46, avgComPerUser, 0.01);
        Assert.assertEquals(0.46, avgPostPerUser, 0.01);
        Assert.assertEquals(1.01, avgComPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics6() {
        //Given
        List<String> usersList = userListGenerator(0);
        int comments = 13726;
        int posts = 567;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(0.0, avgComPerUser, 0.0);
        Assert.assertEquals(0.0, avgPostPerUser, 0.0);
        Assert.assertEquals(24.21, avgComPerPost, 0.01);
    }

    @Test
    public void testCalculateAdvStatistics7() {
        //Given
        List<String> usersList = userListGenerator(100);
        int comments = 13726;
        int posts = 567;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.calculateAdvStatistics(statisticMock);

        //When
        double avgComPerUser = forumStatistics.getAverageNumberOfCommentsPerForumUser();
        double avgPostPerUser = forumStatistics.getAverageNumberOfPostsPerForumUser();
        double avgComPerPost = forumStatistics.getAverageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(137.26, avgComPerUser, 0.01);
        Assert.assertEquals(5.67, avgPostPerUser, 0.01);
        Assert.assertEquals(24.21, avgComPerPost, 0.01);
    }

    private List<String> userListGenerator(int numberOfUsers) {
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersList.add("User" + i);
        }
        return usersList;
    }
}
