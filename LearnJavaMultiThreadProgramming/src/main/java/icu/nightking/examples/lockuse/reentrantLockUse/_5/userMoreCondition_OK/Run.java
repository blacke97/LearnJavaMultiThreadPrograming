package icu.nightking.examples.lockuse.reentrantLockUse._5.userMoreCondition_OK;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        MyService service  = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.setName("A");
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.setName("B");
        threadB.start();
        Thread.sleep(3000);

        service.singallAll_A();

    }
}
