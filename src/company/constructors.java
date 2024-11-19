package com.company;

class Circle{
    private double r,a,p;
    public void setRadius(double radius){
        this.r = radius ;
    }
    public double getArea(){
        return 3.14*r*r;
    }
    public double getperimeter(){
        return 2*3.14*r;
    }
}

public class constructors {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(c1.getArea());
        System.out.println(c1.getperimeter());
    }
}
