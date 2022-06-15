package module15JavaVersions.Task16;

public class People {
    String name;
    int age;
    Sex sex;

    public People(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + sex;
    }

    public int getAge() {
        return age;
    }
    public int compare(People person2) {
        if (this.getAge() == person2.getAge()) return 0;
        else if (this.getAge() < person2.getAge()) return -1;
        else return 1;
    }

}
