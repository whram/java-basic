package threadPool;

/*
* 线程池 JDK 1.5 之后提供的 java.util.concurrent.Executor 线程池的工厂类，用来生产线程池
*       线程池是一个队列
* */

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {

    public static void main(String[] args) {
        //使用线程池工厂类Executors里提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService es = Executors.newFixedThreadPool(2);
        //调用ExecutorService中的submit方法，传递线程任务（实现类），开启线程，执行run方法
        es.submit(new RunnableImpl());
        //线程池会一直开启，使用完线程，会自动把线程归还线程池，线程可以继续使用
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());

        //调用ExecutorService中的方法shutdown销毁线程池（不建议执行）
        es.shutdown();
    }

}
