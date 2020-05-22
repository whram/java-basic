package multiThread;

/*
* 创建多线程程序的第一种方式 创建thread类的子类
* Thread类
*   创建Thread类的子类并重写run()方法
*   void start()使线程启动，JVM调用该线程的run()方法
* java程序属于抢占式调动，优先级高的先执行，同一优先级随机执行
* */

public class Demo01 {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("main: " + i);
        }
    }

}
