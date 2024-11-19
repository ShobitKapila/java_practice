package com.company;


abstract class Pen{
    abstract void Write();
    abstract void Refile();
    abstract void ChangeNib();

}

class FountainPen extends Pen{
    void Write(){
        System.out.println("Writing with Pen....");
    }
    void Refile(){
        System.out.println("Refiling the pen.....");
    }
    void ChangeNib(){
        System.out.println("Changing the Nib");
    }
}
public class PracticeSet11 {
    public static void main(String[] args) {
        // 1st problem
        FountainPen p = new FountainPen();
        p.Refile();
        p.Write();
        // 2nd problem
        p.ChangeNib();
        // 3rd problem



    }
}
