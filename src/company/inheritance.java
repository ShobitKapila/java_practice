package com.company;

class Animal{
    String Name;
    public void setName(String n){Name = n;}
    public void Intro(){System.out.println("this is my dog");}
    public String getName(){return Name;}
    public void Print(){System.out.println("Hi this is my farm");}
}
class Doog extends Animal{
    String Bark;
    public void print(){System.out.println("The dog barks bow...bow...bow..");}
}
public class inheritance {
    public static void main(String[] args) {
        Doog az1 = new Doog();
        az1.setName("Harry");
        az1.Print();
        az1.print();
        az1.Intro();
        System.out.println(az1.getName());
        az1.getName();
    }
}
