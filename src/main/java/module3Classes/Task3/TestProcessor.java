package module3Classes.Task3;

import java.util.Scanner;

public class TestProcessor {
    Scanner sc = new Scanner(System.in);
    String str1 = "Java";
    String str2 = "JAVA";
    String str3 = "C#";
    String str4 = "Java";

    private String scanner() {
        return sc.nextLine();
    }

    public String addingTextToEnd() {
        System.out.print("Text:");
        String text = scanner();
        System.out.print("Word for append:");
        String word = scanner();
        return text + word;
    }

    public String insertTextAtASpecificPosition() {
        System.out.print("Text:");
        String text = scanner();
        System.out.print("Word for insert:");
        String word = scanner();
        int indexChar = text.indexOf(' ');
        return (new StringBuilder(text).insert(indexChar, word)).toString();
    }

    public String removeCharacterFromText() {
        System.out.print("Text:");
        String text = scanner();
        System.out.print("Symbol for delete:");
        String symbol = scanner();
        int indexChar = text.indexOf(symbol);
        return text.substring(0, indexChar) + text.substring(indexChar + 1);
    }

    public String replacingASubstringOfTextWishAnotherSubstring() {
        System.out.print("Text:");
        String text = scanner();
        System.out.print("Word for replace:");
        String wordForReplace = scanner();
        System.out.print("to");
        String word = scanner();
        return text.replaceAll(wordForReplace, word);
    }

    public void reverseString() {
        String text = scanner();
        char[] charsText = text.toCharArray();
        char a;
        for (int i = 0, j = charsText.length - 1; i < j; i++, j--) {
            a = charsText[i];
            charsText[i] = charsText[j];
            charsText[j] = a;
        }
        System.out.println(new String(charsText));
    }

    public void reversStringAndDeleteSpace() {
        String text = scanner();
        char[] charsText = text.substring(0, text.indexOf('.') + 1).toCharArray();
        int space = 0;
        char[] newCharsText = new char[charsText.length];
        for (int i = 0, j = 0; j < charsText.length; i++, j++) {
            if (charsText[j] == ' ') {
                j++;
                space++;
            }
            newCharsText[i] = charsText[j];
        }
        System.out.println(new String(newCharsText));
    }

