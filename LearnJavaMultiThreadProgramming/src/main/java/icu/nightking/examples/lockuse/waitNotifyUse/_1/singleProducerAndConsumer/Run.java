/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:40
 **/

package icu.nightking.examples.lockuse.waitNotifyUse._1.singleProducerAndConsumer;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        // 面向对象思想，将线程类和实例类分开，不要合并到一个类里面，单一职责原则

        // 锁
        Object a = new Object();

        // 生产缓冲区
        List<Double> products = new ArrayList<>();

        // 生产者和消费者
        Consumer consumer = new Consumer(a, products);
        Producer producer = new Producer(a, products);

        // 线程
        PThread p = new PThread(producer);
        CThread c = new CThread(consumer);

        //
        p.start();
        c.start();

    }
}
