package com.company;

import java.util.Scanner;

public class Assessment_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String n = sc.nextLine();

        int[] occu = new int[n.length()];
        int i, j;

        char string[] = n.toCharArray();

        for(i=0;i<n.length();i++){
            occu[i]=1;
            for(j=i+1;j<n.length();j++){
                if (string[i]==string[j]){
                    occu[i]++;

                    string[j]='0';
                }
            }
        }
        System.out.println("The frequency of the characters are :");
        for(i=0;i< occu.length;i++){
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] +"-"+ occu[i]);

        }
    }
}
