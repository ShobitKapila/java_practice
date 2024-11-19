package PractiseSetPackages;
import java.util.Scanner;
class Employee{
    public static void join (){
        Scanner sc = new Scanner(System.in);
        String date[] = new String[5];String month[] = new String[5];String year[] = new String[5];
        for(int i=0;i<5;i++) {
            System.out.println("Enter the date: ");date[i] = sc.nextLine();
            System.out.println("Enter the month");month[i] = sc.nextLine();
            System.out.println("Enter the year");year[i] = sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println(date[i]+"/"+month[i]+"/"+year[i]);
        }
    }
    public static void Employee(){
        Scanner sc = new Scanner(System.in);
        String fname[] = new String[5];String mname[] = new String[5];String lname[] = new String[5];
        String name[] = new String[5];
        for (int i=0;i<5;i++){
            System.out.println("Enter the first name :"); fname[i] = sc.nextLine();
            System.out.println("Enter the middle name :"); mname[i] = sc.nextLine();
            System.out.println("Enter the last name :"); lname[i] = sc.nextLine();
        }
        for(int i =0;i<5;i++){
            System.out.println("Employee "+i+" name is :"+fname[i]+""+mname[i]+""+lname[i]);
        }
        for(int i=0;i<5;i++){
            name[i] = fname[i]+""+mname[i]+""+lname[i];
        }
        for(int i=0;i<5;i++){
            name[i].replace("", "_");
            System.out.println("Employee "+i+" name is :"+name[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println("The length of "+i+" name is :"+name[i].length());
        }
        for(int i=0;i<5-1;i++){
            for(int j = i + 1; j < 5; j++){
                if(name[i]==name[j]){
                    System.out.println("True");
                }
                else{
                    System.out.println("Flase");
                }
            }
        }
    }
    public static void StringBuffer(){
        Scanner sc = new Scanner(System.in);
        String dep[] = new String[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the depeartment"); dep[i] = sc.nextLine();
        }
    }
}

public class Assignment_Da_mootel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.join();
        e1.Employee();

    }
}
