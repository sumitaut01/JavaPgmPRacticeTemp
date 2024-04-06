package org.javapgmprac;

import java.util.Arrays;
import java.util.regex.Pattern;

public class CapitalFirstLetter {

    public static void main(String[] args) {
        String str = "make selenium easy";
       String strArr[]= str.split(" ");

        for (String s:strArr) {

            if(Character.isLowerCase(s.charAt(0))){

                s=String.valueOf(s.charAt(0)).toUpperCase()+s.substring(1);
                System.out.print(s+" ");
            }

            else{
                System.out.print(s);
            }
        }



    }



}
