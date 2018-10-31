package com.kodilla.patterns2.observer.homework;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable{
    private final String name;
    private Mentor mentor;
    private final List<String> homeworkList;

    public Student(String name) {
        this.name = name;
        this.homeworkList = new ArrayList<>();
    }

    public void addHomework(String job) {
        homeworkList.add(job);
        notifyMentor();
    }

    @Override
    public void addObserver(Mentor mentor) {
        this.mentor = mentor;
    }

    @Override
    public void notifyMentor() {
        mentor.update(this);
    }

    public String getName() {
        return name;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public List<String> getHomeworkList() {
        return homeworkList;
    }
}
