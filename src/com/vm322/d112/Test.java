package com.vm322.d112;

public class Test {
    public static void main(String[] args) {
        System.out.println("start...");
        Address address = new Address("中国", "湖北", "武汉");
        Employee employee1 = new Employee("赵子龙", 18, address);
        System.out.println("employee1: " + employee1);

        System.out.println("clone launch...");

        Employee employee2 = employee1.clone();
        employee2.getAddress().setCity("宜昌");
        employee2.setName("王小五");
        employee2.setAge(21);
        System.out.println("employee2: " + employee2);
        System.out.println("employee1: " + employee1);
    }
}
