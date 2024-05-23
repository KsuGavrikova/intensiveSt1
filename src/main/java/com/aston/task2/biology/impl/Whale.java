package com.aston.task2.biology.impl;

import com.aston.task2.biology.Mammal;
import com.aston.task2.biology.specialty.Watercraft;

public class Whale extends Mammal implements Watercraft {

    public Whale(int spine) {
        super.spine = new Spine(spine);
    }

    @Override
    public String toString() {
        return "Кит" + spine.toString();
    }
}
