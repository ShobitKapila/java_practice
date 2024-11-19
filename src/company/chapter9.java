package com.company;

class Cylinder{
    int radius,height;
    // Creating a constructor\
    public Cylinder(int r,int h){
        this.radius=r;
        this.height = h;
    }


    // Setting the radius
    public void Setradius(int r){radius =r;}
    // Setting the height
    public void Setheight(int h){height = h;}
    // Method for area created
    public double getArea(){return (2*3.14*radius*height)+(2*3.14*radius*radius);}
    // Method for volume created
    public double getVolume(){return (3.14*radius*radius*height);}

}

public class chapter9 {
    public static void main(String[] args) {

        Cylinder cy1 = new Cylinder(6,7);
        Cylinder cy2 = new Cylinder(8,9);

        //cy1.Setradius(3);cy1.Setheight(9);
        //cy2.Setradius(9);cy2.Setheight(2);

        System.out.println("The area of the first cylinder is :"+cy1.getArea());
        System.out.println("The voulme of the first cylinder is :"+cy1.getVolume());
        System.out.println("the area of the second cylinder is :"+cy2.getArea());
        System.out.println("The volume of the second cylinder is :"+cy2.getVolume());
    }
}
