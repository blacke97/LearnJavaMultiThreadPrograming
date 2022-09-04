package icu.nightking.examples.lockuse.reentrantLockUse._4.conditionTestMoreMethod;

public class ThreadAA extends Thread{
    private MyService myService;
    public ThreadAA(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.MethodA();
    }
}
