package stream.map;

/*
* 如果需要将流中的元素映射到另一个流中，可以使用 map 方法。
* <R> Stream<R> map(Function<? super T, ? extends R> mapper);
* 该接口需要一个 Function 函数式接口参数，可以将当前流中的T类型数据转换为另一种R类型的流。
* Function中的抽象方法：
*       R apply(T t);
* */

import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        //使用map方法，把字符串类型的整数，转换(映射)为Integer类型
        Stream<Integer> integerStream = stream.map(s -> Integer.parseInt(s));

        integerStream.forEach(integer -> System.out.println(integer));
    }
}
