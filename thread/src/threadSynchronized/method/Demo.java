package threadSynchronized.method;

/*
* 多线程出现安全问题案例
* 模拟买票
* 创建三个窗口，同时开启
* */

public class Demo {

    public static void main(String[] args) {
        RunnableImpl run = new RunnableImpl();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //三个线程同时调用统一共享数据，出现冲突，从而发生同时卖掉同一张票的错误
        t0.start();
        t1.start();
        t2.start();
    }

}
