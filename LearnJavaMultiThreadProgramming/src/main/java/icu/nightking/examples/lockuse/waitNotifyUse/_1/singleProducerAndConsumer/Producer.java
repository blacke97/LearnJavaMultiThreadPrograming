/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:31
 **/

package icu.nightking.examples.lockuse.waitNotifyUse._1.singleProducerAndConsumer;

import java.util.List;

public class Producer{
    private Object lock;
    private List<Double> products;
    public Producer(Object lock, List<Double> products){
        this.lock = lock;
        this.products = products;
    }

    public void produce() {
        try{
            synchronized (lock){
                if(products.size() > 0){
                    lock.wait();
                }
                double d = Math.random();
                products.add(d);
                System.out.println("生产 ： " + d);
                Thread.sleep(1000);
                lock.notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
