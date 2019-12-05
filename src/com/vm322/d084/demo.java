package com.vm322.d084;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        System.out.println("请输入要转换的温度：");
        Scanner scan = new Scanner(System.in);
        double centigrde = scan.nextDouble();
        demo temp = new demo();
        double fahrenheit = temp.toFahrenheit(centigrde);
        System.out.println("结果：" + fahrenheit);
    }

    public double toFahrenheit(double centigrade){
        double fahrenheit = 1.8 * centigrade + 32;
        return fahrenheit;
    }
}
