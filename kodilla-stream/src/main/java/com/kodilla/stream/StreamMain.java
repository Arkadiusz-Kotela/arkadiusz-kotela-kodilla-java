package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();

        Map<Integer, ForumUser> theMapOfForumUsers = forum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().lengthOfYear() > 19)
                .filter(forumUser -> forumUser.getNumberOfPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# Forum Users: " + theMapOfForumUsers.size());
        theMapOfForumUsers.entrySet().stream()
                .map(user -> "Key: " + user.getKey() + ", Value: " + user.getValue())
                .forEach(System.out::println);

    }
}
