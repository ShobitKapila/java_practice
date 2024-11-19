package com.company;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        float sum =0;

        int n =5;
        System.out.println("Enter the marks of the five subjects");
        float[] sub_mar = new float[5];
        for( int i =0;i<n;i++){
            sub_mar[i]= kb.nextFloat();
        }
        for(int i=0;i<n;i++){
            sum = sum + sub_mar[i];
        }
        System.out.println("The total marks out of 500 is :"+sum);
        float avg =sum/5;
        System.out.println("average of all marks is: "+avg);
        if(avg<=49){
            System.out.println("Fail");
        }
        else if(avg>=50 && avg<=59){
            System.out.println("Need Improvement");
        }
        else if(avg>=60 && avg<=69){
            System.out.println("Can Improve");
        }
        else if(avg>=70 && avg<=79){
            System.out.println("Average");
        }
        else if(avg>=80 && avg<=89){
            System.out.println("Good");
        }
        else if(avg>=90 && avg<=95){
            System.out.println("Very Good");
        }
        else if(avg>=96 && avg<=100){
            System.out.println("Excellent");
        }
    }
}
