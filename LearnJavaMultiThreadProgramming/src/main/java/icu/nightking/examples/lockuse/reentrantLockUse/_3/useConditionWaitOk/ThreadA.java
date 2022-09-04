package icu.nightking.examples.lockuse.reentrantLockUse._3.useConditionWaitOk;

public class ThreadA extends Thread{
    private MyService service;

    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {

        service.await();

    }
}
