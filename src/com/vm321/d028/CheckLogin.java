package com.vm321.d028;

import java.util.Scanner;

public class CheckLogin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = scan.nextLine();
        System.out.println("请输入密码：");
        String password = scan.nextLine();
        if(!username.equals("mr")){
            System.out.println("用户名非法");
        }else if(!password.equals("mrsoft")){
            System.out.println("登录密码错误");
        }else{
            System.out.println("恭喜您，登录成功");
        }
    }
}
