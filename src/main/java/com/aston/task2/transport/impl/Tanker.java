package com.aston.task2.transport.impl;

import com.aston.task2.transport.component.Propeller;
import com.aston.task2.transport.specification.CarryCargo;
import com.aston.task2.transport.specification.WaterVehicle;

public class Tanker extends WaterVehicle implements CarryCargo {
    private final Propeller propeller;

    public Tanker(Propeller propeller) {
        this.propeller = propeller;
    }

    @Override
    public String fastening() {
        return " Может перевозить огромные грузы.";
    }

    @Override
    public String toString() {
        return "Танкер " +
                "имеет " + propeller + fastening();
    }
}
