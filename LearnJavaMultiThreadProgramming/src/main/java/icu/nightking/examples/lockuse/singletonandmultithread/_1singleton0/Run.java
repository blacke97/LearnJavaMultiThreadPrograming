/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:30
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._1singleton0;

public class Run {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
