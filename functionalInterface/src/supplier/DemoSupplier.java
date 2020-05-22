package supplier;

/*
* 常用的函数式接口
* java.util.function.Supplier<T> 接口仅包含一个无参的方法： T get() 。用来获取一个泛型参数指定类型的对象数据。
*
* Supplier<T>生产型接口，指定接口的泛型是什么，接口中的get()方法就会产生什么类型的数据
* */

import java.util.function.Supplier;

public class DemoSupplier {

    public static void main(String[] args) {
        String s = getString(() -> {
            //生产一个字符串并返回
            return "你好";
        });
        System.out.println(s);
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
