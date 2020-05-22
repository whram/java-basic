package reacher.polymorphism;

/*
* 多态性
* 父类引用指向子类对象
*
* 格式：
* 父类名称 对象名 = new 子类名称（）;
* 接口名称 对象名 = new 实现类名称（）;
*
* 成员变量，new对象的时候看左边，没有则向上找（不会向下找）
*           编译看左边，运行看左边
*
* 成员方法，new对象的时候看左边，没有则向上找（不会向下找）
*           编译看左边，运行看右边
* */

public class Demo01 {

    public static void main(String[] args) {
        Father p = new Child();//向上转型为父类
        Child p1 = new Child();

        p.method();//子类方法！ 重写方法
        p.methodFather();//父类特有方法！
        System.out.println(p.num);//父类变量 10

        p.methodFather();//父类特有方法！
        //p.methodChild();//错误写法

        System.out.println("-----------");

        //判断父类引用的是不是Child
        if(p instanceof Child) {
            Child child = (Child)p; //向下还原为子类
            child.methodChild();//向下还愿后可调用子类方法
        }

        method(p);

        System.out.println(p1.num);
    }

    public static void method(Father p) {
        if(p instanceof Child) {
            Child child = (Child)p; //向下还原为子类
            child.methodChild();//向下还愿后可调用子类方法
        }
    }

}
