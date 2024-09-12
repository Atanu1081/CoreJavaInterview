package multithreading;

public class Driver {
    public static void main(String[] args) throws InterruptedException {



        MyThread myThread = new MyThread();
        System.out.println(myThread.getState());
        myThread.start();
        Thread.sleep(1000);
        System.out.println(myThread.getState());

        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
