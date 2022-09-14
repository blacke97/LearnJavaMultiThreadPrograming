/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:30
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._3singleton1Disadvantage;

// 懒汉模式，缺点

/**
 * 结果1：
 * 428201853
 * 1187311731
 * 753951408
 * 结果2：
 * 753951408
 * 753951408
 * 753951408
 */
public class Run {
    public static void main(String[] args) {
        // 多线程同时进入get方法，创建了三个对象
        MyThread t1 = new MyThread(); // 进去后被阻塞3s，此时后面的线程还是看到null，所以都进去阻塞并创建新的线程
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
