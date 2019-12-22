package com.vm323.d139;

import java.util.Date;

public class Test {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws ClassNotFoundException{
        System.out.println("the no.1 method:");
        Class c1 = new Date().getClass();
        System.out.println(c1.getName());

        System.out.println("the no.2 method:");
        Class c2 = boolean.class;
        System.out.println(c2.getName());

        System.out.println("the no.3 method:");
        Class c3 = Class.forName("java.lang.String");
        System.out.println(c3.getName());

        System.out.println("the no.4 method:");
        Class c4 = Double.TYPE;
        System.out.println(c4.getName());

    }
}
