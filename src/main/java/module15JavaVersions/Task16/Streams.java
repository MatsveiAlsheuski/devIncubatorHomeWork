package module15JavaVersions.Task16;

import module11Collections.MyComparator;
import module11Collections.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a1");
        strings.add("a2");
        strings.add("a3");
        strings.add("a1");
/** 1*/
        String st = "a1";
        System.out.println(strings.stream().filter(x -> x.equals(st)).count());
/** 2*/
        System.out.println(strings.stream().findFirst().orElse("0"));
/** 3*/
        System.out.println(strings.stream().skip(2).findFirst().get());
/** 4*/
        System.out.println(Arrays.toString(strings.stream().skip(1).limit(2).toArray()));
/** 5*/
        System.out.println(Arrays.toString(strings.stream().filter(x -> x.equals(st)).toArray()));
/** 6*/
        System.out.println(strings.stream().anyMatch(st::equals));
/** 7*/
        System.out.println(strings.stream().noneMatch("a7"::equals));
/** 8*/
        System.out.println(Arrays.toString(strings.stream().mapToInt(x -> Integer.parseInt(x.substring(1))).toArray()));
/** 9*/
        System.out.println(strings.stream().collect(Collectors.joining()));
/** 10*/
        System.out.println(Arrays.toString(strings.stream().sorted().toArray()));

/**Вторая часть*/
        List<People> people = new ArrayList<>();
        people.add(new People("Basil", 16, Sex.MAN));
        people.add(new People("Peter", 23, Sex.MAN));
        people.add(new People("Helen", 42, Sex.WOMAN));
        people.add(new People("Ivan", 69, Sex.MAN));
/** 1*/
        System.out.println((Arrays.toString(people.stream().filter(x -> x.age > 18 && x.age < 27).toArray())));
/** 2*/
        System.out.println(people.stream().filter(x -> x.sex == Sex.MAN)
                .mapToInt(People::getAge).average().getAsDouble());
/** 3*/
        System.out.println((Arrays.toString(people.stream()
                .filter(x -> ((x.age > 18 && x.age < 60 && x.sex == Sex.MAN) ||
                        (x.age > 18 && x.age < 55 && x.sex == Sex.WOMAN))).toArray())));
/** 4*/
        System.out.println((people.stream().min((p1, p2) -> p1.compare(p2))).get());
/** 5*/
        System.out.println(people.stream().sorted((p1, p2) -> p1.compare(p2)).collect(Collectors.toList()));

    }


}
