package com.vm322.d098;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("java");
        employee.setSalary(100);
        employee.setBirthday(new Date());

        Manager manager = new Manager();
        manager.setName("CTO");
        manager.setSalary(3000);
        manager.setBirthday(new Date());
        manager.setBonus(2000);

        System.out.println("员工姓名: " + employee.getName());
        System.out.println("员工生日: " + employee.getBirthday());
        System.out.println("员工薪水: " + employee.getSalary());
        System.out.println("管理者姓名：" + manager.getName());
        System.out.println("管理者生日：" + manager.getBirthday());
        System.out.println("管理者薪水：" + (manager.getBonus() + manager.getSalary()));
    }
}
