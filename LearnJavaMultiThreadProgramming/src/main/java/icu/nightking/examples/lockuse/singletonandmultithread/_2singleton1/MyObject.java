/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:28
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._2singleton1;

public class MyObject {

    // 懒汉模式，在get时才会添加到内存
    private static MyObject myObject;

    private MyObject(){

    }

    public static MyObject getMyObject() {

        if(myObject == null) myObject = new MyObject();

        return myObject;
    }
}
