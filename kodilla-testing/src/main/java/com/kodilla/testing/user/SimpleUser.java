package com.kodilla.testing.user;

public class SimpleUser {
    private String userName;
    private String realUserName;

    public SimpleUser(String userName, String realUserName) {
        this.userName = userName;
        this.realUserName = realUserName;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealUserName() {
        return realUserName;
    }
}
