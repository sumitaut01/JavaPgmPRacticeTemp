package org.javapgmprac;

import java.util.HashMap;
import java.util.HashSet;

public class TwoSum_14 {

    public static void main(String[] args) {

        int []arr={0,1,2,3,4,5,6,7,8,9};
        int expSum=9;

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int val=expSum-arr[i];

if(hm.containsValue(val)){
    System.out.println("found:"+ arr[i] +" "+ val);
}

else{
    hm.put(i,arr[i]);
}


        }




    }

}
