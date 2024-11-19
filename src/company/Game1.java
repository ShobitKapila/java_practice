package com.company;
import java.util.Scanner;

public class Game1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in1 ,in2;
        System.out.println("Player1 enter the character " +
                "for rock  - r" +
                "for scissor - s" +
                "for paper - p");
        in1 = sc.nextLine();
        System.out.println("Player2 enter the character " +
                "for rock  - r" +
                "for scissor - s" +
                "for paper - p");
        in2 = sc.nextLine();
        if(in1.equalsIgnoreCase("r")&&in2.equalsIgnoreCase("s")){
            System.out.println("Player1 has won");
        }
        else if(in1.equalsIgnoreCase("r")&&in2.equalsIgnoreCase("r")){
            System.out.println("Its a draw");
        }
        else if(in1.equalsIgnoreCase("r")&&in2.equalsIgnoreCase("p")){
            System.out.println("Player2 has won ");
        }
        else if(in1.equalsIgnoreCase("p")&&in2.equalsIgnoreCase("r")){
            System.out.println("Player1 has won");
        }
        else if(in1.equalsIgnoreCase("p")&&in2.equalsIgnoreCase("p")){
            System.out.println("Its a draw");
        }
        else if(in1.equalsIgnoreCase("p")&&in2.equalsIgnoreCase("s")){
            System.out.println("Player2 has won");
        }
        else if(in1.equalsIgnoreCase("s")&&in2.equalsIgnoreCase("r")){
            System.out.println("Player2 has won");
        }
        else if(in1.equalsIgnoreCase("s")&&in2.equalsIgnoreCase("p")){
            System.out.println("Player1 has won");
        }
        else if(in1.equalsIgnoreCase("s")&&in2.equalsIgnoreCase("s")){
            System.out.println("Its a draw");
        }
        else{
            System.out.println("Invalid expression");
        }
    }
}
