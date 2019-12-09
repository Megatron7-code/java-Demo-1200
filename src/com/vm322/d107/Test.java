package com.vm322.d107;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java", 7, 6.32, Color.BLUE);
        Cat cat2 = new Cat("python ", 6, 4.98, Color.YELLOW);
        Cat cat3 = new Cat("php", 8, 9.67, Color.WHITE);
        Cat cat4 = new Cat("php", 8, 9.67, Color.WHITE);

        System.out.println("cat1: " + cat1);
        System.out.println("cat2: " + cat2);
        System.out.println("cat3: " + cat3);
        System.out.println("cat4: " + cat4);
    }
}
