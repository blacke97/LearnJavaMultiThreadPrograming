/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:52
 **/

package icu.nightking.examples.lockuse.waitNotifyUse._1.singleProducerAndConsumer;

public class CThread extends Thread{
    private Consumer consumer;

    public CThread(Consumer consumer){
        this.consumer = consumer;
    }

    @Override
    public void run() {
        while (true){
            consumer.consume();
        }
    }
}
