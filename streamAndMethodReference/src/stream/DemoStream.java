package stream;

/*
* 使用Stream流的方式，遍历集合并对数据进行筛选
* Stream流是JDK1.8之后出现的，关注的是做什么而不是怎么做
* */

import java.util.ArrayList;
import java.util.List;

public class DemoStream {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list元素进行过滤，只要姓张的
        //对listA元素过滤，只要名字长度为三的
        //使用Stream和Lambda表达式
        list.stream().filter(name -> name.startsWith("张"))
                     .filter(name -> name.length() == 3)
                     .forEach(name -> System.out.println(name));

    }

}
