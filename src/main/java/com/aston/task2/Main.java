package com.aston.task2;


import com.aston.task2.biology.Animal;
import com.aston.task2.biology.impl.Bear;
import com.aston.task2.biology.impl.Cat;
import com.aston.task2.biology.impl.Fish;
import com.aston.task2.biology.impl.Whale;
import com.aston.task2.biology.specialty.Fur;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Bear(new Fur(" бурого")));
        animals.add(new Cat(new Fur(" белого")));
        animals.add(new Fish());
        animals.add(new Whale(50));

        for (Animal a:animals) {
            System.out.println(a);
        }
    }

}