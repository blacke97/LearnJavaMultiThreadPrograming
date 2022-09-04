package icu.nightking.examples.lockuse.reentrantLockUse._2.useConditionWaitTest;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {

    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void await(){
        try {
            // 此处需要获得锁才能够进行await，不获得锁直接调用会出现非法监视器错误
            lock.lock();
            System.out.println(" await时间为" + System.currentTimeMillis());
            condition.await();
        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("await 释放锁");
        }
    }

    public void signal(){
        try {
            lock.lock();
            System.out.println("Signal时间为"+System.currentTimeMillis());
            condition.signal();
        }finally {
            lock.unlock();
            System.out.println("signal释放锁");
        }
    }

}
