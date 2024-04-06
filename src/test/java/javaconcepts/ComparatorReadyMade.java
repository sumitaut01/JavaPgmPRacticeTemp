package javaconcepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorReadyMade {

    public static void main(String[] args) {


        Person p1 = new Person(10, "Sumit", "First");
        Person p2 = new Person(10, "Sumit", "Second");
        Person p3 = new Person(10, "Amit", "Second");
        Person p4 = new Person(9, "Neha", "First");

        List<Person> lstPerson= new ArrayList();
        lstPerson.add(p1);
        lstPerson.add(p2);
        lstPerson.add(p3);
        lstPerson.add(p4);

        lstPerson.forEach(lst-> System.out.println(lst.toString()));
        System.out.println("---------------Separator--------------");
        Collections.sort(lstPerson, Comparator.comparingInt(Person::getAge).thenComparing(Person::getName).thenComparing(Person::getGrade));
        lstPerson.forEach(lst-> System.out.println(lst.toString()));
    }
}


    class Person{

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
        public String getGrade() {
            return grade;
        }

        @java.lang.Override
        public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", grade='" + grade + '\'' +
                    '}';
        }

        int age;
        String name;
        String grade;

        public Person(int age, String name, String grade) {
            this.age = age;
            this.name = name;
            this.grade = grade;
        }

    }

