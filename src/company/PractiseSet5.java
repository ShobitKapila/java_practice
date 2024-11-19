package com.company;

public class PractiseSet5 {
    static void multiplication(int a){
        for (int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",a,i,a*i);
        }
    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n+n*(n-1)/2;
    }
    public static void main(String[] args) {
        // problem 1
        multiplication(8);

        // problem 2
        pattern1(6);

        // problem 3
        int result = sumRec(15);
        System.out.println(result);

        // problem 4

    }
}
