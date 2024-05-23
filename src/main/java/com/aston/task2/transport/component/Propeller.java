package com.aston.task2.transport.component;

public class Propeller {
    private int speedRotational;

    public Propeller(int speedRotational) {
        this.speedRotational = speedRotational;
    }

    public int getSpeedRotational() {
        return speedRotational;
    }

    public void setSpeedRotational(int speedRotational) {
        this.speedRotational = speedRotational;
    }

    @Override
    public String toString() {
        return " Винт " +
                " крутится со скоростью " + speedRotational;
    }
}
