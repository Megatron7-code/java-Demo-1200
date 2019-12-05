package com.vm321.d065;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String temp = scan.next();
        char[] charArr = temp.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char c: charArr){
            builder.append((int)c + "");
        }

        System.out.println(temp + "字符对应的unicode码：" + builder.toString());

        int code = Integer.valueOf(builder.toString());
        System.out.println(builder.toString() + "unicode码对应的字符：" + (char) code);
    }
}
