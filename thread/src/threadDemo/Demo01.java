package threadDemo;

/*
* 主线程 执行主方法的线程
*
* 单线程程序：执行从main方法开始，从上到下依次执行
* */

public class Demo01 {

    public static void main(String[] args) {
        Person p1 = new Person("Adam");
        Person p2 = new Person("Reacher");

        p1.method();
        p2.method();
    }

}
