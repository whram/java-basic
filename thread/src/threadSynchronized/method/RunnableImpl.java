package threadSynchronized.method;

/*
* 多线程出现安全问题案例
* 实现多窗口卖票
*
* 解决线程安全问题的方案 使用同步方法
*       将访问共享数据的代码放到一个方法中 并使用synchronized修饰符
* */

public class RunnableImpl implements Runnable {
    private static int ticket = 20;

    @Override
    public void run() {
        //使用死循环让买票操作重复执行
        while(ticket > 0) {
            //判断票是否存在
            sellTicketStatic();
        }
    }

    //定义一个同步方法 同步也会将方法内不所住 它的锁对象就是this
    public synchronized void sellTicket() {
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

    /*
    静态的同步方法 锁对象就不是this了
                  this是创建对象后产生的，静态方法优先于对象产生
         静态同步方法的锁对象是本类的class属性：class文件对象（反射相关内容）
                                             RunnableImpl.class
    */
    public static synchronized void sellTicketStatic() {
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
