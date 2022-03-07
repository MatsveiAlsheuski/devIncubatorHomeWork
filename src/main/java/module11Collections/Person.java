package module11Collections;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + " " + age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.getAge() == o.getAge()) return 0;
        else if (this.getAge() < o.getAge()) return -1;
        else return 1;
    }
}
