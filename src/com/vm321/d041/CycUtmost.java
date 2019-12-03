package com.vm321.d041;

public class CycUtmost {
    public static void main(String[] args) {
        int end = Integer.MAX_VALUE;
        int start = end - 50;
        int count = 0;
        for (int i=start;i <= end;i++){
            count++;
        }
        System.out.println("本次循环次数为：" + count);
    }
}
