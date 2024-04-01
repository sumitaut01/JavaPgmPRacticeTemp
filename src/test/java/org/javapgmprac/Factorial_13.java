package org.javapgmprac;

public class Factorial_13 {

    public static void main(String[] args) {
        int num=5;
        System.out.println(fact(5));//120
    }


    public static int fact(int n){
        if(n==1) return 1;
        return (n*fact(n-1));
    }
}
