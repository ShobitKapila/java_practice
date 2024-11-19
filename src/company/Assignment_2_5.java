package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class MPL{
    Scanner kb = new Scanner(System.in);
    int standard,num_Students,student_first;
    public int first;
    public float average;
    MPL(int a, int b){
        standard = a;
        num_Students =b;
        mark(num_Students);
    }

    public void mark(int num_Students){
        int max=0;
        int[] marks = new int[num_Students];
        int average_class =0;
        System.out.println("Enter the marks of the students");
        for(int i =0;i<num_Students;i++){
            marks[i] = kb.nextInt();
            average_class =average_class+marks[i];
            if(marks[i]>max){
                max = marks[i];
                student_first =i+1;
            }
        }
        first = student_first;
        average = average_class/num_Students;
    }
    public void display(){
        System.out.println("Standard:- "+ standard);
        System.out.println("No of students:- "+ num_Students);
        System.out.println("First student:- "+ first);
        System.out.println("Average of the class:- "+ average);
    }
}
public class Assignment_2_5 {
    static MPL obj[] = new MPL[2];
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int first=0;float avg=0;
        for(int i =0;i<2;i++){
            System.out.println("Enter the number of students in the class :"+(i+1));
            int students = kb.nextInt();
            obj[i]= new MPL(i,students);
            obj[i].display();
        }
        bestclass();
        avgbestclass();
    }
    public static void bestclass(){
        float max=0;int standard =0;
        for(int i=0;i<2;i++){
            if(obj[i].average>max){
                max = obj[i].average;
                standard=i+1;
            }
        }
        System.out.println("The best class on the basis of a average is:"+standard);
    }
    public static void avgbestclass(){
        float max=0;int standard=0;
        for(int i=0;i<2;i++){
            if(obj[i].first>max){
                max =obj[i].first;
                standard =i+1;
            }
        }
        System.out.println("The best class average is:"+standard);
    }
}
