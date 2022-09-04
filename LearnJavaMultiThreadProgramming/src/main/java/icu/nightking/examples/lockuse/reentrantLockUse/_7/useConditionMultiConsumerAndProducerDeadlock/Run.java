/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 17:13
 **/

package icu.nightking.examples.lockuse.reentrantLockUse._7.useConditionMultiConsumerAndProducerDeadlock;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        PThread p1 = new PThread(service);
        PThread p2 = new PThread(service);
        PThread p3 = new PThread(service);
        CThread c1 = new CThread(service);
        CThread c2 = new CThread(service);
        CThread c3 = new CThread(service);
        p1.start();
        c1.start();
        p2.start();
        c2.start();
        p3.start();
        c3.start();
    }
}
