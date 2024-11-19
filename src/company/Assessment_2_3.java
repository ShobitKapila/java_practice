package com.company;

public class Assessment_2_3 {
    public static void main(String[] args) {
        String str1 ="Reverse Words in a given String";
        String[] str = str1.split(" ");
        String rev = " ";

        for (int i = str.length - 1; i >= 0; i--) {
            rev =rev + str[i] + " ";
        }
        System.out.println("The given String is :"+str1);
        System.out.println("The new String after reversed :"+rev.substring(0,rev.length() - 1));
    }
}
