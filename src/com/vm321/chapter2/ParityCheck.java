package com.vm321.chapter2;

import java.util.Scanner;

/**
 * Created by Megatron on 2017/1/17.
 */
public class ParityCheck {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入一个整数：");
        long number = scan.nextLong();//获取用户输入发整数
        String check = (number % 2 == 0?"偶数":"奇数");
        System.out.println(check);
    }

}
