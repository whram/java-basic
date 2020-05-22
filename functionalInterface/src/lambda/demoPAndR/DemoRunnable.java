package lambda.demoPAndR;

/*
* 例如 java.lang.Runnable 接口就是一个函数式接口，
* 假设有一个 startThread 方法使用该接口作为参数，那么就可以使用Lambda进行传参。
* 这种情况其实和 Thread 类的构造方法参数为 Runnable 没有本质区别。
* */

public class DemoRunnable {

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "：启动了");
            }
        });

        startThread(() -> System.out.println(Thread.currentThread().getName() + "：启动了"));
    }

    //方法的参数使用函数式接口Runnable
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }
}
