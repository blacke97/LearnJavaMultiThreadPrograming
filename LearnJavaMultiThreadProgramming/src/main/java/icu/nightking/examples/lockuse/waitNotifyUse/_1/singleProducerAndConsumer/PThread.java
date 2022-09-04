/**
 * @program: LearnJavaMultiThreadProgramming
 * @description:
 * @author: wm
 * @create: 2022-09-04 16:52
 **/

package icu.nightking.examples.lockuse.waitNotifyUse._1.singleProducerAndConsumer;

public class PThread extends Thread{
    private Producer producer;

    public PThread(Producer producer){
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true){
            producer.produce();
        }
    }
}
