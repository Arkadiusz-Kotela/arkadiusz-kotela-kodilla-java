package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.*;

public class ForumUserTest {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser jKowalski = new ForumUser("Jan Kowalski");
        ForumUser aNowak = new ForumUser("Adam Nowak");
        ForumUser jDoe = new ForumUser("John DOe");

        javaHelpForum.registerObserver(jDoe);
        javaToolsForum.registerObserver(jDoe);
        javaHelpForum.registerObserver(jKowalski);
        javaToolsForum.registerObserver(aNowak);

        //When
        javaHelpForum.addPost("Hi. aaaaaaaaaaaaaaaaaa");
        javaHelpForum.addPost("Hello!. bbbbbbbbbbbbbbb");
        javaHelpForum.addPost("JavaHelp!!!!");
        javaToolsForum.addPost("Toooooooooooooooooools");

        //Then
        assertEquals(4, jDoe.getUpdateCount());
        assertEquals(3, jKowalski.getUpdateCount());
        assertEquals(1, aNowak.getUpdateCount());
    }
}