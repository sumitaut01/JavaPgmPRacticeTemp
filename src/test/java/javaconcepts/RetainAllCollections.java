package javaconcepts;

import java.util.ArrayList;

public class RetainAllCollections {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();
        ArrayList<String> a2 = new ArrayList<>();
        ArrayList<String> a3 = new ArrayList<>();
        a1.add("sumit");
        a1.add("amit");
        a1.add("shilpa");
        a1.add("raut");

        a2.add("raju");
        a2.add("praveen");
        a2.add("vrinda");
        a2.add("raut");

        a3.add("random");

        System.out.println(a1);//[sumit, amit, shilpa, raut]
        a1.retainAll(a2);//returns true since they have common "raut"
        System.out.println(a1); //[raut]

        a1.retainAll(a3);
        System.out.println(a1);//[]




    }
}
