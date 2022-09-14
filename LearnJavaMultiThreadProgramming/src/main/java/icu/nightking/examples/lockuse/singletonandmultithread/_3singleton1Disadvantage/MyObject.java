/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:28
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._3singleton1Disadvantage;

public class MyObject {

    // 懒汉模式，缺点
    private static MyObject myObject;

    private MyObject(){

    }

    public static MyObject getMyObject() throws InterruptedException {

        if(myObject == null) {
            // 模拟耗时行为
            Thread.sleep(3000);
            myObject = new MyObject();
        }

        return myObject;
    }
}
