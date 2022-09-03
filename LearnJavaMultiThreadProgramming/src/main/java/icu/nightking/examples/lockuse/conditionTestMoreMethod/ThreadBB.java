package icu.nightking.examples.lockuse.conditionTestMoreMethod;

public class ThreadBB extends Thread{
    private MyService myService;
    public ThreadBB(MyService service){
        this.myService = service;
    }

    @Override
    public void run() {
        myService.MethodB();
    }
}
