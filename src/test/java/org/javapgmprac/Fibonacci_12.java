package org.javapgmprac;

public class Fibonacci_12 {
    public static void main(String[] args) {

        int a=0;
        int b=1;

        int term=5;
        System.out.print(a +" "+b+" ");

        for(int i=0;i<term;i++){
           int  c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
        }


    }
}
