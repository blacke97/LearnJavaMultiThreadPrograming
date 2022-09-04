package icu.nightking.examples.lockuse.reentrantLockUse._1.useReentrantLockImplementSync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();
    int j = 0;
    public void testMethod(){
        lock.lock();
        for (int i = 0; i < 5; i++){
            System.out.println("ThreadName = " + Thread.currentThread().getName() + " " + (j++));
        }
        lock.unlock();
    }
}
