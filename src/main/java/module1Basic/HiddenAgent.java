package module1Basic;

public class HiddenAgent {
    public static void main(String[] args) {
        System.out.println("Task1:");
        HiddenAgent task1 = new HiddenAgent();
        Class<?> task1Class = task1.getClass();
        System.out.println("It's a loader:\n" + task1Class.getClassLoader());
        System.out.println("It's a parent of loader:\n" + task1Class.getClassLoader().getParent());
        System.out.println("It's a parent's parent of loader:\n" + task1Class.getClassLoader().getParent().getParent());
        System.out.println("Task2:");
        Integer task2 = 0;
        Class<?> task2Class = task2.getClass();
        System.out.println(task2Class.getClassLoader());
        System.out.println("Task3:");
        MyClass task3 = new MyClass();
        Class<?> task3Class = task3.getClass();
        System.out.println("It's a loader: \n" + task3Class.getClassLoader());
        System.out.println("It's a parent of loader: \n" + task3Class.getClassLoader().getParent());
        System.out.println("It's a parent's parent of loader: \n" + task3Class.getClassLoader().getParent().getParent());
    }
}