package Demo01;

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "新的线程创建了！");
    }
}
