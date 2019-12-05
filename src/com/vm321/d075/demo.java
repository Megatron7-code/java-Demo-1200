package com.vm321.d075;

import java.util.Scanner;
import java.util.regex.Pattern;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String inputStr = scan.next();
        int amount = 0;
        for(int i = 0;i<inputStr.length();i++){
            boolean matches = Pattern.matches("^[\u4E00-\u9FA5]{0,}$", inputStr.charAt(i) + "");
            if(matches){
                amount++;
            }
        }
        System.out.println("中文字符有: " + amount + "位");
    }
}
