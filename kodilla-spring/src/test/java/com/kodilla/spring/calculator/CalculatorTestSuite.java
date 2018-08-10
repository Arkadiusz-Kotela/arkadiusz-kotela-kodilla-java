package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(1, 2);
        double sub = calculator.sub(2, 1);
        double mul = calculator.mul(3, 4);
        double div = calculator.div(4, 3);

        //Then
        Assert.assertEquals(3, add, 0);
        Assert.assertEquals(1, sub, 0);
        Assert.assertEquals(12, mul, 0);
        Assert.assertEquals(1.33, div, 0.01);
    }

    @Test
    public void testContext(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(Calculator.class, Display.class);
        //When & Then
        System.out.println("========= Beans list: ===========>>");
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("<<========= Beans list ============");
    }

}
