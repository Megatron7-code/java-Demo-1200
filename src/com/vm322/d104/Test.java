package com.vm322.d104;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java", 12, 4.8, Color.BLACK);
        Cat cat2 = new Cat("php", 13, 5.8, Color.YELLOW);
        Cat cat3 = new Cat("python", 14, 6.8, Color.WHITE);
        Cat cat4 = new Cat("python", 14, 6.8, Color.WHITE);

        System.out.println("cat 1:" + cat1);
        System.out.println("cat 2:" + cat2);
        System.out.println("cat 3:" + cat3);
        System.out.println("cat 4:" + cat4);

        System.out.println("cat1 vs cat2:" + cat1.equals(cat2));
        System.out.println("cat3 vs cat4:" + cat3.equals(cat4));
    }
}
