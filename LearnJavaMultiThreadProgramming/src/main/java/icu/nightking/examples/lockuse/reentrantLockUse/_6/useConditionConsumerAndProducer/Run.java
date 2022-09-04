/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 17:13
 **/

package icu.nightking.examples.lockuse.reentrantLockUse._6.useConditionConsumerAndProducer;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();
        PThread p = new PThread(service);
        CThread c = new CThread(service);
        p.start();
        c.start();
    }
}
