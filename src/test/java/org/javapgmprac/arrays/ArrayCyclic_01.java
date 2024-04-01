package org.javapgmprac.arrays;

import java.util.Arrays;

public class ArrayCyclic_01 {
    public static void main(String[] args) {

        //	Given array is
//	1 2 3 4 5
//	Rotated array is
//	5 1 2 3 4

        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        int i=0,j=arr.length-1;

        while(i!=j) {

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;

        }

        System.out.println(Arrays.toString(arr));

    }
}
