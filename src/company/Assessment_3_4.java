package com.company;

import java.util.Scanner;

class Staff{
    String name;int Code;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getCode(){return Code;}
    public void setCode(int code) {Code = code;}
}
class teacher extends Staff{
    String Subject; int publications;

    public String getSubject() {return Subject;}
    public void setSubject(String subject) {Subject = subject;}
    public int getPublications() {return publications;}
    public void setPublications(int publications) {this.publications = publications;}
}
class typist extends Staff{
    int Speed;

    public int getSpeed() {return Speed;}
    public void setSpeed(int speed) {Speed = speed;}
}
class officer extends Staff{
    int Grade;

    public int getGrade() {return Grade;}
    public void setGrade(int grade) {Grade = grade;}
}
class regular extends typist{
    int salary;

    public int getSalary() {return salary;}
    public void setSalary(int salary) {this.salary = salary;}
}
class Dailywage extends typist{
    int pay;

    public int getPay() {return pay;}

    public void setPay(int pay) {this.pay = pay;}
}
public class Assessment_3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number\n1 for teacher\n2 for regular typist\n3 for dailywage typist\n4 for Officer:");
        int d = sc.nextInt();

        switch (d){
            case 1:
                teacher s1 = new teacher();
                s1.setName("raju");s1.setCode(1234);
                s1.setSubject("Math");s1.setPublications(45);
                System.out.println("Name of teacher is : "+s1.getName()+" Code is: "+s1.getCode());
                System.out.println("Teaches: "+s1.getSubject()+"Published upto :"+s1.getPublications());
                break;
            case 2:
                regular s2 = new regular();
                s2.setName("ravi");s2.setCode(12456);
                s2.setSpeed(100);s2.setSalary(34000);
                System.out.println("Name of typist is : "+s2.getName()+" Code is: "+s2.getCode());
                System.out.println("typing speed is: "+s2.getSpeed()+"Salary is: "+s2.getSalary());
                break;
            case 3:
                Dailywage s3 = new Dailywage();
                s3.setPay(1300);s3.setName("rajesh");
                s3.setCode(19876);s3.setSpeed(96);
                System.out.println("Name of typist is : "+s3.getName()+" Code is: "+s3.getCode());
                System.out.println("typing speed is: "+s3.getSpeed()+"Salary is: "+s3.getPay());
                break;
            case 4:
                officer s4 = new officer();
                s4.setName("siva");s4.setCode(10876);
                s4.setGrade(2);
                System.out.println("Name of officer is : "+s4.getName()+" Code is: "+s4.getCode());
                System.out.println("Grade is: "+s4.getGrade());
                break;
        }
    }
}
