package com.vm321.d040;

public class CycUtmost {
    public static void main(String[] args) {
        int end = Integer.MAX_VALUE;
        int start = end - 50;
        int count = 0;
        /*
        当i加到最大值后，会变成起始值.Integer.MIN_VALUE
         */
        for (int i = start; i <= end; i++) {
            count++;
        }
        System.out.println("本次循环的次数为:" + count);
    }
}
