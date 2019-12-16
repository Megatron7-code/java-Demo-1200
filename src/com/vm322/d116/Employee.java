package com.vm322.d116;

import org.apache.commons.lang3.builder.CompareToBuilder;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("id: " + id + "\n");
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("age: " + age + "\n");
        return sbuilder.toString();
    }

    @Override
    public int compareTo(Employee employee) {
        return new CompareToBuilder().append(id, employee.id).append(name, employee.name).append(age, employee.age).toComparison();
    }
}
