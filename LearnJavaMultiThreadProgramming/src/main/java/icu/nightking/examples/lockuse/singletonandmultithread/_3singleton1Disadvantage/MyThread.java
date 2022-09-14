/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:29
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._3singleton1Disadvantage;

public class MyThread extends Thread{
    @Override
    public void run() {

        try {
            System.out.println("thread start at" + System.currentTimeMillis());
            System.out.println(MyObject.getMyObject().hashCode());
            System.out.println("thread   end at" + System.currentTimeMillis());

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
