package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> userNames();
    int postCount();
    int commentsCount();
}
