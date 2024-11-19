package PractiseSetPackages;
import myPack.*;
import java.util.*;

public class AreaOfShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle c1 = new Circle();
        Square s1 = new Square();
        Rectangle r1 = new Rectangle();

        System.out.println("Enter 1 for circle 2 for square and 3 for rectangle 0 to quit");
        int x = sc.nextInt();

        switch(x){
            case 0:
                break;
            case 1:
                System.out.println("Enter the radius of circle :");  double r = sc.nextDouble();
                System.out.println("The area of circle is :"+c1.CircleArea(r));
                break;
            case 2:
                System.out.println("Enter the side of square :"); double s = sc.nextDouble();
                System.out.println("The area of square is: "+s1.SquareArea(s));
                break;
            case 3:
                System.out.println("Enter the length and breadth of rectangle :"); int y = sc.nextInt();
                int z = sc.nextInt();
                System.out.println("The area of rectangle is :"+r1.RectArea(y,z));
                break;
        }
    }
}
