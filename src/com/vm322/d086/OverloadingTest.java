package com.vm322.d086;

public class OverloadingTest {
    public void info(){
        System.out.println("这是第1条信息");
    }

    public void info(int num){
        System.out.println("这是第" + num + "条信息");
    }

    public static void main(String[] args) {
        OverloadingTest ot = new OverloadingTest();
        ot.info();
        for(int i = 0;i< 5;i++){
            ot.info(i);
        }
    }
}
