package org.javapgmprac;

public class StringManipulation_11 {
    public static void main(String[] args) {

        String str="this is it";
        System.out.println("length of string is: "+str.length());


        System.out.println(str.indexOf("X"));//-1  non existent
        System.out.println(str.indexOf("t"));//0  first index

        System.out.println(str.lastIndexOf("t"));//9  last index

        System.out.println(str.substring(1));//his is it
        System.out.println(str.substring(0,3));//thi

        System.out.println(str.charAt(1000));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 1000



    }
}
