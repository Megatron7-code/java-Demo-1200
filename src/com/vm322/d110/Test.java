package com.vm322.d110;

public class Test {
    public static void main(String[] args) {
        System.out.println("clone start.");
        Address address = new Address("中国", "浙江", "杭州");
        Employee employee1 = new Employee("阿里弟弟", 21, address);
        System.out.println("employee1: " + employee1);

        System.out.println("clone launch..");
        Employee employee2 = employee1.clone();
        employee2.getAddress().setCity("宁波");
        employee2.setAge(18);
        employee2.setName("网难");
        System.out.println("employee2: " + employee2);
        System.out.println("employee1: " + employee1);
    }
}
