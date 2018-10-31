package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTest {
    @Test
    public void testUpdate() {
        //Given
        Student s1 = new Student("Student1");
        Student s2 = new Student("Student2");
        Student s3 = new Student("Student3");
        Mentor m1 = new Mentor("Mentor1");
        Mentor m2 = new Mentor("Mentor2");

        s1.addObserver(m1);
        s2.addObserver(m1);
        s3.addObserver(m2);

        //When
        s1.addHomework("Homework 1");
        s1.addHomework("Homework 2");
        s1.addHomework("Homework 3");
        s1.addHomework("Homework 4");
        s2.addHomework("Homework 1");
        s2.addHomework("Homework 2");
        s2.addHomework("Homework 3");
        s2.addHomework("Homework 4");
        s3.addHomework("Homework 1");
        s3.addHomework("Homework 2");
        s3.addHomework("Homework 3");
        s3.addHomework("Homework 4");

        //Then
        Assert.assertEquals(8, m1.getCounter());
        Assert.assertEquals(4, m2.getCounter());

    }
}