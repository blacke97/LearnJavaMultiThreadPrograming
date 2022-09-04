package icu.nightking.examples.lockuse.reentrantLockUse._4.conditionTestMoreMethod;

public class ThreadA extends Thread{
    private MyService myService;
    public ThreadA(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.MethodA();
    }
}
