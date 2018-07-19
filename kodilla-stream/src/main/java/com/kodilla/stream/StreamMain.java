package com.kodilla.stream;

import com.kodilla.stream.beautyfier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("ala ma kota",
                textToDecorate -> textToDecorate.toUpperCase());
        poemBeautifier.beautify("MENTORING IS THE BEST",
                textToDecorate -> textToDecorate.toLowerCase());
        poemBeautifier.beautify("I want to break free",
                textToDecorate -> textToDecorate.replace("want", "DO NOT WANT"));
        poemBeautifier.beautify("New text added at the end of this fraze: ",
                textToDecorate -> textToDecorate.concat(" concatenated text "));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
