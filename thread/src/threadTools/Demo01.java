package threadTools;

/*
* 主线程名称为main
* 新线程从Thread-0开始
* */

public class Demo01 {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.setName("t1");//设置线程名称的方法
        t1.start();

        MyThread t2 = new MyThread("t2");
        t2.start();

        System.out.println(Thread.currentThread().getName());//获取主线程名称

        for (int i = 0; i < 10; i++) {
            System.out.println(i);

            //使用sleep方法让程序暂停1秒
            try {
                Thread.sleep(1000);//1000毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
