package com.vm322.d116;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3, "java", 1);
        Employee employee2 = new Employee(2, "php", 2);
        Employee employee3 = new Employee(1, "python", 3);

        Employee[] employees = {employee1, employee2, employee3};
        System.out.println("排序前:");
        for(Employee employee:employees){
            System.out.println(employee);
        }
        Arrays.sort(employees);
        System.out.println("排序后:");
        for(Employee employee:employees){
            System.out.println(employee);
        }
    }
}
