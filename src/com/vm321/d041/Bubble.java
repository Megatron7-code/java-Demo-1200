package com.vm321.d041;

/**
 * 课本上的例子有错误,得到的结果不是顺序的
 */

public class Bubble {
    public static void main(String[] args) {
        int a[] = {10, 23, 11, 56, 45, 26, 59, 28, 84, 79};
        int i, temp;
        System.out.println("初始序列的数组为：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n排序好的结果是：");
        for(i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
