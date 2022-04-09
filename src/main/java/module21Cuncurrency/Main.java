package module21Cuncurrency;

public class Main {
    public static void main(String[] args) {
       MySingleton mySingleton;
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                MySingleton mySingleton = MySingleton.instance();
                System.out.println(mySingleton);
            }
        };
        Thread thread2 = new Thread() {
            @Override
            public void run() {
                MySingleton mySingleton = MySingleton.instance();
                System.out.println(mySingleton);
            }
        };
        Thread thread3 = new Thread() {
            @Override
            public void run() {
                MySingleton mySingleton = MySingleton.instance();
                System.out.println(mySingleton);
            }
        };
        thread1.start();
        thread2.start();
        thread3.start();
       /* for (int i = 0; i < 100; i++){
            Thread thread4 = new Thread() {
                @Override
                public void run() {
                    MySingleton mySingleton = MySingleton.instance();
                    System.out.println(mySingleton);
                }
            };
            thread4.start();
        }*/
    }


}
