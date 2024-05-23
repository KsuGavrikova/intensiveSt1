package com.aston.task2;


import com.aston.task2.biology.Animal;
import com.aston.task2.biology.impl.Bear;
import com.aston.task2.biology.impl.Cat;
import com.aston.task2.biology.impl.Fish;
import com.aston.task2.biology.impl.Whale;
import com.aston.task2.biology.specialty.Fur;
import com.aston.task2.transport.Vehicle;
import com.aston.task2.transport.component.Propeller;
import com.aston.task2.transport.component.Wheel;
import com.aston.task2.transport.component.Wing;
import com.aston.task2.transport.impl.Airplane;
import com.aston.task2.transport.impl.Boat;
import com.aston.task2.transport.impl.Helicopter;
import com.aston.task2.transport.impl.Tanker;
import com.aston.task2.transport.impl.Taxi;
import com.aston.task2.transport.impl.Truck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Bear(new Fur(" бурого")));
        animals.add(new Cat(new Fur(" белого")));
        animals.add(new Fish());
        animals.add(new Whale(50));

        for (Animal a : animals) {
            System.out.println(a);
        }

        List<Vehicle> park = new ArrayList<>();
        park.add(new Airplane(new Wheel(3, 35), new Wing(), new Propeller(360)));
        park.add(new Boat(new Propeller(120)));
        park.add(new Helicopter(new Wheel(4, 45),new Propeller(450)));
        park.add(new Tanker(new Propeller(360)));
        park.add(new Truck(new Wheel(8, 56)));
        park.add(new Taxi(new Wheel(4, 36)));

        for (Vehicle a:park) {
            System.out.println(a);
        }

    }

}