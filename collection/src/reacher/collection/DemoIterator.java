package reacher.collection;

/*
* Iterator接口 集合的迭代器（遍历集合元素）
*
* Iterator 需要一个实现类，但是方法比较特殊，使用Collection 中的iterator()方法来获取
* */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoIterator {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();

        list.add("Adam");
        list.add("Reacher");

        Iterator<String> it = list.iterator();//Iterator接口的泛型与集合保持一致
        while (it.hasNext()){
            System.out.println(it.next());
        }

        /*
        增强for循环：用来遍历集合和数组
        底层也是迭代器，使用for循环简化了代码
        */
        for (String s : list) {
            System.out.println(s);
        }
    }

}
