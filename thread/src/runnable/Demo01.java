package runnable;

/*
* 创建多线程的第二种方式，实现Runnable接口
*
* 实现Runnable接口的好处
*       避免了单继承的局限性
*           一个类只能继承一个类，类继承了Thread类，就不能继承其他的类
*           实现了Runnable接口还能继承其他的类
*       增强了程序的扩展性，降低了程序的耦合性
*           把设置线程任务和开启线程进行了分离
*           重写run方法，来设置新的线程任务
* */

public class Demo01 {

    public static void main(String[] args) {
        //创建一个Runnable接口的实现类
        RunnableImpl run = new RunnableImpl();
        //创建Tread类对象，构造方法中传递Runnable接口的实现对象
        Thread t1 = new Thread(run);
        //开启多线程
        t1.start();

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
        t1 = new Thread(new RunnableImpl2());//可以调用不同的线程任务
        t1.start();
    }

}
