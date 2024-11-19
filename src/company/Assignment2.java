package com.company;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the total no of units consumed :");
        float un = kb.nextFloat();

        double amount;

        if(un<=100&&un>0){
            System.out.println("The amount to be paid is 200 ");
        }
        else if(un>100&&un<=150){
            amount = 200 + (un-100)*0.60;
            System.out.println("The amount to be paid is "+amount);
        }
        else if(un>150 && un<=200){
            amount = 200 + (un-150)*1.20;
            System.out.println("The amount to be paid is "+amount);
        }
        else if(un>200){
            amount = 200 + (un-200)*2.40;
            System.out.println("The amount to be paid is "+amount);
        }
    }
}
