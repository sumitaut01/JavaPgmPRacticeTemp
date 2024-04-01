package org.javapgmprac;

import java.util.HashSet;

public class DuplicateInArrayWithSet_06 {

    public static void main(String[] args) {

        String[] arr={"java","python","csharp","java","python"};

        HashSet<String> hs=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(!hs.add(arr[i])){
                System.out.print(arr[i]+" ");//java python
            }
        }




    }
}
