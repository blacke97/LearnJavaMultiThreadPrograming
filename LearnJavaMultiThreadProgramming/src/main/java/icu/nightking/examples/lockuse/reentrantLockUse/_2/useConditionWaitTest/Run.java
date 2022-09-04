package icu.nightking.examples.lockuse.reentrantLockUse._2.useConditionWaitTest;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.start();

        Thread.sleep(3000);

        service.signal();

    }
}
