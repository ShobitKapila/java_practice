package com.company;

public class Strings_Lab10 {
    public static void main(String[] args) {
        String s1 = new String("java");
        char[] ch= {'S','T','R','I','N','G'};
        String s2 = new String(ch);
        String s3 = "Example";

        System.out.println("Finding the length :"+s2.length());
        System.out.println("Concating two strings :" +s3.concat(s2));
        System.out.println("Converting the String into lowercase :"+s2.toLowerCase());
        System.out.println("Checking is the two strings are equal :"+s1.equalsIgnoreCase(s2));
        System.out.println("Checking the ndex of e in S3 :"+s3.indexOf("e"));
        System.out.println("Hello,\"World!\"");
        String s4[] = s3.split("");

        for (String s5:s4){
            System.out.println("Split S3 :"+s5);
        }

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
