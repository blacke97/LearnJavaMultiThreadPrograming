package icu.nightking.examples.lockuse.reentrantLockUse._3.useConditionWaitOk;

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
            System.out.println("A");
            condition.await();
            System.out.println("B");
        }catch (InterruptedException e){
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("释放锁");
        }
    }

}
