package org.javapgmprac;

public class RemoveSPClChars_03 {

    public static void main(String[] args) {
        String str="this is 09 but %%$^&& but clear data";
        System.out.println(str.replaceAll("[^0-9 A-Z a-z]",""));
        //this is 09 but  but clear data
    }
}
