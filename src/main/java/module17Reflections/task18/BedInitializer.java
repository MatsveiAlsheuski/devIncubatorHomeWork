package module17Reflections.task18;

import java.lang.reflect.Field;

public class BedInitializer extends Initializer {
    public static void main(String[] args) {
        Apple myClass = new Apple();
        initialize(myClass, "color", "Blue");
        initialize(myClass, "weight", 5);
        System.out.println(myClass);
    }

    public static <T> T initialize(T target, String fieldName, Object value) {
        Object myClass = target;
        try {
            Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(myClass, value);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return (T) myClass;
    }
}
