package reacher.collection;

/*
* 所有单列集合的最顶层的方法，定义了所有单列集合共性的方法
*
 * `public boolean add(E e)`：  把给定的对象添加到当前集合中 。
 * `public void clear()` :清空集合中所有的元素，集合还在。
 * `public boolean remove(E e)`: 把给定的对象在当前集合中删除。
 * `public boolean contains(E e)`: 判断当前集合中是否包含给定的对象。
 * `public boolean isEmpty()`: 判断当前集合是否为空。
 * `public int size()`: 返回集合中元素的个数。
 * `public Object[] toArray()`: 把集合中的元素，存储到数组中。
 *
* */

import java.util.ArrayList;
import java.util.Collection;

public class Demo01 {

    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();//new任何collection的子类，都可适用上面的方法

        list.add("Adam");
        list.add("reacher");

        System.out.println(list);

        Object[] arr = list.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
