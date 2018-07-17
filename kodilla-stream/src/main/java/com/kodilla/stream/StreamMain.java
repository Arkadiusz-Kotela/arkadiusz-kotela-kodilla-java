package com.kodilla.stream;

import com.kodilla.stream.beautyfier.PoemBeautifier;

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

    }
}
