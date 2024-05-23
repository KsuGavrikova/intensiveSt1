package com.aston.task2.transport.impl;

import com.aston.task2.transport.component.Wheel;
import com.aston.task2.transport.specification.LandVehicle;

public class Taxi extends LandVehicle {
    private final Wheel wheel;

    public Taxi(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Такси " +
                "имеет " + wheel;
    }
}
