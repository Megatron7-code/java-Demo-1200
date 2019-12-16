package com.vm322.d113;

import java.io.*;

public class Employee implements Cloneable, Serializable {
    private static final long serialVersionUID = 3049633041233214314L;
    private String name;
    private int age;

    public Employee(String name, int age) {
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
    public Employee clone(){
        Employee employee = null;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);
            oos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try {
            ObjectInputStream ois = new ObjectInputStream(bais);
            employee = (Employee)ois.readObject();
            ois.close();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return employee;
    }
}
