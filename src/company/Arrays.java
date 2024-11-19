package com.company;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner fg = new Scanner(System.in);
        System.out.println("Enter the number of numbers that need to be stored in the array");
        int n;
        n= fg.nextInt();
        System.out.println("Enter the numbers now");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = fg.nextInt();
        }
        System.out.println("The array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        /*
        System.out.println("\nThe duplicate elements are:");
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    System.out.print(arr[j]+" ");
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int x=0;
                x+=1;
                int[] Prod =  new int[x];
                Prod[i] = arr[i]*arr[j];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int x=0;
                x+=1;
                int[] Prod =  new int[x];
                if(Prod[i]>Prod[j])
                    System.out.println(Prod[i]);
                else
                    System.out.println(Prod[j]);
            }
        }
         */
    }
}