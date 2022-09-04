/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 17:12
 **/

package icu.nightking.examples.lockuse.reentrantLockUse._6.useConditionConsumerAndProducer;

public class PThread extends Thread{
    private MyService service;
    public PThread(MyService service){
        this.service = service;
    }

    @Override
    public void run() {
        while (true) {
            service.set();
        }
    }
}
