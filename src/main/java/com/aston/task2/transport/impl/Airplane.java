package com.aston.task2.transport.impl;

import com.aston.task2.transport.component.Propeller;
import com.aston.task2.transport.component.Wheel;
import com.aston.task2.transport.component.Wing;
import com.aston.task2.transport.specification.AirVehicle;
import com.aston.task2.transport.specification.CarryCargo;

public class Airplane extends AirVehicle implements CarryCargo {
    private final Wheel wheel;
    private final Wing wing;
    private final Propeller propeller;

    public Airplane(Wheel wheel, Wing wing, Propeller propeller) {
        this.wheel = wheel;
        this.wing = wing;
        this.propeller = propeller;
    }

    @Override
    public String toString() {
        return "Самолет " +
                "имеет " + wheel +
                ", " + wing +
                ", " + propeller + fastening();
    }
}
