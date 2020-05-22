package stream.count;

/*
* 正如旧集合 Collection 当中的 size 方法一样，流提供 count 方法来数一数其中的元素个数：
*       long count();
* 该方法返回一个long值代表元素个数（不再像旧集合那样是int值）。
*
* count()方法是一个终结方法。返回值是一个long类型的值，所以不能再继续调用
* */

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);
    }
}
