/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-14 16:28
 **/

package icu.nightking.examples.lockuse.singletonandmultithread._4singletonDCL;

public class MyObject {

    // volatile 增加变量的可见性，并且禁止代码重排序
    private volatile static MyObject myObject;

    private MyObject(){

    }

    public static MyObject getMyObject() throws InterruptedException {

        if(myObject == null) {
            // 模拟耗时行为
            Thread.sleep(3000);
            synchronized (MyObject.class){
                if(myObject == null)
                    myObject = new MyObject();
            }
        }
        return myObject;
    }
}
