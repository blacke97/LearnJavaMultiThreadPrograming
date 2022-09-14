/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:30
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._4singletonDCL;

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
        // 双检查
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
