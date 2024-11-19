package com.company;
import java.util.Date;


class Baby{
    String Name; Date dob,BCGdate,PolioDate;
    public Baby(String name,Date b){
        this.Name=name;
        dob = new Date();
        PolioDate = new Date();
        BCGdate = new Date();
    }
    void display(){
        System.out.println("\nName :"+Name+"\n Date of Birth is :"+dob.getDate()+"/"+dob.getMonth()+"/"+dob.getYear());
        System.out.println("Polid Drops on:"+PolioDate.getDate()+"/"+PolioDate.getMonth()+"/"+PolioDate.getYear());
        System.out.println("BCG Drops on:"+BCGdate.getDate()+"/"+BCGdate.getMonth()+"/"+BCGdate.getYear());
    }
}
public class LAB_08 {
    public static void main(String[] args) {
        Baby b= new Baby("ABC",new Date(2004,2,3));
        b.display();
    }
}
