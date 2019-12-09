package com.vm322.d109;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setName("lisa");
        employee1.setAge(18);

        System.out.println("employee1: " + employee1);

        Employee employee2 = employee1;
        System.out.println("==============");
        employee2.setAge(22);
        employee2.setName("m7");

        System.out.println("employee1: " + employee1);
        System.out.println("employee2: " + employee2);
    }
}
