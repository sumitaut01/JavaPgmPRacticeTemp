package javaconcepts;

public class FinallyWithReturnTryCatch {

    public static void main(String[] args) {



        try{
            int i=1/0;
            return;
        }

        catch (Exception oEx){
            System.out.println("inside catch for 1/0 case");
            oEx.printStackTrace();
            return;
        }

        finally {
            System.out.println("Statement from finally. Return used in  catch and try");
        }
    }
}
