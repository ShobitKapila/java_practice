package com.company;

public class example_2 {
    public static void main(String[] args) {
        int[] arr ={2,3,24,35,5,3,2,6};
        System.out.println("Repeating elements are");
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j])
                    System.out.println(arr[i]+" ");

            }
        }
    }
}
