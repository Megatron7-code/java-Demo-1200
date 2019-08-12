package com.vm321.d038;

public class BrakCyc {
    public static void main(String[] args) {
        System.out.println("=======中断单层循环例子.=======");
        String[] array = new String[]{"白鹭", "丹顶鹤", "黄鹂", "鹦鹉", "乌鸦", "喜鹊", "老鹰", "布谷鸟"};
        System.out.println("在老鹰之前都有：");
        for (String string:array){
            if(string.equals("老鹰")){
                break;
            }
            System.out.print("有: "+string+"     ");
        }
        System.out.println("\n=========中断双层循环的例子=========");
        int[][] myScores = new int[][]{
                {67, 78, 63, 22, 66},
                {55, 68, 78, 95, 44},
                {95, 97, 92, 93, 81}
        };
        No1:for(int[] is: myScores){
            for(int i : is){
                System.out.println(i+"\t");
                if(i<60){
                    System.out.println(i+"分不及格");
                    break No1;
                }
            }
            System.out.println();
        }
    }
}
