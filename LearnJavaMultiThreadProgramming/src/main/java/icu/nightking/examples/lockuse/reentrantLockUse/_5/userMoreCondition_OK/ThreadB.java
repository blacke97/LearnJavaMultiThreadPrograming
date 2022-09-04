package icu.nightking.examples.lockuse.reentrantLockUse._5.userMoreCondition_OK;

public class ThreadB extends Thread{

    private MyService service;
    public ThreadB(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitB();
    }
}
