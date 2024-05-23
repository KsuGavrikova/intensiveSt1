package com.aston.task2.transport.component;

public class Wheel {
    private int count;
    private int diameter;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Wheel(int count, int diameter) {
        this.count = count;
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Колесо" +
                " в количестве " + count +
                " шт, диаметр " + diameter +
                " см";
    }
}
