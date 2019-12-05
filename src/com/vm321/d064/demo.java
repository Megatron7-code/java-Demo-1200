package com.vm321.d064;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符: ");
        String temp = scan.next();
        System.out.println("输出大写：" + temp.toUpperCase());
        System.out.println("输出小写：" + temp.toLowerCase());
    }
}
