/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:29
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._1singleton0;

public class MyThread extends Thread{
    @Override
    public void run() {

        System.out.println(MyObject.getMyObject().hashCode());

    }
}
