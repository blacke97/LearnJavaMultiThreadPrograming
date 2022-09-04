/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:31
 **/

package icu.nightking.examples.lockuse.waitNotifyUse._1.singleProducerAndConsumer;

import java.util.List;

public class Consumer{
    private Object lock;
    private List<Double> products;
    public Consumer(Object lock, List<Double> products){
        this.lock = lock;
        this.products = products;
    }

    public void consume() {
        try {
            synchronized (lock){
                if(products.size() == 0){
                    lock.wait();
                }
                double d = products.remove(0);
                System.out.println("消费 ： " + d);
                lock.notify();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
