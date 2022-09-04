package icu.nightking.examples.lockuse.reentrantLockUse._3.useConditionWaitOk;

public class Run {
    public static void main(String[] args) {
        MyService service = new MyService();

        ThreadA threadA = new ThreadA(service);
        threadA.start();

        ThreadA threadB = new ThreadA(service);
        threadB.start();

        ThreadA threadC = new ThreadA(service);
        threadC.start();

        // 出现三个A说明Condition对象的await方法将当前任务的线程转换为wait状态并释放锁
    }
}
