package com.vm323.d133;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始");
        GenericArray<String> stringArr = new GenericArray<String>(String.class, 10);
        stringArr.put(0, "java");
        System.out.println(stringArr.get(0));
        GenericArray<Integer> integerGenericArr = new GenericArray<Integer>(Integer.class, 10);
        integerGenericArr.put(0, 123456789);
        System.out.println(integerGenericArr.get(0));
    }
}
