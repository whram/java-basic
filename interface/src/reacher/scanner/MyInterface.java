package reacher.scanner;

/*
* 接口可以定义成员变量，但必须使用public static final三个关键字修饰，从效果上看相当于常量
* 定义时必须赋值
* 接口中常量的名称完全用大写和下划线
*
* 抽象方法
* 接口当中的抽象方法必须是两个固定的关键子：public abstract 但是这两个关键字也可省略
* 抽象方法必须全部被重写
*
* 默认方法 java 8 开始
* 接口中的默认方法，可以解决接口升级的问题
* 默认方法重写不重写都可被继承使用
*
* 静态方法 java 8 开始
* 通过接口名直接调用静态方法
* 不能通过接口的实现类的对象来直接调用接口的静态方法
*
* 私有方法 java 9 开始
* 普通私有方法 解决多个默认方法之间重复代码问题
* 静态私有方法 解决多个静态方法之间重复代码问题
* */

public interface MyInterface {

    //效果相当于常量，一旦赋值，不可修改
    public static final int NUM_OF_MY = 10;

    //抽象方法
    public abstract void methodAbs();

    //默认方法
    public default void methodDef() {
        System.out.println("这是接口的一个默认方法！");
        this.methodPrivate();
    }

    public static void methodStatic() {
        System.out.println("这是接口的一个静态方法！");
        methodPriSta();
    }

    private void methodPrivate() {
        System.out.println("私有方法！");
    }

    private static void methodPriSta() {
        System.out.println("私有静态方法！");
    }

}
