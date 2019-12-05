package com.vm322.d081;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符: ");
        String inputStr = scan.nextLine();
        StringBuilder sbuilder = new StringBuilder();
        for(int i =0;i<inputStr.length();i++){
            if(inputStr.charAt(i) == ' ')
                continue;
            sbuilder.append(inputStr.charAt(i));
        }
        System.out.println("处理结果为： " + sbuilder.toString());
    }
}
