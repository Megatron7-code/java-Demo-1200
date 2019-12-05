package com.vm321.d073;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        String[] lines = scan.next().split(",");
        StringBuilder sbuilder = new StringBuilder();
        for(String line: lines){
            sbuilder.append(line + "\n");
        }
        System.out.println("最终字符：\n" + sbuilder.toString());
    }
}
