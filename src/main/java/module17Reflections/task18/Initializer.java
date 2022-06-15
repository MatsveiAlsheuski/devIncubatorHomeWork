package module17Reflections.task18;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class Initializer {
    public static void main(String[] args) throws Exception {
        Apple myClass = new Apple();
        initialize(myClass, "color", "Blue");
        initialize(myClass, "weight", 5);
        System.out.println(myClass);
    }
   /* static <T> T initialize(T target, String fieldName, Object value) throws Exception {
        Class<?> clazz = target.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        Method set = null;

        for (Method m : methods) {
            if (m.getName().startsWith("set") && m.getName().toLowerCase(Locale.ROOT).contains(fieldName)) {
                set = m;
            }
        }
        if (set != null) {
            set.setAccessible(true);
            set.invoke(target, value);
        } else throw new NoSuchMethodException("No setter method in the class " + clazz.getName());

        System.out.println("Field - " + fieldName + " was successfully changed to " + value);
        return target;
    }*/
  public static <T> T initialize(T target, String fieldName, Object value) {
        String nameMethod = "set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1);
        Object myClass = target;
        Method method = null;
        try {
            System.out.println(value.getClass());
            method = target.getClass().getDeclaredMethod(nameMethod, value.getClass());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        try {
            method.invoke(target, value);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (T) myClass;
    }
}
