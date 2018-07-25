package com.kodilla.exception.main;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;

public class ExceptionModuleRunner {
    public static void main(String[] args) throws ExceptionHandling {


        SecondChallenge sc = new SecondChallenge();
        System.out.println(sc.probablyIWillThrowException(1.5, 1.5));

//        FileReader fileReader = new FileReader();
//
//        try {
//            fileReader.readFile();
//        } catch (FileReaderException e) {
//            System.out.println("Problem while reading the file.");
//        }
    }
}
