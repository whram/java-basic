package consumer;

/*
* Consumer接口中的默认方法AndThen方法
* 作用：需要两个Consumer接口，可以把两个接口组合到一起，再对数据进行消费
* */

import java.util.function.Consumer;

public class DemoAndThen {

    public static void main(String[] args) {
        method("Hello",
                (c) -> {
                    System.out.println(c.toLowerCase());
                },
                (c) -> {
                    System.out.println(c.toUpperCase());
                });
    }

    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
        //谁写前，先消费谁
        con1.andThen(con2).accept(s);
    }
}
