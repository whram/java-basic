package define;

/*
* 函数式子接口：有且只有一个抽象方法的接口
*       接口中可以包含其他方法（默认，静态，私有）
* */

/*
* 函数式接口的注解
* 作用：检测接口是否是函数式接口
* */
@FunctionalInterface
public interface MyFunctionalInterface {
    //定义一个抽象方法
    public abstract void method();
}
