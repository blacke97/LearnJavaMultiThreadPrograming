package icu.nightking.examples.lockuse.reentrantLockUse._4.conditionTestMoreMethod;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("threadA");
        threadA.start();

        ThreadAA threadAA = new ThreadAA(service);
        threadAA.setName("threadAA");
        threadAA.start();

        Thread.sleep(100);

        ThreadB threadB = new ThreadB(service);
        threadB.setName("threadB");
        threadB.start();

        ThreadBB threadBB = new ThreadBB(service);
        threadBB.setName("threadBB");
        threadBB.start();
    }
}
