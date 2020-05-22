package Demo01;

/*
* Lambda表达式使用前提
*       接口中有且只有一个抽象方法
*       方法参数或者局部变量类型必须是Lambda对应的接口类型
*
* Lambda表达式的标准格式
*   由三部分组成
*       1.一些参数
*       2.一个箭头
*       3.一段代码
*   格式
*       （参数）-> {一些重写的方法}
*   解释
*       ()：接口中抽象方法的参数列表
*       ->：把参数传递给方法体{}
*       {}：重写接口的方法体
* */

public class DemoLambda {

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
                () -> { System.out.println(Thread.currentThread().getName()+ "新的线程创建了！"); }
        ).start();
    }

}
