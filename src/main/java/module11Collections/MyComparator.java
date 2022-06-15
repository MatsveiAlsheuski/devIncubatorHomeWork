package module11Collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Person> {
    public int compare(Person person1, Person person2) {
        if (person1.getAge() == person2.getAge()) return 0;
        else if (person1.getAge() < person2.getAge()) return -1;
        else return 1;
    }
}
