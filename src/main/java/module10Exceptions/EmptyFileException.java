package module10Exceptions;

import java.io.FileNotFoundException;

public class EmptyFileException extends Exception {
    public EmptyFileException(String message, String filePath) {
        super(message);
        System.out.println(filePath);
    }

    public EmptyFileException(String message, Throwable cause, String filePath) {
      //  super(message, cause);
        System.out.println(filePath);
    }
}
