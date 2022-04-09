package module20Threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("MyRunnable is started");
        System.out.println("MyRunnable is finished");
    }
}
