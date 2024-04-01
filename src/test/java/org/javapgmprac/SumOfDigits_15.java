package org.javapgmprac;

public class SumOfDigits_15 {

    public static void main(String[] args) {

        int num=567;
        int sum=0;
        while(num>0){

            sum=sum+num%10;
            num=num/10;
        }

        System.out.println("Sum is "+sum);//18
    }
}
