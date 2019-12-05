package com.vm321.d074;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        StringBuilder sbuilder = new StringBuilder(scan.next());
        System.out.println("倒置后的字符：" + sbuilder.reverse().toString());
    }
}
