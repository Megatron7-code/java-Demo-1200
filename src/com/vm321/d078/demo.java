package com.vm321.d078;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入文件地址： ");
        String filePath = scan.next();

        int lastSplitTag = filePath.lastIndexOf("/");
        int lastSplitPoint = filePath.lastIndexOf(".");
        System.out.println("文件路径：" + filePath.substring(0, lastSplitTag));
        System.out.println("文件名称：" + filePath.substring(lastSplitTag + 1, lastSplitPoint));
        System.out.println("文件后缀：" + filePath.substring(lastSplitPoint + 1));
    }
}
