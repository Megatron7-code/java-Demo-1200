package com.vm321.d071;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入IP地址: ");
        String inputStr = scan.next();
        String regex = "^([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])\\." +
                "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])$";

        /**
         * IP正则分为4段，每段由1-255组成
         * 1位：[1-9]
         * 2位：[1-9]\d
         * 3位1打头：1\d{2}
         * 3位2打头：2[0-4]\d
         * 3位2打头前两位固定：25[0-5]
         *
         * ([1-9]|[1-9]\d|1\d{2}|2[0-4]\d|25[0-5])
         */
        if(inputStr.matches(regex)){
            System.out.println("IP符合");
        }else{
            System.out.println("IP不符合");
        }
    }
}
