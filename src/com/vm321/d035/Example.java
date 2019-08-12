package com.vm321.d035;

import java.math.BigDecimal;

public class Example {
    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(0.0);
        BigDecimal factorial = new BigDecimal(1.0);
        int i=1;
        while(i<=20){
            sum = sum.add(factorial);
            ++i;
            factorial = factorial.multiply(new BigDecimal(1.0/i));
        }
        System.out.println("结果:\n" + sum);
    }
}
