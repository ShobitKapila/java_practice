package com.company;

import java.util.Scanner;

public class Arrays_imp {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int[][] matrix1 ={{1,2,3},{3,4,5}};
        int[][] matrix2 = {{3,2,1},{5,4,3}};
        int[][] result = {{0,0,0},{0,0,0}};
        System.out.println("Sum of two matrix is : ");

        for (int i=0;i< matrix1.length;i++){
            for(int j =0;j<matrix2[i].length;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

