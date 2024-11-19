package com.company;

import java.util.Scanner;

class Circle_1{
    int radius;

    public Circle_1(int r) {
        this.radius =r;
    }
    public double area(){
        return Math.PI* radius* radius;
    }
}
class Cylinder_1 extends Circle_1{
    public int height;
    public Cylinder_1(int r,int h){
        super(r);
        this.height = h;
    }
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Practise_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Circle_1 Cir1 = new Circle_1(3);
        Cylinder_1 Cyl1 = new Cylinder_1(5,4);

//        System.out.println("The area of circle is :"+Cir1.area());
        System.out.println("The volume of cylinder is :"+Cyl1.volume());


    }
}
