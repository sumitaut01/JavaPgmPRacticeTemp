package dsa;

import java.util.Stack;

public class StackStringReverse {

    public static void main(String[] args) {

        String str="this is sparta";
        System.out.println(str);
        Stack<String> stk=new Stack<>();
        for (String s:str.split("")
             ) {
            stk.push(s);
        }


        while(!stk.empty()){
            System.out.print(stk.pop());
        }
    }


}
