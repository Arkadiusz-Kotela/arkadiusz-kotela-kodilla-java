package com.kodilla.stream.beautyfier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator) {
        String decoratedText = poemDecorator.decorate(text);
        System.out.println("Decorated text: " + decoratedText);
    }
}
