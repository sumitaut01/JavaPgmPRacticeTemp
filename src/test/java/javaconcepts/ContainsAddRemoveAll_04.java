package javaconcepts;

import java.util.ArrayList;

public class ContainsAddRemoveAll_04 {

    public static void main(String[] args) {

        ArrayList<String> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        ArrayList<String> l3=new ArrayList<>();

        l1.add("sumit");
        l1.add("amit");

        l2.add("aabha");
        l2.addAll(l1);
        l3.add("xyz");

        System.out.println(l1);//[sumit, amit]
        System.out.println(l2);//[aabha, sumit, amit]

        System.out.println(l2.containsAll(l1));//true


        System.out.println(l2.removeAll(l1));//true
        System.out.println(l2);//[aabha]
        System.out.println(l2.removeAll(l3));//false

    }
}
