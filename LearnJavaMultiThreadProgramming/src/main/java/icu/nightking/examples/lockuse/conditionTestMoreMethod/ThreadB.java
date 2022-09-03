package icu.nightking.examples.lockuse.conditionTestMoreMethod;

public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.MethodB();
    }
}
