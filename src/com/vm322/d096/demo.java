package com.vm322.d096;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String inputStr = scan.next();
        int point = Character.codePointAt(inputStr, 0);
        System.out.println("字符位：" + point);

        System.out.println("位转字符" + (char)point);
    }

}
