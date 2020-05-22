package consumer;

/*
* java.util.function.Consumer<T> 接口则正好与Supplier接口相反，它不是生产一个数据，而是消费一个数据，其数据类型由泛型决定。
* Consumer 接口中包含抽象方法 void accept(T t) ，意为消费一个指定泛型的数据。
*
* */

import java.util.function.Consumer;

public class Demo01 {

    public static void main(String[] args) {
        method("Adam", name -> {
            //对里边传递的字符串进行消费
            System.out.println(name);

            //字符串进行反转输出
            String reName = new StringBuilder(name).reverse().toString();
            System.out.println(reName);
        });
    }

    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }

}
