package innerClassThread;

/*
* 匿名内部类
*   简化代码 把继承父类，重写父类方法，创建子类对象合成一步
*           把实现接口，重写接口方法，创建实现类对象合成一步
*
* 内部类最终产物 没有名字的子类/实现对象
* */

public class Demo01 {

    public static void main(String[] args) {
        //线程的父类是Thread     new MyThread().start()
        new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": 内部类线程");
            }
        }.start();

        //线程的接口Runnable      RunnableImpl r = RunnableImpl();
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + ": 内部接口线程");
            }
        }).start();
    }
}

