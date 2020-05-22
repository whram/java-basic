package reacher.extend.constructor;

/*
* 子类构造方法当中有个默认的“super（）”调用
* 子类构造方法必然调用父类构造方法，不写super（），则会默认一个，写了则用指定的super（）调用，且必须为第一个语句
* super和this两种构造调用不能同时使用，因为两者都只能是第一且唯一的
* */

public class Demo01 {

    public static void main(String[] args) {
        Child c = new Child();
    }

}
