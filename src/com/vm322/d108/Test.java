package com.vm322.d108;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("java", 12, 9.45, Color.BLUE);
        Cat cat2 = new Cat("php:", 8, 9.32, Color.YELLOW);
        Cat cat3 = new Cat("python", 9, 7.12, Color.WHITE);

        System.out.println("cat1: " + cat1);
        System.out.println("cat2: " + cat2);
        System.out.println("cat3: " + cat3);
    }
}
