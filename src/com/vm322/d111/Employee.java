package com.vm322.d111;

public class Employee implements Cloneable {
    private String name;
    private int age;
    private Address address;

    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("age: " + age + "\n");
        sbuilder.append("address: " + address + "\n");
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
}
