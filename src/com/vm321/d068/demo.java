package com.vm321.d068;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入协议头: ");
        String request = scan.next();

        if(request.startsWith("http")){
            System.out.println("您输入的是http地址");
        }else if(request.startsWith("ftp")){
            System.out.println("您输入的是ftp地址");
        }else{
            System.out.println("您输入的不正确");
        }
    }
}
