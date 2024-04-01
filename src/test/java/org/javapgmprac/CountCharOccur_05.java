package org.javapgmprac;

import java.util.HashMap;

public class CountCharOccur_05 {

    public static void main(String[] args) {

        String str="this is data";
        HashMap<Character,Integer> count=new HashMap<Character,Integer>();

        for(int i=0;i<str.length();i++){

            if(!count.containsKey(str.charAt(i))){
                count.put(str.charAt(i),1);
            }
            else{
                count.put(str.charAt(i), (count.get(str.charAt(i))+1 ));

            }

        }
        System.out.println(count);
//{ =2, a=2, s=2, t=2, d=1, h=1, i=2}


    }
}
