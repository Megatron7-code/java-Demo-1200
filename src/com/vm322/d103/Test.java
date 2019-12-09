package com.vm322.d103;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java", 21, 12.4, Color.BLACK);
        Cat cat2 = new Cat("PHP", 17, 16.2, Color.ORANGE);
        Cat cat3 = new Cat("python", 4, 5.8, Color.WHITE);
        Cat cat4 = new Cat("python", 4, 5.8, Color.WHITE);

        System.out.println("cat1:" + cat1);
        System.out.println("cat2:" + cat2);
        System.out.println("cat3:" + cat3);
        System.out.println("cat1 : cat2  " + cat1.equals(cat2));
        System.out.println("cat2 : cat3  " + cat2.equals(cat3));
        System.out.println("cat3 : cat4  " + cat3.equals(cat4));
    }
}
