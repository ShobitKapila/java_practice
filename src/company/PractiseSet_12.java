package com.company;

import PractiseSetPackages.SayHello;
import java.util.*;

public class PractiseSet_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to continue or 2 to quit");
        int a = sc.nextInt();
        SayHello s1 = new SayHello();
        switch( a){
            case 1:
                s1.Hi();
                break;
            case 2:
                break;
        }
    }
}
