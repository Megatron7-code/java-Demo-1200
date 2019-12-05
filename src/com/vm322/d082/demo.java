package com.vm322.d082;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符: ");
        String inputStr = scan.next();
        if(inputStr.length() > 2){
            System.out.println("请不要输入过多的汉字");
            return;
        }
        byte[] codeBit = inputStr.getBytes();
        if(codeBit.length < 2){
            System.out.println("您输入的好像不是汉字");
            return;
        }
        codeBit[0] -= 160;
        codeBit[1] -= 160;

        String code = formatNumber(codeBit[0]) + formatNumber(codeBit[1]);
        System.out.println("对应区位码：" + code);
    }

    private static String formatNumber(int num) {
        String format = String.format("%02d", num);
        return format;
    }
}
