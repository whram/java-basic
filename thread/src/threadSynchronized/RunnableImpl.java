package threadSynchronized;

/*
* 实现多窗口卖票
*
* 解决多线程安全问题的一种方案 使用同步代码块
*                               把同步代码块锁住，只让一个线程在同步代码块中执行
*
* */

public class RunnableImpl implements Runnable {
    private int ticket = 20;

    //创建一个锁对象,也叫对象监视器
    final Object obj = new Object();

    @Override
    public void run() {
        while(ticket > 0) {
            //同步代码块
            synchronized (obj) {//obj对象保证了只有一个线程执行同步代码块
                //判断票是否存在
                if(ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 正在卖第" + ticket + "张票！");
                    ticket--;
                }

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
