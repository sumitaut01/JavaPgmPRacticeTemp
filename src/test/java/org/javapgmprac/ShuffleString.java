package org.javapgmprac;

public class ShuffleString {
    public static void main(String[] args) {
        String s = "codeleet";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
         char[] chr=new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            int val = indices[i];
            chr[i]=s.charAt(val);
        }
        System.out.println(new String(chr));
    }


}