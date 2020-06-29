package demo02;

/*
* Lambda表达式是可推导可省略的
*   凡是根据上下文推导出来的内容，都可省略
*       可省略的内容：
*           1.（参数列表）：括号中的数据类型可省
*           2.（参数列表）：括号中的参数只有一个，那么参数类型和（）都可省略
*           3.{方法内容} ： 如果{}中只有一行代码，无论是否有返回值，都可省略
* */

public class Demo {

    public static void main(String[] args) {
        //使用匿名内部类的方式
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+ "新的线程创建了！");
            }
        }).start();

        //使用Lambda表达式，实现多线程
        new Thread(
                () -> {
                    System.out.println(Thread.currentThread().getName()+ "新的线程创建了！");
                }
        ).start();

        //Lambda省略情况
        new Thread(
                () -> System.out.println(Thread.currentThread().getName()+ "新的线程创建了！")
        ).start();
    }

}
