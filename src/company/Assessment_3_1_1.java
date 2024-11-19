package com.company;
import java.util.Scanner;

public class Assessment_3_1_1 {
    public static boolean CheckPass(String a) {
        int letters = 0;
        int digits = 0;
        if (a.length() < 10) {
            return false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                char let = a.charAt(i);
                if (!Character.isLetter(let)) {
                    return false;
                } else if (Character.isDigit(let)) {
                    digits = digits + 1;
                }
                if (digits < 2) {
                    return false;
                }
            }

        }

        return false;
    }
    public static boolean isletter(char let) {
        let = Character.toLowerCase(let);
        return (let >= 'a' && let <= 'z');
    }
    public static boolean isdigit(char let) {
        return (let >= '0' && let <= '9');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("the password rules are :");
        System.out.println("A password must have at least ten characters.\nA password consists of only letters and digits.\nA password must contain at least two digits.");
        System.out.println("Enter the password :");
        String passW = sc.nextLine();

        if(CheckPass(passW)){
            System.out.println("The password is valid"+passW);
        }
        else{
            System.out.println("The password is not valid "+passW);
        }
    }
}
