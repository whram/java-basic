package threadSafe;

/*
* 多线程出现安全问题案例
* 实现多窗口卖票
* */

public class RunnableImpl implements Runnable {
    private int ticket = 20;

    @Override
    public void run() {
        //使用死循环让买票操作重复执行
        while(true) {
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
