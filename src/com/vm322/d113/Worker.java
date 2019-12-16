package com.vm322.d113;

public class Worker implements Cloneable {
    private String name;
    private int age;

    public Worker(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("name: " + name + "\n");
        sbuilder.append("age: " + age + "\n");
        return sbuilder.toString();
    }

    @Override
    protected Worker clone(){
        Worker worker = null;
        try {
            worker = (Worker)super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return worker;
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
