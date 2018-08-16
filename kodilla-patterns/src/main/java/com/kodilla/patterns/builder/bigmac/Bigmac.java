package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private final String bun;
    private final String sauce;
    private final int burgers;
    private final List<String> ingredients;

    public static class BigmacBuilder {
        private String bun;
        private String sauce;
        private int burgers;
        private List<String> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder burgers(int numberOfBurgers) {
            this.burgers = numberOfBurgers;
            return this;
        }

        public BigmacBuilder ingredient(String ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build() {
            return new Bigmac(bun, sauce, burgers, ingredients);
        }
    }

    private Bigmac(final String bun, final String sauce, final int burgers, final List<String> ingredients) {
        this.bun = bun;
        this.sauce = sauce;
        this.burgers = burgers;
        this.ingredients = ingredients;
    }

    public String getBun() {
        return bun;
    }

    public String getSauce() {
        return sauce;
    }

    public int getBurgers() {
        return burgers;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", sauce='" + sauce + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                '}';
    }
}
