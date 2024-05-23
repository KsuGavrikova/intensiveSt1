package com.aston.task2.transport.specification;

import com.aston.task2.transport.Vehicle;

public abstract class WaterVehicle implements Vehicle {
    @Override
    public String move() {
        return " Плывет";
    }

}
