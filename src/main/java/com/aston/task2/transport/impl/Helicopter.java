package com.aston.task2.transport.impl;

import com.aston.task2.transport.component.Propeller;
import com.aston.task2.transport.component.Wheel;
import com.aston.task2.transport.specification.AirVehicle;
import com.aston.task2.transport.specification.CarryCargo;

public class Helicopter extends AirVehicle implements CarryCargo {
    private final Wheel wheel;
    private final Propeller propeller;

    public Helicopter(Wheel wheel, Propeller propeller) {
        this.wheel = wheel;
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Вертолет " +
                "имеет " + wheel +
                ", " + propeller + fastening();
    }
}
