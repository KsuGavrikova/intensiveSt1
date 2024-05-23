package com.aston.task2.biology.impl;


import com.aston.task2.biology.Mammal;
import com.aston.task2.biology.specialty.Fur;

public class Bear extends Mammal {
    private Fur fur;

    @Override
    public String toString() {
        return "Медведь " +
                "имеет " + fur;
    }

    public Fur getFur() {
        return fur;
    }

    public void setFur(Fur fur) {
        this.fur = fur;
    }

    public Bear(Fur fur) {
        this.fur = fur;
    }
}
