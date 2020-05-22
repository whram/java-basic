package stream;

/*
* 传统方法遍历集合，对集合进行过滤
* */

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        //对list元素进行过滤，只要姓张的
        List<String> listA = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张")) {
                listA.add(s);
            }
        }

        //对listA元素过滤，只要名字长度为三的
        List<String> listB = new ArrayList<>();
        for (String s : listA) {
            if(s.length() == 3) {
                listB.add(s);
            }
        }

        for (String s : listB) {
            System.out.println(s);
        }
    }
}
