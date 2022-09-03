package icu.nightking.examples.lockuse.conditionTestMoreMethod;

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
