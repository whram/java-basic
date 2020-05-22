package predicate;

/*
* java.util.function.Predicate<T> 接口
* 对某种类型的数据进行判断，从而得到一个boolean值结果。
*
* Predicate 接口中包含一个抽象方法：
*               boolean test(T t) 用来对指定的数据类型进行某种判断的方法
 * */

import java.util.function.Predicate;

public class Demo01 {

    public static void main(String[] args) {
        String s = "Hello world";
        boolean b = method(s, (str) -> str.length() > 5);
        System.out.println(b);
    }

    public static boolean method(String s, Predicate<String> pre) {
        return pre.test(s);
    }

}
