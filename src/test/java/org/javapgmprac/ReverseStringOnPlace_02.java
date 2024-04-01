package org.javapgmprac;

public class ReverseStringOnPlace_02 {

    public static void main(String[] args) {
        String str = "this is sparta";
        String []data=str.split(" ");

        for (int i=0;i<data.length;i++){
            for(int j=data[i].length()-1;j>=0;j--){
                System.out.print(data[i].charAt(j));
            }
            System.out.print(" ");
        }
    }

}
