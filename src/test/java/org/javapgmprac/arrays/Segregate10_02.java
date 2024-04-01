package org.javapgmprac.arrays;

import java.util.Arrays;

public class Segregate10_02 {

    public static void main(String[] args) {

        int arr[]={0,1,0,1,0,1};
        System.out.println("Before :" +Arrays.toString(arr));
        int zeroCount=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zeroCount=zeroCount+1;
            }
        }


        for(int i=0;i<arr.length;i++){

            if(i<=zeroCount-1){
                arr[i]=0;
            }
            else{

                arr[i]=1;
            }

        }

        System.out.println("After :" +Arrays.toString(arr));



    }
}
