package stream.limitandskip;

/*
* limit 方法可以对流进行截取，只取用前n个。
* Stream<T> limit(long maxSize);
* 参数是一个long型，如果集合当前长度大于参数则进行截取；否则不进行操作。
*
* 如果希望跳过前几个元素，可以使用 skip 方法获取一个截取之后的新流：
* Stream<T> skip(long n);
* 如果流的当前长度大于n，则跳过前n个；否则将会得到一个长度为0的空流。
*
* limit、skip方法是一个延迟方法，可以继续调用stream流中的其他方法
* */

import java.util.stream.Stream;

public class Demo01 {

    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e"};
        Stream<String> stream1 = Stream.of(arr);
        //截取前三个元素
        Stream<String> stream2 = stream1.limit(3);
        //跳过前两个元素
        Stream<String> stream3 = stream2.skip(2);
        stream3.forEach(s -> System.out.println(s));
    }

}
