package waitAndNotify;

/*
* TimeWaiting()计时等待
*       使用sleep(long m)方法 结束后 线程进入runnable/blocked（运行/阻塞）状态
*       使用wait(long m)方法 m时间内没被唤醒则自动醒来 线程进入runnable/blocked（运行/阻塞）状态
*
* 唤醒方法
*       void notify（）唤醒监视器对象上等待的单个线程
*       void notifyAll() 唤醒监视器对象上等待的所有线程
* */

public class Demo02 {

    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();

        //创建顾客1线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行
                synchronized (obj) {
                    System.out.println("顾客1寻求商品！");
                    //调用wait方法，线程进入等待状态
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //唤醒之后执行内容
                    System.out.println("顾客1购买商品！");
                }
            }
        }.start();

        //顾客2
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行
                synchronized (obj) {
                    System.out.println("顾客2寻求商品！");
                    //调用wait方法，线程进入等待状态
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //唤醒之后执行内容
                    System.out.println("顾客2购买商品！");
                }
            }
        }.start();

        //创建商家线程
        new Thread() {
            @Override
            public void run() {
                //5秒制作商品
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                //保证等待和唤醒的线程只能由一个执行
                synchronized (obj) {
                    System.out.println("商家5秒后准备好商品，并告知顾客！");
                    //调用notify方法唤醒顾客线程
                    //obj.notify();//随机唤醒一个
                    obj.notifyAll();//唤醒所有等待线程
                }
            }
        }.start();
    }

}
