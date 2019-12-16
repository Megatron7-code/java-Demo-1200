package com.vm322.d115;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Employee employee) {
        if(this.id < employee.id){
            return -1;
        }else if(this.id > employee.id){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("id: " + id + "\n");
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("age: " + age + "\n");
        return sbuilder.toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
