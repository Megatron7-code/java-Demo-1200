package com.vm322.d094;

import java.util.Scanner;

import static java.lang.Integer.*;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        int num = scan.nextInt();

        System.out.println("字符的二进制表示:" + toBinaryString(num));
        System.out.println("字符的八进制表示:" + toOctalString(num));
        System.out.println("字符的十六进制表示:" + toHexString(num));
    }
}
