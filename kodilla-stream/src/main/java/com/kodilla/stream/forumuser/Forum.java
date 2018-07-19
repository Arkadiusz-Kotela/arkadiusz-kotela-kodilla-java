package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum() {
        forumUsersList.add(new ForumUser(
                1,
                "User1",
                'M',
                LocalDate.of(1997, 12, 27),
                46));
        forumUsersList.add(new ForumUser(
                2,
                "User1",
                'M',
                LocalDate.of(1998, 7, 27),
                0));
        forumUsersList.add(new ForumUser(
                3,
                "User3",
                'M',
                LocalDate.of(1998, 7, 17),
                123));
        forumUsersList.add(new ForumUser(
                4,
                "User4",
                'K',
                LocalDate.of(1997, 12, 27),
                12));
        forumUsersList.add(new ForumUser(
                5,
                "User5",
                'M',
                LocalDate.of(1976, 12, 27),
                0));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(forumUsersList);
    }
}
