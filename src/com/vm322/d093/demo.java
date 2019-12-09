package com.vm322.d093;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String inputStr = scan.next();
        try {
            int num = Integer.parseInt(inputStr);
            System.out.println("平方为：" + num * num);
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

    }
}
