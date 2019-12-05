package com.vm321.d060;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        double num = sc.nextDouble();
        System.out.println("格式化内容如下：");
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CHINA);
        //输出格式化货币
        System.out.println("Locale.CHINA: " + format.format(num));
        System.out.println("Locale.US: " + NumberFormat.getCurrencyInstance(Locale.US).format(num));
        System.out.println("Locale.ENGLISH: " + NumberFormat.getCurrencyInstance(Locale.ENGLISH).format(num));
        System.out.println("Locale.TAIWAN: " + NumberFormat.getCurrencyInstance(Locale.TAIWAN).format(num));

    }
}
