package com.company;

public class Assignment1 {
    public static void main(String[] args) {
        int[][] mat1 = {{1,2,3},{3,4,5},{5,6,7}};
        int[][] mat2 = {{3,2,1},{5,4,3},{7,6,5}};

        int[][] sum1 = new int[3][3];
        int[][] Prod1 =new int[3][3];

        System.out.println("The product of two matrix is :");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                Prod1[i][j]=0;
                for(int q=0;q<3;q++){
                    Prod1[i][j]+=mat1[i][q]*mat2[q][j];
                }
                System.out.print(Prod1[i][j]+" ");
            }
            System.out.println(" ");
        }

        System.out.println("The sum of two matrix is : ");

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum1[i][j]= mat1[i][j]+mat2[i][j];
                System.out.print(sum1[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
