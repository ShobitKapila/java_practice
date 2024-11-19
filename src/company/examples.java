package com.company;

public class examples {
    public static void main(String[] args) {
        int[] arr ={1,3,4,6,7,8,2,0,98,9};
        int count =0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]%2!=0){
                count =count+1;
                System.out.println("Odd numbers"+arr[i]);
            }
        }
        System.out.println("the total number of odd numbers is :"+count);
        int num=0;
        for (int j=0;j<arr.length;j++){
            if (arr[j]%2==0){
                num=num+1;
                System.out.println("Even numbers"+arr[j]);
            }
        }
        System.out.println("Then total number of even numbers is: "+num);
    }
}

