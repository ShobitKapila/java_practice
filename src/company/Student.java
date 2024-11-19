package com.company;

import java.util.Scanner;

public class Student {
    /*
    static void Class(int Register, String Name,int mar1 , int mar2 , int mar3){
        double CgpA = (mar1+mar2+mar3)/30.0;
        System.out.format(Name +" "+ Register+ " Scored "+CgpA);
    }
     */
    static void Student1(int Regis, String Name){
        Scanner kb = new Scanner(System.in);
        int[] mark = new int[5];
        int Sum =0;
        System.out.println("Enter the marks :");
        for(int i=0;i<5;i++){
            mark[i]= kb.nextInt();
            Sum=Sum+mark[i];
        }
        int a=50;
        float cgpa = (Sum/a);
        System.out.println("Student Name: "+Name+" Register Number "+Regis);
        System.out.println("Scored "+cgpa+" CGPA");
    }
    public static void main(String[] args) {
       // Class(21345, "Shobit",89,98,90);
        Student1(258369,"Shobit");
    }
}
