package stream.concat;

/*
* 如果有两个流，希望合并成为一个流，那么可以使用 Stream 接口的静态方法 concat ：
* static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
* 备注：这是一个静态方法，与 java.lang.String 当中的 concat 方法是不同的。
* */

import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        Stream<String> streamA = Stream.of("张无忌");
        Stream<String> streamB = Stream.of("张翠山");
        Stream<String> result = Stream.concat(streamA, streamB);

        result.forEach(s -> System.out.println(s));
    }
}
