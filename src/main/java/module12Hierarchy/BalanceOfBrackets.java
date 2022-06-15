package module12Hierarchy;

import java.util.Scanner;

public class BalanceOfBrackets {
    private int circleBracket = 0;
    private int squareBracket = 0;
    private int figureBracket = 0;
    private int triangleBracket = 0;

    private void countBracket(char line) {
        if (line == '{') figureBracket++;
        if (line == '}') figureBracket--;
        if (line == '(') circleBracket++;
        if (line == ')') circleBracket--;
        if (line == '[') squareBracket++;
        if (line == ']') squareBracket--;
        if (line == '<') triangleBracket++;
        if (line == '>') triangleBracket--;
    }

    public boolean changeBracket(String line) {
        char[] chars = line.toCharArray();
        for (int i = 0; i < line.length(); i++) {
            countBracket(chars[i]);
           /* if (figureBracket < 0 || circleBracket < 0
                    || squareBracket < 0 || triangleBracket < 0)
                return false;*/                                           /** проверка начинается ли с закрытой схобки*/
        }
        if (figureBracket == 0 && circleBracket == 0
                && squareBracket == 0 && triangleBracket == 0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        BalanceOfBrackets balanceOfBrackets = new BalanceOfBrackets();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(balanceOfBrackets.changeBracket(line));

    }
}
