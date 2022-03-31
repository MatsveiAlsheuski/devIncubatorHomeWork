package module17Reflections.task17;

import module8OOP.Kangaroo;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CodeAnalyzer {
    public static void main(String[] args) {
        String string = new String();
        Kangaroo myClass = new Kangaroo("Kangaroo1", 4, false);
        analyzeClass(myClass);
    }

    public static void analyzeClass(Object o) {
        Class<?> reportedClass = o.getClass();
        System.out.println(reportedClass);
        separatorPrint();

        System.out.println(reportedClass.getClassLoader());
        separatorPrint();

        getAllOurInterfaces(reportedClass);
        separatorPrint();

        getAllOurSuperclass(reportedClass);
        separatorPrint();

        getAllOurFields(reportedClass);
        separatorPrint();

        getAllOurConstructors(reportedClass);
        separatorPrint();

        getAllOurCMethods(reportedClass);
        separatorPrint();

        getAllOurAnnotations(reportedClass);
        separatorPrint();
    }

    private static void separatorPrint() {
        System.out.println("------------------------------------------------");
    }

    private static void getAllOurInterfaces(Class<?> o) {
        Class[] interfaces = o.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println("\t" + anInterface.getName());
            System.out.println();
            for (Method method : anInterface.getMethods()) {
                System.out.println("\t \t" + method);
                System.out.println();
            }
        }
    }

    private static void getAllOurSuperclass(Class<?> o) {
        System.out.println(o.getSuperclass());
        System.out.println();
        if (!(o.getSuperclass() == null)) getAllOurSuperclass(o.getSuperclass());
    }

    private static void getAllOurFields(Class<?> o) {
        Field[] fields = o.getFields();
        for (Field field : fields) {
            System.out.println(field);
            System.out.println("\t" + field.getModifiers());
            System.out.println("\t" + field.getName());
            System.out.println("\t" + field.getType());
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);
            }
        }
    }


    private static void getAllOurConstructors(Class<?> o) {
        Constructor<?>[] constructors = o.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
            System.out.println("\t" + constructor.getModifiers());

            Class<?>[] parameterTypes = constructor.getParameterTypes();
            for (Class<?> parameterType : parameterTypes) {
                System.out.println("\t \t" + parameterType.getModifiers());
                System.out.println("\t \t" + parameterType.getTypeName());
                Annotation[] annotations = parameterType.getAnnotations();
                for (Annotation annotation : annotations) {
                    System.out.println("\t \t" + annotation);
                }
                System.out.println();
            }
            Annotation[] annotations = constructor.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println("\t" + annotation);
                System.out.println();
            }
        }
    }

    private static void getAllOurCMethods(Class<?> o){
        Method[] methods = o.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println("\t" + method.getModifiers());
            System.out.println("\t" + method.getReturnType());
            System.out.println("\t" + method.getName());
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println("\t" + parameterType);
                System.out.println("\t \t" + parameterType.getModifiers());
                System.out.println("\t \t" + parameterType.getTypeName());
                Annotation[] annotations = parameterType.getAnnotations();
                for (Annotation annotation : annotations) {
                    System.out.println("\t \t" + annotation);
                    System.out.println();
                }
            }System.out.println();

        }
    }

    private static void getAllOurAnnotations(Class<?> o){
        Annotation[] annotations = o.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
            System.out.println();
        }
    }


}