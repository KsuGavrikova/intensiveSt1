package com.aston.task2.biology.impl;

import com.aston.task2.biology.Animal;
import com.aston.task2.biology.specialty.Watercraft;

public class Fish implements Animal, Watercraft {
    @Override
    public String toString() {
        return "Рыба";
    }
}
