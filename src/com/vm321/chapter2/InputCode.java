package com.vm321.chapter2;

import java.util.Scanner;

/**
 * Created by Megatron on 2017/1/14.
 */
public class InputCode {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);//创建输入流扫描器
        System.out.println("请输入你的身份证号:");//提示用户输入
        String line = scanner.nextLine();//获取用户输入的一行文本
        //打印对输入文本的描述
        System.out.println("原来你的身份证号是"+line.length()+"位的数字啊");

    }
}
