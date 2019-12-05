package com.vm321.d079;

import java.util.Scanner;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入手机号码：");
        String inputStr = scan.next();

        String regex = "^1[1-9]\\d{9}$";
        if(Pattern.matches(regex, inputStr)){
            System.out.println("号码正常");
        }else{
            System.out.println("号码错误");
        }
    }
}
