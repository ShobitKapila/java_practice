package com.company;
import java.util.Scanner;

public class PractiseSet {
    /*
    public static void main(String[]args){
        int a,b,c;
        a=4;
        b=5;
        c=6;
        System.out.println("the sum of the numbers : "+(a+b+c));
        */
    /*
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1,num2,num3,CGPA;

        System.out.println("Enter the first subject marks");
        num1 = sc.nextFloat();
        System.out.println("Enter the secound subject marks");
        num2 = sc.nextFloat();
        System.out.println("Enter the third subject marks");
        num3 = sc.nextFloat();

        CGPA = (num1+num2+num3)/(30);
        System.out.println("The CGPA of the student is: "+CGPA);

     */
    public static void main(String[]args){
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter anything :");
        boolean sum1;

        sum1 = kb.hasNextInt();
        System.out.println(sum1);

    }
}
