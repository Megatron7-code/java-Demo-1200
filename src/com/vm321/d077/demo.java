package com.vm321.d077;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        System.setErr(new PrintStream(stream));

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入字符：");
        try{
            Integer val = Integer.valueOf(scan.next());
        }catch (NumberFormatException e){
            e.printStackTrace();
        }

        String info = stream.toString();
        if(info.isEmpty()){
            System.out.println("没有异常");
        }else{
            System.out.println("发生错误: " + info);
        }
    }
}
