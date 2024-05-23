package com.aston.task2.transport.impl;

import com.aston.task2.transport.component.Wheel;
import com.aston.task2.transport.specification.CarryCargo;
import com.aston.task2.transport.specification.LandVehicle;

public class Truck extends LandVehicle implements CarryCargo {
    private final Wheel wheel;

    public Truck(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Грузовик " +
                "имеет " + wheel + fastening();
    }
}
