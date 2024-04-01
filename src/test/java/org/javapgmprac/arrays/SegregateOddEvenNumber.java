package org.javapgmprac.arrays;

import java.util.Arrays;

public class SegregateOddEvenNumber {


    public static void main(String[] args) {

        int arr[]={2,3,4,6,2,9,7};
        int left=0;
        int right=arr.length-1;

        System.out.println("Before: "+Arrays.toString(arr));
        while(arr[left]%2==0 && left<right){
            left++;
        }
        while(arr[right]%2 !=0 && left<right){
            right--;
        }

        if(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("After: "+Arrays.toString(arr));
    }
//    Before: [2, 3, 4, 6, 2, 9, 7]
//    After: [2, 2, 4, 6, 3, 9, 7]

}
