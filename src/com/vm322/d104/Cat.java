package com.vm322.d104;

import org.apache.commons.lang3.builder.EqualsBuilder;

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
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Cat cat = (Cat) obj;
        return new EqualsBuilder().append(name, cat.name).append(age, cat.age).append(weight, cat.weight).append(color, cat.color).isEquals();
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("名字" + name + "\n");
        sbuilder.append("年龄" + age + "\n");
        sbuilder.append("体重" + weight + "\n");
        sbuilder.append("颜色" + color + "\n");
        return sbuilder.toString();
    }
}
