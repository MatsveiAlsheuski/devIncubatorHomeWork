package module3Classes.Task4;

import java.util.Scanner;

public class MainDay {
    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        if (!isNumber(string)) System.out.println(string);
        else if (Integer.parseInt(string) > 0 && Integer.parseInt(string) < 8) {
            DaysOfTheWeek daysOfTheWeek = DaysOfTheWeek.initializer(Integer.parseInt(string));
        } else System.out.println(string);
    }

    private static boolean isNumber(String string) {
        for (char c : string.toCharArray()) {
            if (!Character.isDigit(c)) return false;
        }
        return true;
    }
}
