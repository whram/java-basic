package reacher.extend.abstractdemo;

/*
* 抽象类不能直接使用，必须有一个子类继承
* 子类必须重写父类的所有抽象方法
* */

public class Demo01 {

    public static void main(String[] args) {
        BlackCat bc = new BlackCat();
        bc.eat();
        bc.color();
    }

}
