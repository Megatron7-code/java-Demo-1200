package com.vm321.d043;

public class demo {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("行列互调之前：");
        printArray(arr);

        int arr2[][] = new int[arr.length][arr.length];
        for(int i=0;i<arr2.length;i++){
            for(int j = 0;j<arr2[i].length;j++){
                arr2[i][j] = arr[j][i];
            }
        }

        System.out.println("行列互调之后：");
        printArray(arr2);
    }

    private static void printArray(int[][] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
