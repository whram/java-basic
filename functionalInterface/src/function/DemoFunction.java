package function;

/*
* java.util.function.Function<T,R> 接口用来根据一个类型的数据得到另一个类型的数据，前者称为前置条件，后者称为后置条件。
*
* Function 接口中最主要的抽象方法为：
* R apply(T t) ，根据类型T的参数获取类型R的结果。
* 使用的场景例如：将 String 类型转换为 Integer 类型。
* */

import java.util.function.Function;

public class DemoFunction {

    public static void main(String[] args) {
        String str = "1234";
        change(str, s -> Integer.parseInt(s));
    }

    public static void change(String s, Function<String, Integer> fun) {
        Integer in = fun.apply(s);
        System.out.println(in);
    }
}
