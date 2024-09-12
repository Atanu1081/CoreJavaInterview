package multithreading;

public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("My thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        Object o;
        System.out.println(myThread.getState());
        myThread.start();
        System.out.println(myThread.getState());
        Thread.sleep(100);
        System.out.println(myThread.getState());
        myThread.join();
        System.out.println(myThread.getState());
    }
}
