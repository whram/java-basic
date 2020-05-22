package reacher.set.linkedHashSet;

/*
* LinkedHashSet
*   底层是个哈希表（数组+链表/红黑树）+链表，哈希表外的链表是记录元素的存储顺序，保证集合有序
* */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Demo01 {

    public static void main(String[] args) {
        //hashset结构
        HashSet<String> set = new HashSet<>();

        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        System.out.println(set);

        //Linkedhashset结构
        LinkedHashSet<String> set1 = new LinkedHashSet<>();

        set1.add("aaa");
        set1.add("bbb");
        set1.add("ccc");

        System.out.println(set1);
    }

}
