package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int counter;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println(name + " new homework! " + student.getName() + " has: " + student.getHomeworkList().size() + " homework");
        counter++;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }
}
