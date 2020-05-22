package Demo01;

/*
 * Lambda表达式
 *   面向对象思想：做一件事，找一个能解决这个事的对象
 *   函数式编程思想：只要能获取结果，谁去做怎么做不重要，重视结果，不重视过程
 *
 * 使用实现Runnable接口的方式实现多线程
 * */

import java.util.concurrent.ThreadLocalRandom;

public class DemoRunnable {

    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        RunnableImpl run = new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口实现类
        Thread t = new Thread(run);
        //调用Start方法开启新线程，执行run方法
        t.start();

        //简化代码 使用匿名内部类，实现多线程方法，不需要实现Runnable接口
        Runnable r = new Runnable(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ "新的线程创建了！");
            }
        };
        new Thread(r).start();

        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ "新的线程创建了！");
            }
        }).start();
    }

}
