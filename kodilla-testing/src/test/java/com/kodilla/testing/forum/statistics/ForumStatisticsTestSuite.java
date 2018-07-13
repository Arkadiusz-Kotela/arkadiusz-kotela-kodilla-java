package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Matchers.doubleThat;
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

    @Test(expected = NullPointerException.class)
    public void testCalculateAdvStatisticsMock1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        Statistics statistics = new Statistics() {
            @Override
            public List<String> userNames() {
                return null;
            }

            @Override
            public int postCount() {
                return 0;
            }

            @Override
            public int commentsCount() {
                return 0;
            }
        };
        when(statisticsMock.userNames()).thenReturn(statistics.userNames());
        when(statisticsMock.postCount()).thenReturn(statistics.postCount());
        when(statisticsMock.commentsCount()).thenReturn(statistics.commentsCount());

        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        //When
        double averageNumberOfCommentsPerForumUser = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumUsers();
        double averageNumberOfCommentsPerPost = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumPosts();
        double averageNumberOfPostsPerForumUser = (double) forumStatistics.getNumberOfForumPosts()
                / forumStatistics.getNumberOfForumUsers();

        //Then
        Assert.assertEquals(0.0, averageNumberOfCommentsPerForumUser, 0.0);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerPost, 0.0);
        Assert.assertEquals(0.0, averageNumberOfPostsPerForumUser, 0.0);

    }

    @Test
    public void testCalculateAdvStatisticsMock2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        Statistics statistics = new Statistics() {

            @Override
            public List<String> userNames() {
                List<String> users = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    users.add("User: " + i);
                }
                return users;
            }

            @Override
            public int postCount() {
                return 1000;
            }

            @Override
            public int commentsCount() {
                return 500;
            }
        };
        when(statisticsMock.userNames()).thenReturn(statistics.userNames());
        when(statisticsMock.postCount()).thenReturn(statistics.postCount());
        when(statisticsMock.commentsCount()).thenReturn(statistics.commentsCount());

        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        //When
        double averageNumberOfCommentsPerForumUser = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumUsers();
        double averageNumberOfCommentsPerPost = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumPosts();
        double averageNumberOfPostsPerForumUser = (double) forumStatistics.getNumberOfForumPosts()
                / forumStatistics.getNumberOfForumUsers();

        //Then
        Assert.assertEquals(5.0, averageNumberOfCommentsPerForumUser, 0.0);
        Assert.assertEquals(0.5, averageNumberOfCommentsPerPost, 0.0);
        Assert.assertEquals(10.0, averageNumberOfPostsPerForumUser, 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsMock3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        Statistics statistics = new Statistics() {

            @Override
            public List<String> userNames() {
                List<String> users = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    users.add("User: " + i);
                }
                return users;
            }

            @Override
            public int postCount() {
                return 500;
            }

            @Override
            public int commentsCount() {
                return 10000;
            }
        };
        when(statisticsMock.userNames()).thenReturn(statistics.userNames());
        when(statisticsMock.postCount()).thenReturn(statistics.postCount());
        when(statisticsMock.commentsCount()).thenReturn(statistics.commentsCount());

        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        //When
        double averageNumberOfCommentsPerForumUser = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumUsers();
        double averageNumberOfCommentsPerPost = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumPosts();
        double averageNumberOfPostsPerForumUser = (double) forumStatistics.getNumberOfForumPosts()
                / forumStatistics.getNumberOfForumUsers();

        //Then
        Assert.assertEquals(100.0, averageNumberOfCommentsPerForumUser, 0.0);
        Assert.assertEquals(20.0, averageNumberOfCommentsPerPost, 0.0);
        Assert.assertEquals(5.0, averageNumberOfPostsPerForumUser, 0.0);
    }

    @Test
    public void testCalculateAdvStatisticsMock4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        Statistics statistics = new Statistics() {

            @Override
            public List<String> userNames() {
                List<String> users = new ArrayList<>();
                for (int i = 0; i < 100; i++) {
                    users.add("User: " + i);
                }
                return users;
            }

            @Override
            public int postCount() {
                return 1000;
            }

            @Override
            public int commentsCount() {
                return 0;
            }
        };
        when(statisticsMock.userNames()).thenReturn(statistics.userNames());
        when(statisticsMock.postCount()).thenReturn(statistics.postCount());
        when(statisticsMock.commentsCount()).thenReturn(statistics.commentsCount());

        ForumStatistics forumStatistics = new ForumStatistics(statistics);

        //When
        double averageNumberOfCommentsPerForumUser = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumUsers();
        double averageNumberOfCommentsPerPost = (double) forumStatistics.getNumberOfForumComments()
                / forumStatistics.getNumberOfForumPosts();
        double averageNumberOfPostsPerForumUser = (double) forumStatistics.getNumberOfForumPosts()
                / forumStatistics.getNumberOfForumUsers();

        //Then
        Assert.assertEquals(0.0, averageNumberOfCommentsPerForumUser, 0.0);
        Assert.assertEquals(0.0, averageNumberOfCommentsPerPost, 0.0);
        Assert.assertEquals(10.0, averageNumberOfPostsPerForumUser, 0.0);
    }
}
