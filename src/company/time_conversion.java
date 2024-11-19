package com.company;

import java.util.Scanner;

public class time_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String s = sc.nextLine();
        String s = "12:00:56AM";
        String s1 = s.substring(0,2);
        String s2 = s.substring(3,5);
        String s3 = s.substring(6,8);
        String s4 =s.substring(8,10);
        if(s4.equals("AM")){
            if(s1.equals("12")){
                System.out.println("00:"+s2+":"+s3);
            }
            else{
                System.out.println(s);
            }
        }
        Math.floor();
//        else{
//            int si=Integer.parseInt(s1);
//            si+=12;
//            System.out.println(si+s2+s3);
//        }

    }
}
