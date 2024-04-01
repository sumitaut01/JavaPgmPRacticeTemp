package javaconcepts;

import java.util.HashSet;
import java.util.Set;

public class LoopSet_01 {
    public static void main(String[] args) {

        Set<String> set=new HashSet<>();
        System.out.println(set.add("sumit"));//true
        System.out.println(set.add("sumit"));//false


        set.add("neha");
        set.add("amit");

        System.out.println(set);//[neha, amit, sumit]


        for (String s:set) {

            System.out.println(s);
        }
//        neha
//                amit
//        sumit
    }
}
