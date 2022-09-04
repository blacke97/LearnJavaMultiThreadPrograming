package icu.nightking.examples.lockuse.reentrantLockUse._5.userMoreCondition_OK;

public class ThreadA  extends Thread{

    private MyService service;
    public ThreadA(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        service.awaitA();
    }
}
