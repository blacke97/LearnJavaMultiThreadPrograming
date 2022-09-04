/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:18
 **/

package icu.nightking.examples.lockuse.reentrantLockUse._7.useConditionMultiConsumerAndProducerDeadlock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService {
    private Lock lock = new ReentrantLock();

    public Condition condition = lock.newCondition();

    public boolean haseValue;

    public void set(){

        try {

            lock.lock();
            if (haseValue){
                condition.await();
            }
            haseValue = true;
            System.out.println("生产数据");
            //Thread.sleep(1000);
            condition.signal();
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void get(){
        try {

            lock.lock();
            if (!haseValue){
                condition.await();
            }
            haseValue = false;
            System.out.println("消费数据");
            //Thread.sleep(1000);
            condition.signal();

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
