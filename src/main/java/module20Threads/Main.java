package module20Threads;

import module1Basic.MyClass;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread();
        myThread.setDaemon(true);
        myThread.start();

        Runnable myRunnable = new MyRunnable();
        Thread myRunnableThread = new Thread(myRunnable);
        myRunnableThread.start();

        Runnable anonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("AnonymousRunnable is started");
                System.out.println("AnonymousRunnable is finished");
            }
        };
        Thread anonymousRunnableThread2 = new Thread(anonymousRunnable);
        anonymousRunnableThread2.start();

        MyCallable myCallable = new MyCallable();
        //myCallable.call();
        System.out.println("Main is finished");

        ExecutorService dfg = Executors.newFixedThreadPool(5);
        Future<String> dfgf = dfg.submit(myCallable);
        System.out.println(dfgf.get());
        dfg.shutdown();
    }
}
