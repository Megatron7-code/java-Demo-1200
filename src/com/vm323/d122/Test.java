package com.vm323.d122;

public class Test {
    public static void main(String[] args) {
        double[] array = new double[5];
        for(int i=0;i<array.length;i++){
            array[i] = 100 * Math.random();
        }
        System.out.println("源数组：");
        for(int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("max num is :" + MaxMin.getResult(array).getMax());
        System.out.println("min num is :" + MaxMin.getResult(array).getMin());
    }
}
