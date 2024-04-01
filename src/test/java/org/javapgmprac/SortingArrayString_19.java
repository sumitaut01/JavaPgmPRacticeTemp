package org.javapgmprac;

import java.util.Arrays;

public class SortingArrayString_19 {

    public static void main(String[] args) {

        String str="Athis Zis Bove";

        System.out.println(str);

        String [] arrStr=str.split(" ");

        for(int i=0;i<arrStr.length-1;i++){

            for(int j=i+1;j<arrStr.length;j++){

               if( arrStr[i].compareTo( arrStr[j])>0){
                    String temp=arrStr[i];
                    arrStr[i]=arrStr[j];
                    arrStr[j]=temp;
                }
            }


        }
        System.out.println(Arrays.toString(arrStr));



    }
}
