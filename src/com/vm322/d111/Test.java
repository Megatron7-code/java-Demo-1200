package com.vm322.d111;

public class Test {
    public static void main(String[] args) {
        System.out.println("start.....");
        Address address = new Address("中国", "浙江", "杭州");
        Employee employee1 = new Employee("李静", 18, address);
        System.out.println("employee1: " + employee1);

        System.out.println("clone launch.");
        Employee employee2 = employee1.clone();
        Address address2 = address.clone();
        address2.setCity("宁波");
        employee2.setAddress(address2);
        employee2.setName("张强");
        employee2.setAge(22);
        System.out.println("employee2: " + employee2);
        System.out.println("employee1: " + employee1);
    }
}
