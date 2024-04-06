package javaconcepts;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {


        Student s1=new Student(32,"Sumit");
        Student s2=new Student(31,"Sumit");


        List<Student> stu= new ArrayList<>();

        stu.add(s1);
        stu.add(s2);

        stu.forEach(s-> System.out.println(s.age +" "+s.name));
//        32 Sumit
//        31 Sumit

        Collections.sort(stu);
        stu.forEach(s-> System.out.println(s.age +" "+s.name));
//        31 Sumit
//        32 Sumit


    }
}



class Student implements Comparable<Student> {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int compareTo(Student other) {
        return Integer.compare(this.age,other.age);
    }



}