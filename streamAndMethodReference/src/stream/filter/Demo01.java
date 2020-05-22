package stream.filter;

/*
* 可以通过 filter 方法将一个流转换成另一个子集流。
* Stream<T> filter(Predicate<? super T> predicate);
* 该接口接收一个 Predicate 函数式接口参数（可以是一个Lambda或方法引用）作为筛选条件。
*
* Stream属于管道流，只能被消费一次
* 第一个Stream调用完毕方法，数据就会转到下一个Stream上，这时第一个Stream会关闭，不能再调用
* */

import java.util.stream.Stream;

public class Demo01 {

    public static void main(String[] args) {
        //创建一个Steam
        Stream<String> stream1 = Stream.of("张无忌", "张三丰", "周芷若");
        //过滤只要姓张的
        Stream<String> stream2 = stream1.filter(name -> name.startsWith("张"));
        //遍历过滤后的流
        stream2.forEach(s -> System.out.println(s));

        //此时stream1和stream2已经关闭，再调用将会报错
        stream1.forEach(s -> System.out.println(s));
    }
}
