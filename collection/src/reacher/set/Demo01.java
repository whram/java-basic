package reacher.set;

/*
* Set接口
* 不允许重复元素
* 没有索引方法，不能使用普通for循环遍历
*
* HashSet接口
* 无序集合，底层是个hash表
* */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(9);
        set.add(2);
        set.add(5);
        set.add(3);
        set.add(2);

        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        for (Integer s : set){
            System.out.println(s);
        }
    }

}
