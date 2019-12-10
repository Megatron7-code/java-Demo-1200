package com.vm322.d110;

public class Employee implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("名字：" + name + "\n");
        sbuilder.append("年龄：" + age + "\n");
        sbuilder.append("地址：" + address + "\n");
        return sbuilder.toString();
    }

    @Override
    public Employee clone(){
        Employee employee = null;
        try {
            employee = (Employee)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return employee;
    }

}
