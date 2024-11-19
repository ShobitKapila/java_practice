package STS_DSA_java;

//Strobogrammatic Number is a number whose numeral is rotationally symmetric so that it appears the same
//when rotated 180 degrees.

import java.util.HashMap;
import java.util.Scanner;

public class StrobogrammaticNumber {
    public static boolean isStrobogrammatic(String num) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');
        map.put('6', '9');
        map.put('9', '6');

        int left = 0;
        int right = num.length() - 1;
        while (left <= right) {
            char leftChar = num.charAt(left);
            char rightChar = num.charAt(right);
            if (!map.containsKey(leftChar) || map.get(leftChar) != rightChar) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(num + " is a strobogrammatic number: " + isStrobogrammatic(num));
    }
}

