package module6HeapAndStack;

import java.util.ArrayList;
import java.util.List;

public class Errors {
    public static void main(String[] args) {
        //getSteakOverflowError();
        //getOutOfMemoryError();
        List df = new ArrayList();

        while (true) {
            Long[] lonsg = new Long[1000];
        }
    }

    public static void getSteakOverflowError() {
        getSteakOverflowError();
    }

    public static void getOutOfMemoryError() {
        Long[] longs = new Long[Integer.MAX_VALUE];
    }
}
