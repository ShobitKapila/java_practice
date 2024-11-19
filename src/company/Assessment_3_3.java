package com.company;

import java.util.Scanner;

public class Assessment_3_3 {
    static void Customer(int AccounntNum, String Name,String Type){
        Scanner kb = new Scanner(System.in);

        if (Type.equalsIgnoreCase("Current")){
            float intrest =0;
            float balance = 0;
            int a ;
            System.out.println("Amount to be deposited");
            a=kb.nextInt();
            balance=balance+a;
            System.out.println(Name+" \nyour Account type is "+ Type+"\nyour Account Number is "+AccounntNum);
            System.out.println(" Balance is: "+balance+" Interest you got is: "+intrest);
        }
        else if ( Type.equalsIgnoreCase("Savings")){
            float balance = 0;
            int a;
            System.out.println("Amount to be deposited");
            a = kb.nextInt();
            balance = balance +a;
            float intrest = (balance*7)/100;
            System.out.println(Name+" \nyour Account type is "+ Type+"\nyour Account Number is "+AccounntNum);
            System.out.println("Balance is: "+balance+" Interest  you got is: "+intrest);
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the type of bank account :");
        String acc = kb.nextLine();
        System.out.println("Enter your name:");
        String na = kb.nextLine();
        System.out.println("Enter the account number:");
        int nu = kb.nextInt();
        Customer(nu,na,acc);

    }
}
