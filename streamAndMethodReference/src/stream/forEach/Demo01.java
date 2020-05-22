package stream.forEach;

/*
* Stream流中的常用方法 forEach
* 作用：
*       遍历流中的数据
*       是一个终结方法，调用后就不能继续调用stream中的其他方法
*
* void forEach(Consumer<? super T> action);
* 该方法接收一个 Consumer 接口函数，会将每一个流元素交给该函数进行处理。
* java.util.function.Consumer<T>接口是一个消费型接口。
*       Consumer接口中包含抽象方法void accept(T t)，意为消费一个指定泛型的数据。
* */

import java.util.stream.Stream;

public class Demo01 {

    public static void main(String[] args) {
        //获取一个Stream
        Stream<String> stream = Stream.of("Adam", "Reacher", "Jack", "Mike");
        //遍历
        stream.forEach(s -> System.out.println(s));
    }

}
