package module11Collections;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("Pasha", 10);
        persons[1] = new Person("Sasha", 8);
        persons[2] = new Person("Masha", 9);
        persons[3] = new Person("Casha", 12);
        persons[4] = new Person("Gasha", 11);

       // Arrays.sort(persons, new MyComparator());
        Arrays.sort(persons);
        for (Person person:persons) {
            System.out.println(person);
        }
    }
}
