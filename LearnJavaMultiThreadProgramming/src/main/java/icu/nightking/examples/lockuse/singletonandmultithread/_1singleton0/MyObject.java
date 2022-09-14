/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:28
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._1singleton0;

public class MyObject {

    // 饿汉模式，立即加载到内存
    private static MyObject myObject = new MyObject();

    private MyObject(){

    }

    public static MyObject getMyObject() {
        return myObject;
    }
}
