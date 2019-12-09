package com.vm322.d107;

import java.awt.*;

public class Cat {
    private String name;
    private int age;
    private double weight;
    private Color color;

    public Cat(String name, int age, double weight, Color color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("age: " + age + "\n");
        sbuilder.append("weight: " + weight + "\n");
        sbuilder.append("color: " + color + "\n");
        return sbuilder.toString();
    }
}
