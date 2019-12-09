package com.vm322.d097;

public class demo {
    public static void main(String[] args) {
        Double num1 = 12.4;
        Double num2 = 13.4;

        System.out.println("num1:"+ num1);
        System.out.println("num2:"+ num2);

        switch (num1.compareTo(num2)){
            case -1:
                System.out.println(" num1 < num2 ");
                break;
            case 0:
                System.out.println(" num1 = num2 ");
                break;
            case 1:
                System.out.println(" num1 > num2 ");
                break;
        }
    }
}
