package com.company;

public class Assessment_2_1 {
    static boolean CheckStr(String a) {

        int i = 0, j =a.length() - 1;
        while (i < j) {
            if (a.charAt(i) != a.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "Hello";
        System.out.println("Given String is :"+a);
        System.out.println("Length of String :"+ a.length());
        a = a.toLowerCase();
        if (CheckStr(a))
            System.out.print("Yes it is a palindrome");
        else
            System.out.println("Its not a palindrome");

    }
}
