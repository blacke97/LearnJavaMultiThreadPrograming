package icu.nightking.examples.lockuse.reentrantLockUse._1.useReentrantLockImplementSync;

public class MyThread extends Thread{

    private MyService service;

    public MyThread(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.testMethod();
    }
}
