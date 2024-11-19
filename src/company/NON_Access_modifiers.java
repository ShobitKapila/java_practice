package com.company;
final class Aclass{
    int a;
    public void setSide(int a){
        this.a = a;
    }
    public int getArea(){
        return a*a;
    }
}
// if this Class is extended or inherited then it gives error
abstract  class cars{
    public abstract void animalSound();// to use this method we have to create a new class// for the abstract new class show t=bbe inherited
    public void sleep(){
        System.out.println("shh");
    }
}
class dog extends cars{
    @Override // this indicates the usage of the animalSound method again
    public void animalSound() {
        System.out.println("The dog barks : BOW...BOW..BOW");

    }
}
public class NON_Access_modifiers{
    public static void main(String[] args) {
        // using final class - non access modifier
        /*Aclass c1 = new Aclass();
        c1.setSide(4);
        c1.getArea();
         */
        // using abstract class - non access modifier
        dog d1 = new dog();
        d1.animalSound();// abstract method
        d1.sleep();// regular public method

    }
}
