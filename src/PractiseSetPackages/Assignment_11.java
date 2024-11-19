package PractiseSetPackages;
import java.util.*;

class Account{
    private int id = 0;
    private double balance = 0.0;
    private static double annualinterestRate = 0.0;
    private java.util.Date dateCreated;
    public Account(){
        dateCreated = new java.util.Date();
    }
    public Account(int id,double balance){
        this();
        this.id =id;
        this.balance= balance;
    }
    public int getId(){
        return this.id;
    }
    public double getbalance(){
        return this.balance;
    }
    public double getAnnualintersetRate(){
        return annualinterestRate;
    }
    public String getDateCreated() {
        return this.dateCreated.toString();
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualinterestRate(double annualinterestRate){
        this.annualinterestRate = annualinterestRate;
    }
    public double getMonthlyInterestRate(){
        return  ( annualinterestRate/100)/12;
    }
    public double getMonthlyInterest(){
        return balance*getAnnualintersetRate();
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void deposit(double amount){
        this.balance += amount;
    }
}
public class Assignment_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        a.setId(1122);
        a.setBalance(20000*75);
        a.setAnnualinterestRate(4.5);
        a.withdraw(2500*75);
        a.deposit(3000*75);
        System.out.println("********** Welcome to bank **********");
        System.out.println("The balance in the bank is :"+a.getbalance());
        System.out.println("The monthly intreset you would be paaying is :"+a.getMonthlyInterest());
        System.out.println("The date this account is created is: "+a.getDateCreated());
        System.out.println("************* Thank you for banking with us **********");
    }
}