    public void outputOnlyUppercase() {
        String text = scanner();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
            } else if (text.charAt(i) == text.toUpperCase().charAt(i))
                builder.append(text.charAt(i));
        }
        System.out.println(new String(builder));
    }

    public void outputEachOfEvenLetterAndUppercaseIt() {
        String text = scanner();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
            } else if (i % 2 != 0)
                builder.append(text.toUpperCase().charAt(i));
        }
        System.out.println(new String(builder));
    }

    public void replaceEmptyStringsInTheArray() {
        int length = sc.nextInt();
        String[] arrayStrings = new String[length];
        for (int i = 0; i < length; i++) {
            String string = new Scanner(System.in).nextLine();//немогу понять почему работает не так как обычно
            arrayStrings[i] = (!string.equals("")) ? string : "String is empty";
        }
        for (String string : arrayStrings) {
            System.out.println(string);
        }
    }

    public void equalsObjectByOperator() {
        String parameter = scanner();
        String methods = scanner();
        String[] parameterSplit = parameter.split("\\s*(\\s|,|!|\\.|;|\")\\s*");
        String[] methodsSplit = methods.split("\\s*(\\s|,|!|\\.|;)\\s*");

        if (parameterSplit[0].equalsIgnoreCase("In")
                && (parameterSplit[1].equalsIgnoreCase("pairs"))) {
            int numberFalse = 0;
            int numberTrue = 0;
            if (methodsSplit[1].equals("equals()")) {
                for (int i = 2; i < parameterSplit.length - 1; i++) {
                    for (int j = i + 1; j < parameterSplit.length; j++) {
                        if (switchCase(parameterSplit[i]).equals(switchCase(parameterSplit[j]))) {
                            numberTrue++;
                        } else numberFalse++;
                    }
                }
            } else if (methodsSplit[1].equals("equalsIgnoreCase()")) {
                for (int i = 2; i < parameterSplit.length - 1; i++) {
                    for (int j = i + 1; j < parameterSplit.length; j++) {
                        if (switchCase(parameterSplit[i]).equalsIgnoreCase(switchCase(parameterSplit[j]))) {
                            numberTrue++;
                        } else numberFalse++;
                    }
                }
            } else if (methodsSplit[1].equals("==")) {
                for (int i = 2; i < parameterSplit.length - 1; i++) {
                    for (int j = i + 1; j < parameterSplit.length; j++) {
                        if (switchCase(parameterSplit[i]) == switchCase(parameterSplit[j])) {
                            numberTrue++;
                        } else numberFalse++;
                    }
                }
            }
            System.out.println(numberFalse + " false, " + numberTrue + " true");
        }
        if ((parameterSplit[0].equals("str1") ||
                parameterSplit[0].equals("str2") ||
                parameterSplit[0].equals("str3") ||
                parameterSplit[0].equals("str4") ||
                parameterSplit[0].equals("null")) &&
                (parameterSplit[1].equals("str1") ||
                        parameterSplit[1].equals("str2") ||
                        parameterSplit[1].equals("str3") ||
                        parameterSplit[1].equals("str4") ||
                        parameterSplit[1].equals("null"))) {
            if (methodsSplit[1].equals("equals()")) {
                System.out.println(switchCase(parameterSplit[0]).equals(switchCase(parameterSplit[1])));
            } else if (methodsSplit[1].equals("equalsIgnoreCase()")) {
                System.out.println(switchCase(parameterSplit[0]).equalsIgnoreCase(switchCase(parameterSplit[1])));
            } else if (methodsSplit[1].equals("==")) {
                System.out.println(switchCase(parameterSplit[0]) == (switchCase(parameterSplit[1])));
            }
        }
        if ((parameterSplit[0].equals("str1") ||
                parameterSplit[0].equals("str2") ||
                parameterSplit[0].equals("str3") ||
                parameterSplit[0].equals("str4")) &&
                parameterSplit[1].equals("=")) {
            if ((methodsSplit[1].equals(("str1"))) || (methodsSplit[1].equals(("str2"))) ||
                    (methodsSplit[1].equals(("str3"))) || (methodsSplit[1].equals(("str4"))) ||
                    (methodsSplit[1].equals(("null")))) {
                String methodsElse = scanner();
                String[] methodsSplitElse = methodsElse.split("\\s*(\\s|,|!|\\.|;)\\s*");
                if (methodsSplitElse[1].equals("equals()")) {
                    System.out.println(assign(parameterSplit).equals(switchCase(methodsSplit[1])));
                } else if (methodsSplitElse[1].equals("equalsIgnoreCase()")) {
                    System.out.println(assign(parameterSplit).equalsIgnoreCase(switchCase(methodsSplit[1])));
                } else if (methodsSplitElse[1].equals("==")) {
                    System.out.println(assign(parameterSplit) == (switchCase(methodsSplit[1])));
                }
            } else if (((methodsSplit[1].substring(0, 9)).equals("substring"))) {
                int numb = Integer.parseInt(methodsSplit[1].substring(10, 11));
                System.out.println((assign(parameterSplit).substring(4) == switchCase(methodsSplit[3])) + " - why?");
            }
        }
    }

    private String assign(String[] parameterSplit) {
        if (parameterSplit[0].equals("str1")) {
            if (parameterSplit[2].equals("null")) return str1 = null;
            return str1 = parameterSplit[2];
        } else if (parameterSplit[0].equals("str2")) {
            if (parameterSplit[2].equals("null")) return str2 = null;
            return str2 = parameterSplit[2];
        } else if (parameterSplit[0].equals("str3")) {
            if (parameterSplit[2].equals("null")) return str3 = null;
            return str3 = parameterSplit[2];
        } else {
            if (parameterSplit[2].equals("null")) return str4 = null;
            return str4 = parameterSplit[2];
        }
    }

    private String switchCase(String str) {
        if (str.equals("str1")) return str1;
        if (str.equals("str2")) return str2;
        if (str.equals("str3")) return str3;
        if (str.equals("str4")) return str4;
        if (str.equals("null")) return null;
        return "0";
    }


    public static void main(String[] args) {
        TestProcessor testProcessor = new TestProcessor();
        //Task a
        // System.out.println(testProcessor.addingTextToEnd());
        // System.out.println(testProcessor.insertTextAtASpecificPosition());
        // System.out.println(testProcessor.removeCharacterFromText());
        // System.out.println(testProcessor.replacingASubstringOfTextWishAnotherSubstring());

        //Task b
        //testProcessor.reverseString();

        //Task c
        // testProcessor.reversStringAndDeleteSpace();

        //Task d
        //testProcessor.outputOnlyUppercase();

        //Task e
        //testProcessor.outputEachOfEvenLetterAndUppercaseIt();

        //Task f
        //testProcessor.replaceEmptyStringsInTheArray();

        //Task j
        //testProcessor.equalsObjectByOperator();

    }

}
