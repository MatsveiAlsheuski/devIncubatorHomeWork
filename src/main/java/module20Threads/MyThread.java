package module20Threads;

public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("MyThread is started");
        System.out.println("MyThread is finished");
    }
}
