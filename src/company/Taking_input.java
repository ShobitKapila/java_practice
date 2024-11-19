package com.company;
import java.util.Scanner;

public class Taking_input {
    public static void main(String[] args){
        System.out.println("Input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a = sc.nextInt();
        System.out.println("Enter the number 2");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two numbers are:"+sum);
    }
}
