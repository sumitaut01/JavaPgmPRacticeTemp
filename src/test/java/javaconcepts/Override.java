package javaconcepts;

public class Override {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.walk();
        p.printCommon();

        System.out.println("---------------------------------------------------------------------");
        Child c = new Child();
        c.walk();
        c.printCommon();


        Parent p1 = new Child();
        p1.printCommon();//will print child as its overriden

        p1.walk();//child
        p1.ParentOnly();//Parently
        p1.printNonCommon();
        //  p1.ChildOnly();//Cannot resolve method 'ChildOnly' in 'Parent'

        c.usageOfSuper();//calls parents method


    }


}


class Parent {

    int parentAge = 70;
    int common = 10;

    public void walk() {
        System.out.println("I am running at 3 km/hr");
    }

    public void printCommon() {

        System.out.println(common);
    }

    public void printNonCommon() {

        System.out.println("NONcommon in parent");
    }

    public void ParentOnly() {

        System.out.println(" ParentOnlymethod");
    }


}


class Child extends Parent {
    int childAge = 30;
    int common = 20;

    public void walk() {

        System.out.println("I am running at 6 km/hr");
    }

    public void printCommon() {

        System.out.println(common);
    }

    public void ChildOnly() {

        System.out.println(" ChildOnly method");
    }


    public void usageOfSuper(){
        System.out.println("below parent method called form child");
        super.walk();

    }
}