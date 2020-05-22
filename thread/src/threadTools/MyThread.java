package threadTools;

/*
* public String getName() :获取当前线程名称。
* public void start() :导致此线程开始执行; Java虚拟机调用此线程的run方法。
* public void run() :此线程要执行的任务在此处定义代码。
* public static void sleep(long millis) :使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）。
* public static Thread currentThread() :返回对当前正在执行的线程对象的引用。
* */

public class MyThread extends Thread {

    //带参构造方法，命名线程
    public MyThread(String name) {
        super(name);
    }

    public MyThread() {
    }

    @Override
    public void run() {
        //获取线程名称
        //System.out.println(getName());

        //Thread t = Thread.currentThread();
        //System.out.println(t);
        //System.out.println(t.getName());

        System.out.println(Thread.currentThread().getName());
    }
}
