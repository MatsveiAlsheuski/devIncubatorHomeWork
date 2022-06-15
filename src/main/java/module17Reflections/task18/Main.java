package module17Reflections.task18;

public class Main {
    public static void main(String[] args) {
         Apple myClass = ObjectFactory.create(Apple.class);
        Initializer.initialize(myClass, "color", "Blue");
        Initializer.initialize(myClass, "weight", 5);
        System.out.println(myClass);
    }
}
