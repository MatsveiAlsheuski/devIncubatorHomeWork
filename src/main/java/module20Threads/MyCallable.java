package module20Threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Callable is started");
        System.out.println("Callable is finished");
        return "Callable is startefgfghfghd";
    }
}
