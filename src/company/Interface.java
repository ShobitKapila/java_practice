package com.company;
import java.util.Scanner;


interface ComputeArea{
    Scanner sc = new Scanner(System.in);
    void area1();
    float pi = (float)3.14;
}
class  rectangle implements ComputeArea{
    public void area1(){
        System.out.println("Enter the length :");
        float a = sc.nextFloat();
        System.out.println("Enter the breadth:");
        float b = sc.nextFloat();
        System.out.println("Area of rectangle is :"+(a*b));
    }
}
class circle_3 implements ComputeArea{
    public void area1() {
        System.out.println("Enter the radius:");
        float ra = sc.nextFloat();
        System.out.println("The area of circle is:"+(pi*ra*ra));
    }
}
class Interface {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        r1.area1();
        circle_3 c1 = new circle_3();
        c1.area1();
    }
}
