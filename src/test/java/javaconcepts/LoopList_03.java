package javaconcepts;

import java.util.Arrays;

public class LoopList_03 {

    public static void main(String[] args) {

        Arrays.asList("sumit","Neha","Amit").forEach(x-> System.out.println(x));

        //1
        for(int i=0;i<Arrays.asList("sumit","Neha","Amit").size();i++){
            System.out.println(Arrays.asList("sumit","Neha","Amit").get(i));
        }

        //2
        for (String s:Arrays.asList("sumit","Neha","Amit")) {
            System.out.println(s);
        }


    }
}
