package waitAndNotify;

/*
* 等待唤醒案例 线程之间的通讯
* */

public class Demo01 {

    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();

        //创建顾客线程
        new Thread(){
            @Override
            public void run() {
                //保证等待和唤醒的线程只能由一个执行
                synchronized (obj) {
                    System.out.println("顾客寻求商品！");
                    //调用wait方法，线程进入等待状态
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    //唤醒之后执行内容
                    System.out.println("顾客购买商品！");
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
                    obj.notify();
                }
            }
        }.start();
    }

}
