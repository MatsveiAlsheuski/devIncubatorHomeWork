package module10Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    private static final String FILE_PATH = "src/main/resources/input.txt";
    private static final String INCORRECT_FILE_PATH = "src/main/resources/input1.txt";

    private static void readFile(String path) throws EmptyFileException {
        File file = new File(path);
        try (FileInputStream fileInputStream = new FileInputStream(file);
             Scanner scanner = new Scanner(fileInputStream)) {
            String fileLine = scanner.nextLine();
            System.out.printf("'%s' read from file '%s'%n", fileLine, path);
        } catch (FileNotFoundException e) {
            throw new EmptyFileException("The file is not Empty", path);
           // System.out.println("FileNotFound exception '" + path + "'");
        } catch (IOException e) {
            throw new EmptyFileException("The file is not Empty", path);
            //System.out.println("I/O exception '" + path + "'");
        } finally {
            System.out.println("finally method for '" + path + "'");
        }
    }

    public static void main(String[] args) throws EmptyFileException {
        readFile(INCORRECT_FILE_PATH);
        readFile(FILE_PATH);
    }

}
