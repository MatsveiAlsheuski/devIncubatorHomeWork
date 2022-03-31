package module17Reflections.task18;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectFactory {
    /**
     * Сам определяет что полу final и его не проверяет, почему-то работает как надо
     */
    public static void main(String[] args) {
        //MyClass myClass = new MyClass();
        Apple myClass = new Apple();
        Class<?> myClassClass = myClass.getClass();
        Apple myClass1 = (Apple) create(myClassClass);
        System.out.print("Класс пустой? ");
        System.out.println(myClass1 == null);
        System.out.println(myClass1);
    }

    public static <T> T create(Class<T> clazz) {
        Object myClass = null;
        Field[] fields = clazz.getDeclaredFields();
        Method[] methods = clazz.getMethods();
      /*  for (Field field : fields) {
            System.out.println(field);
        }*/
        for (Field field : fields) {
            String fieldO = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
          //  System.out.println(fieldO);
            if (!isGetter(methods, fieldO)) return (T) myClass;
            if (!isSetter(methods, fieldO)) return (T) myClass;
        }
        try {
            myClass = clazz.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Don't have default constructor");
        } catch (IllegalAccessException e) {
            System.out.println("The currently executing method does not have access" +
                    " to the definition of the specified class");
        }
        return (T) myClass;
    }

    private static boolean isGetter(Method[] methods, String field) {
        for (Method method : methods) {
            if (method.getName().startsWith("get" + field)) {
                if (method.getParameterTypes().length == 0) {
                    if (!void.class.equals(method.getReturnType())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean isSetter(Method[] methods, String field) {
        for (Method method : methods) {
            if (method.getName().startsWith("set" + field)) {
                if (method.getParameterTypes().length == 1) {
                    return true;
                }
            }
        }
        return false;
    }

  /*  public static boolean isGetter(Method method){
        if (!method.getName().startsWith("get")) {
            return false;
        }
        if (method.getParameterTypes().length != 0) {
            return false;
        }
        if (void.class.equals(method.getReturnType())) {
            return false;
        }
        return true;
    }*/
/*
    public static boolean isSetter(Method method){
        if (!method.getName().startsWith("set")) {
            return false;
        }
        if (method.getParameterTypes().length != 1) {
            return false;
        }
        return true;
    }*/
}
