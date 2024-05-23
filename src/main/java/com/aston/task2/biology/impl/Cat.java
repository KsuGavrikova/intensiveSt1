package com.aston.task2.biology.impl;


import com.aston.task2.biology.Mammal;
import com.aston.task2.biology.specialty.Fur;

public class Cat extends Mammal {
    private Fur fur;

    @Override
    public String toString() {
        return "Кошка " +
                "имеет " + fur;
    }

    public Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    public Cat(Fur fur) {
        this.fur = fur;
    }
}
