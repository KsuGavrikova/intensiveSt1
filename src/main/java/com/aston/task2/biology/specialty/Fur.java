package com.aston.task2.biology.specialty;

public class Fur {
    @Override
    public String toString() {
        return "Шерсть" + color + " цвета";
    }

    public Fur(String color) {
        this.color = color;
    }

    private String color;
}
