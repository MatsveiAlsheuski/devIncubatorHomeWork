package module15JavaVersions.Task15;

import module11Collections.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Main<T> {
    public static void main(String[] args) {
        Comparator<Person> personComparator = new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                if (person1.getAge() == person2.getAge()) return 0;
                else if (person1.getAge() < person2.getAge()) return -1;
                else return 1;
            }
        };
        Comparator<Person> personComparator1 = (Person person1, Person person2) -> {
            if (person1.getAge() == person2.getAge()) return 0;
            else if (person1.getAge() < person2.getAge()) return -1;
            else return 1;
        };
        /** b */

        String[] strings = {"fg", "sdf"};
        Filter<String[]> filter = string1 -> {
            string1 = null;
            return true;
        };
        filter.apply(strings);

        Predicate<String[]> predicatet = string2 -> {
            string2 = null;
            return true;
        };
        predicatet.test(strings);
        /**c */
/*
        Integer[] squares = new Integer[100];
        Function<Integer[], > functions = (squaress, integerss) -> {for (int i = 0; i<squaress.)
        }
                functions.fill(squares, integer -> integerss * integerss);*/

        /** e */
        Dog god = new Dog("Dog", 12, 5);
        Converter<Dog, Cat> catConverter = dog -> new Cat(dog.name, dog.age, dog.weight);
        Cat cat = catConverter.convert(god);
        System.out.println(cat);
        /** f */
        Predicate<Integer> predicate = number -> {
            if (number % 2 == 0) return true;
            else return false;
        };
        System.out.println(predicate.test(4));
        /** g */
        Consumer<String> consumer = hello -> System.out.println("Hello " + hello);
        consumer.accept("Matsvei");
        /** H */
        List<String> list = new ArrayList<>();
        list.add("Elena");
        list.add("John");
        list.add("Alex");
        list.add("Jim");
        list.add("Sara");
        Supplier<String> supplier = () -> list.get(0 + (int) (Math.random() * 5));
        System.out.println(supplier.get());
        /** i */
        Function<String, Integer> function = sting -> Integer.parseInt(sting);
        System.out.println(function.apply("5"));
        /** j */
        UnaryOperator<Integer> unaryOperator = numb -> {
            System.out.println(numb * numb);
            return numb * numb;
        };
        unaryOperator.apply(5);
    }
}

