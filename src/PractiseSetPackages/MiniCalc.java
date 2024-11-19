package PractiseSetPackages;
import myCalc.*;
import java.util.*;

public class MiniCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Add a1 = new Add();
        Div b1 = new Div();
        Fact c1 = new Fact();
        Mult d1 = new Mult();
        Sub e1 = new Sub();
        Max f1 = new Max();
        Min g1 = new Min();
        System.out.println("enter 1. for Addition\n2. for division\n3. for factorial\n4. for multiplication");
        System.out.println("5. for subtraction\n6. for Maximum and Minimum\n 0. to quit");
        int z1 = sc.nextInt();
        switch(z1){
            case 1:
                System.out.println("Enter two numbers:");int a = sc.nextInt(); int b = sc.nextInt();
                System.out.println("Sum of two numbers is:"+a1.Sum(a,b));
                break;
            case 2:
                System.out.println("Enter two numbers:");double a5 = sc.nextDouble(); double b5 = sc.nextDouble();
                System.out.println("Division of two numbers is:"+b1.division(a5,b5));
                break;
            case 3:
                System.out.println("Enter a number:");int a6 = sc.nextInt();
                System.out.println("Factorial is"+c1.factorial(a6));
                break;
            case 4:
                System.out.println("Enter two numbers :"); int a7 = sc.nextInt(); int b7 = sc.nextInt();
                System.out.println("Multiplication of two numbers is :"+d1.Multiply(a7,b7));
                break;
            case 5:
                System.out.println("Enter two numbers :");int a8 = sc.nextInt(); int b8 = sc.nextInt();
                System.out.println("subtraction of two numbers is :"+e1.subs(a8,b8));
                break;
            case 6:
                System.out.println("Enter two numbers :");int a9 = sc.nextInt(); int b9 = sc.nextInt();
                System.out.println("Maximum of two numbers is"+f1.Maximum(a9,b9));
                System.out.println("Minimum of two numbers is"+g1.Minimum(a9,b9));
                break;
            case 0:
                break;
        }
    }
}
