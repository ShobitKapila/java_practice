package com.company;

import java.util.Scanner;

public class Assessment_3_2 {
    public static double AreaOfPent(int a){
        return (1.72048*a*a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of pentagon :");
        int side = sc.nextInt();

        System.out.println(AreaOfPent(side));

    }
}
