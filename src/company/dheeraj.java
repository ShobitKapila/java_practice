package com.company;

import java.io.*;
import java.util.*;
//import java.f*;


public class dheeraj {
    void notARobot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Verify you are not a robot");
        String alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#";
        StringBuilder sb=new StringBuilder();
        Random random=new Random();
        int len=6;
        for(int i = 0; i < len; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }
        String randomString = sb.toString();
        System.out.println("Captcha " + randomString);
        System.out.println("enter captcha");

        String verify;
        verify=sc.nextLine();
        System.out.println(verify);
        System.out.println(randomString);
        if (verify.equals(randomString)) {
            System.out.println("Welcome");
        }

        else {
            System.out.println("traitor:");
		    	System.exit(1);

        }

    }

    public static void main(String[] args) {
//        int[] array1 = { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
        dheeraj i = new dheeraj();
        i.notARobot();
//        System.out.println();
        //function call
    }
}

//public class WriterExample {
//    public static void main(String[] args) {
//        try {
//            Writer w = new FileWriter("output.txt");
//            String content = "I love my country";
//            w.write(content);
//            w.close();
//            System.out.println("Done");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}