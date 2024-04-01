package javaconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LoopMap_01 {

    public static void main(String[] args) {


        HashMap<String,String> hm=new HashMap<>();

        hm.put("Sumit","IT");
        hm.put("Neha","BSC");
        hm.put("Amit","Pharma");



        //1
        hm.forEach((k,v)-> System.out.println(k+"==>"+v));
//        Neha==>BSC
//        Amit==>Pharma
//        Sumit==>IT


        // f

      for(Map.Entry<String, String> es:hm.entrySet()){
          System.out.println(es.getValue());
//          BSC
//                  Pharma
//          IT

      }

      //only values
      hm.values().forEach(v-> System.out.println("Print values "+v));
//        BSC
//                Pharma
//        IT


    }
}
