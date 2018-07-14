package com.kodilla.testing.forum.statistics;

import org.junit.*;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {

    private static int testCounter = 0;

    private List<String> userListGenerator(int numberOfUsers) {
        List<String> usersList = new ArrayList<>();
        for (int i = 0; i < numberOfUsers; i++) {
            usersList.add("User" + i);
        }
        return usersList;
    }

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
    public void testCalculateAdvStatistics() {
        //Given
        List<String> usersList = userListGenerator(100);
        int comments = 10;
        int posts = 10;

        when(statisticMock.userNames()).thenReturn(usersList);
        when(statisticMock.commentsCount()).thenReturn(comments);
        when(statisticMock.postCount()).thenReturn(posts);

        ForumStatistics forumStatistics = new ForumStatistics(statisticMock);
        forumStatistics.setNumberOfForumUsers(statisticMock);
        forumStatistics.setNumberOfForumPosts(statisticMock);
        forumStatistics.setNumberOfForumComments(statisticMock);

        //When
        int numberOfForumUsers = forumStatistics.getNumberOfForumUsers();
        int numberOfForumComments = forumStatistics.getNumberOfForumComments();
        int numberOfForumPosts = forumStatistics.getNumberOfForumPosts();

        //Then
        Assert.assertEquals(100, numberOfForumUsers);
        Assert.assertEquals(10, numberOfForumComments);
        Assert.assertEquals(10, numberOfForumPosts);
    }

    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        List<String> usersList = userListGenerator(1234);
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
        Assert.assertEquals(11.13, avgComPerUser, 0.01);
        Assert.assertEquals(0.46, avgPostPerUser, 0.01);
        Assert.assertEquals(24.21, avgComPerPost,0.01);
    }
}
