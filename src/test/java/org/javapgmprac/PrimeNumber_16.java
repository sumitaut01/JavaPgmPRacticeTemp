package org.javapgmprac;

public class PrimeNumber_16 {

    public static void main(String[] args) {

        int range=20;
        int count;

        for(int i=2;i<=range;i++){
count=0;
            for(int j=2;j<range;j++){


                if(i%j==0){
                    count++;
                }

            }
            if(count==1){

                System.out.println("Prime Number=> "+i);
            }

        }

    }
}
