package com.vm321.d072;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的手机号码： ");
        String phoneNum = scan.next();
        String regex = "^1[1-9]\\d{9}$";
        if(phoneNum.matches(regex)){
            System.out.println("合规");
        }else{
            System.out.println("不合规");
        }
    }
}
