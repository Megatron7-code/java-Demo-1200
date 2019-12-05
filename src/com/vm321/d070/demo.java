package com.vm321.d070;

import java.util.Scanner;
import org.apache.commons.lang3.math.NumberUtils;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符: ");
        String inputStr = scan.next();

        if(NumberUtils.isDigits(inputStr)){
            System.out.println("是数字");
        }else{
            System.out.println("不是数字");
        }

    }
}
