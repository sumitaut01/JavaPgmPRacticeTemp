package org.javapgmprac;

public class SecondLargestInArray_08 {

    public static void main(String[] args) {

       int[] arr = {99,5,4,8,1,5,6,9,7,0,120,5,4};
        //int[] arr = {99,5};
        int largest = 0;
        int second = 0;


        for (int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];
            }

            else if(arr[i]>second && arr[i]<largest){
                second=arr[i];
            }
        }
        System.out.println(largest +" "+second);

    }
}
