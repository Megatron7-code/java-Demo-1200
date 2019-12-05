package com.vm322.d080;

public class demo {
    public static void main(String[] args) {
        String appendStr = "";
        long startTime = System.nanoTime();
        for(int i = 20000;i<50000;i++){
            appendStr += (char)i;
        }
        long endTime = System.nanoTime();
        System.out.println("追加3万多个字符，用时: " + (endTime - startTime)/1000000d+"毫秒");

        StringBuilder sbuilder = new StringBuilder();
        startTime = System.nanoTime();
        for(int i=20000;i<50000;i++){
            sbuilder.append((char)i);
        }
        endTime = System.nanoTime();
        System.out.println("sbuilder追加3万多个字符，用时：" + (endTime - startTime)/1000000d+"毫秒");
    }
}
