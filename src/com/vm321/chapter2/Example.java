package com.vm321.chapter2;

import java.util.Scanner;

/**
 * Created by Megatron on 2017/1/15.
 */
public class Example {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个英文字符串或解密字符串");
        String password = scan.nextLine();//获取用户的输入
        char[] array = password.toCharArray();//获取字符串数组
        for (int i = 0; i < array.length; i++) {//遍历字符数组
            array[i] = (char)(array[i]^16);//对每个数组元素进行异或运算
        }
        System.out.println("加密或解密结果如下：");
        System.out.println(new String(array));//输出密钥
    }
}
