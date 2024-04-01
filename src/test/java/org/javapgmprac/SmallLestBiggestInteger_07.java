package org.javapgmprac;

public class SmallLestBiggestInteger_07 {

    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,8};
        int biggest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>biggest){
                biggest=arr[i];
            }
        }

        System.out.println(biggest);//8
    }
}
