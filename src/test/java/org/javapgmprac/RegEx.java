package org.javapgmprac;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

    public static void main(String[] args) {

        String str="this string has 123 number 567 and text";

        Pattern p1=Pattern.compile("[0-9]+");
        Pattern p2=Pattern.compile("[a-z A-Z]+");

        Matcher m1=p1.matcher(str);
        Matcher m2=p2.matcher(str);

        while(m1.find()){

            System.out.println(m1.group());
        }

        while(m2.find()){

            System.out.println(m2.group());
        }


    }
}
