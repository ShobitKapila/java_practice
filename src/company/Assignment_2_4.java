package com.company;
import java.util.Scanner;

public class Assignment_2_4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int f =0;
        int e=0;
        int exit;
        do{
            System.out.println("Please chose 1 for first class or 2 for economy");
            int selection = kb.nextInt();
            switch (selection){
                case 1:
                    System.out.println("your Seat is in first class");
                    f++;
                    if(f<=5){
                        System.out.println("Yoour seat number is "+f);
                    }
                    else{
                        System.out.println("first class is full");
                        System.out.println("Do you want to move to economy class 1 for yes 2 for no");
                        int full = kb.nextInt();
                        if(full ==1){
                            System.out.println("Enter 1");
                        }
                        else{
                            System.out.println("Next flight is in 3 hours");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Your seat is in Economy class");
                    e++;
                    if(e>5 && e<=10){
                        System.out.println("Your seat number is"+e);
                    }
                    else{
                        System.out.println("The economy claass is full ");
                        System.out.println("do you want to be in first class? Enter 1 for yes or 2 for no ");
                        int full = kb.nextInt();
                        if(full ==1){
                            System.out.println("Press 1");
                        }
                        else{
                            System.out.println("Next flight leaves in 3 hours");
                        }
                    }
            }
            System.out.println("1 for main menu or 2 for exit");
            exit = kb.nextInt();
        }while(exit==1);
        System.out.println("your flight is booked");
    }
}