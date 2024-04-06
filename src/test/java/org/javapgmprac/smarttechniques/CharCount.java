package org.javapgmprac.smarttechniques;

public class CharCount {

    public static void main(String[] args) {

        String str="this is it";

        int arrChar[]=new int[26];
        int arrCharCount[]=new int[26];

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(!Character.isAlphabetic(c)) continue;

            int val=Character.toLowerCase(c)-'a';

            arrCharCount[val]=arrCharCount[val]+1;
            arrChar[val]=val;
        }

        System.out.println("xx");
        for (int j=0;j<arrChar.length;j++){
            System.out.println((char)(arrChar[j]+65)+"=>"+arrCharCount[j]);

        }

    }
}
