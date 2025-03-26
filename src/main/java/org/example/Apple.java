/**
 * Класс Apple это наша доменная модель. Этот класс предстваляет собой яблоко,
 * которое обладает двумя свойствами: цветом и весом (в граммах).
 */
package org.example;

class Apple {
    private String color;
    private int weight;

    public Apple(String color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
