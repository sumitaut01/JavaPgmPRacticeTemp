package javaconcepts;

public class MethodOverLoading {

    public static void main(String[] args) {
        new MethodOverLoading().sum(2,3);
        new MethodOverLoading().sum("sumit","rrr");
    }


    public  void sum(int a,int b){
        System.out.println("Integer ");
        System.out.println(a+b);

    }

    public  void sum(String a,String b){
        System.out.println("String ");
        System.out.print((a+b));

    }



}
