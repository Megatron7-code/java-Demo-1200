package com.vm321.d066;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符:");

        String name = scan.next().toLowerCase();
        if(name.equals("admin")){
            System.out.println("该账户是管理账户");
        }else if(name.equals("user")){
            System.out.println("该账户已经存在");
        }else{
            System.out.println("你的账户名是: " + name);
        }
    }
}
