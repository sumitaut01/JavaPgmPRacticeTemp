package org.javapgmprac;

public class FLoydTriangle_18 {

    public static void main(String[] args) {

        //Floyd's triangle
//****************
//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21


        int rows=6;
        int num=1;
        for(int i=0;i<6;i++){
            for(int j=0;j<=i;j++){
                System.out.print(num++ +" ");
            }
            System.out.println("");
        }

    }
}
