package com.vm321.d032;

public class ErgodicArray {
    public static void main(String[] args) {
        String[] aves = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "布谷鸟", "灰纹鸟", "百灵鸟"};
        int index = 0;
        System.out.println("我这有很多鸟，包括：");
        while(index < aves.length){
            System.out.println(aves[index++]);
        }
    }
}
