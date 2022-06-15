package module5Extensions;

import java.util.Scanner;

public class School {
    private static int studentCount;
    private String lastName;
    private String firstName;
    private double pointAverage;
    //private final int numberOfTheSchool = 10;

    public School(String lastName, String firstName, double pointAverage) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.pointAverage = pointAverage;
        studentCount++;
        System.out.println("Default constructor execution - " + getStudentCount());
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public double getPointAverage() {
        return pointAverage;
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + pointAverage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbStudents = sc.nextInt();
        School[] students = new School[numbStudents];
        for (int i = 0; i < numbStudents; i++) {
            students[i] = new School(new Scanner(System.in).nextLine(), new Scanner(System.in)
                    .nextLine(), new Scanner(System.in).nextDouble());
        }

        double pointAverages = 0;
        for (School student : students) {
            pointAverages += student.getPointAverage();
        }
        pointAverages = pointAverages / students.length;
        System.out.printf("%.2f" + "\n", pointAverages);

        for (School student : students) {
            if (student.getPointAverage() < pointAverages) System.out.println(student);
        }
    }
}
