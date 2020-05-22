package reacher.list;

/*
* List
* 有序集合，顺序存储
* 有索引
* 允许重复元素
*
* public void add(int index, E element) : 将指定的元素，添加到该集合中的指定位置上。
* public E get(int index) :返回集合中指定位置的元素。
* public E remove(int index) : 移除列表中指定位置的元素, 返回的是被移除的元素。
* public E set(int index, E element) :用指定元素替换集合中指定位置的元素,返回值的更新前的元素。
* */

import java.util.ArrayList;
import java.util.List;

public class Demo01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");

        list.add(1, "c");

        System.out.println(list);

    }

}
