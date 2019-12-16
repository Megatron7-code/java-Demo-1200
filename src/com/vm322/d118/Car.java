package com.vm322.d118;

public class Car {
    private String name;
    private double speed;

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("speed: " + speed + "\n");
        return sbuilder.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
