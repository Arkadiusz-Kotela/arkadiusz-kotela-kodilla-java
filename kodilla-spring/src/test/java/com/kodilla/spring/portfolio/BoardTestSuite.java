package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        String toDoTask = "New to do task";
        String inProgressTask = "New in progress task";
        String doneTask = "New done task";
        board.toDoList.addTask(toDoTask);
        board.inProgressList.addTask(inProgressTask);
        board.doneList.addTask(doneTask);

        String toDoResult = board.toDoList.isInTheList(toDoTask);
        String inProgressResult = board.inProgressList.isInTheList(inProgressTask);
        String doneResult = board.doneList.isInTheList(doneTask);

        //Then
        Assert.assertEquals("[New to do task]" , toDoResult);
        Assert.assertEquals("[New in progress task]" , inProgressResult);
        Assert.assertEquals("[New done task]" , doneResult);

    }

    @Test
    public void testContext() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //When & Then
        System.out.println("========= Beans list: ===========>>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<<========= Beans list ============");
    }
}
