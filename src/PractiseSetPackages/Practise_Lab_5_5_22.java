package PractiseSetPackages;
import org.w3c.dom.ls.LSOutput;

import javax.lang.model.element.Name;
import java.util.Scanner;

//class Math{
//    public int addition(int a,int b){
//        return a+b;
//    }
//    public int Subtraction(int a,int b){
//        return a-b;
//    }
//    public int Multiplication(int a,int b){
//        return a*b;
//    }
//}
class Subjects{
    String Student_Name2;
    int a;
    Scanner kb = new Scanner(System.in);
    public void name_subject(String Student_Name2){
        System.out.println("Enter number of subjects their :");
        a = kb.nextInt();
        String[] subj = new String[a];
        for(int i =0;i<a;i++){
            System.out.println("Enter the name of subject:");
            subj[i] = kb.nextLine();
        }
    }
}
class marks extends Subjects{
    int marks3;
    public void marks_subject(){
        System.out.println("Enter the marks of "+a+" Subjects :");
        int[] marks3 = new int[a];
        for (int i =0;i<a;i++){
            marks3[i] = kb.nextInt();
        }

    }
}
public class Practise_Lab_5_5_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // CLASSES , OBJECTS , GETTING INPUT FROM THE USER
//        System.out.println("Enter any two numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        Math a1 = new Math();
//        System.out.println("Addition of two numbers is "+a1.addition(a,b));
//        System.out.println("Subtraction of two numbers is "+a1.Subtraction(a,b));
//        System.out.println("Multiplication of two numbers is "+a1.Multiplication(a,b));

        // COMMAND LINE ARGUMENTS
//        int sum ;
//        int percentage;
//        for(int i=0;i<args.length;i++){
//            System.out.println("args[" + i +"]:" + args[i]);
//        }

        // ARRAYS
//        int[] marks = new int[5];
//        int sum1 = 0;
//        System.out.println("Enter the marks of five subjects :");
//        for (int i=0;i<5;i++){
//            marks[i] = sc.nextInt();
//            sum1 +=marks[i];
//        }
//        System.out.println("The sum of five subjects is :"+sum1);
//        System.out.println("Average of five subjects is: "+sum1/5);

        // INHERITANCE

    }
}
