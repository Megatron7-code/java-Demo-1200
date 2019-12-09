package com.vm322.d088;

public class EmperorTest {
    public static void main(String[] args) {
        System.out.println("创建对象1");
        Emperor emperor = Emperor.getInstance();
        emperor.getName();
        System.out.println("创建对象2");
        Emperor emperor1 = Emperor.getInstance();
        emperor1.getName();
        System.out.println("创建对象3");
        Emperor emperor2 = Emperor.getInstance();
        emperor2.getName();
    }
}
