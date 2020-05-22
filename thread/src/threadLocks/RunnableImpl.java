package threadLocks;

/*
* 多线程出现安全问题案例
* 实现多窗口卖票
*
* 解决线程安全问题的方案 使用lock锁
* Lock接口 提供了比使用synchronized更广泛的锁定操作 更加灵活
* */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private int ticket = 20;

    //1 在成员位置创建一个ReentrantLock对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        //使用死循环让买票操作重复执行
        while(ticket > 0) {

            //2 在可能出现安全问题的代码前调用lock接口中的方法lock获取锁
            l.lock();

            //判断票是否存在
            if(ticket > 0) {
                System.out.println(Thread.currentThread().getName() + ": 正在卖第" + ticket + "张票！");
                ticket--;

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();//无论程序是否异常都会将锁释放掉
                }
            }

            //3 在后调用unlock释放锁
        }
    }
}
