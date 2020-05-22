package demoMap;

/*
* Map集合
*   一个元素包含两个值<key，value>；
*   key不允许重复，value可以重复；
*   key和value是一一对应的；
*   public V put(K key, V value) : 把指定的键与指定的值添加到Map集合中。
*   public V remove(Object key) : 把指定的键 所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
*   public V get(Object key) 根据指定的键，在Map集合中获取对应的值。
*   boolean containsKey(Object K) 判断集合是否包含指定的键。
*   public Set<K> keySet() : 获取Map集合中所有的键，存储到Set集合中。
*   public Set<Map.Entry<K,V>> entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
*
* HashMap集合 implement Map接口
*   底层是哈希表 jdk1.8之前是数组+单向链表
*               jdk1.8之后是数组+单向链表/红黑树（链表长度超过8）
*   HashMap集合是无序集合，存取顺序不一致
*
* LinkedHashMap集合 extend HashMap集合
*   底层是哈希表+链表（存储顺序）
*   存取有序
* */

import java.util.HashMap;
import java.util.Map;

public class Demo01 {

    public static void main(String[] args) {
        method();
    }

    public static void method() {
        //创建map集合对象 多态
        Map<String, String> map = new HashMap<>();

        String m1 = map.put("key01", "A");//put()方法返回的是value
        System.out.println(m1);

        String m2 = map.put("key01", "B");
        System.out.println(m2);

        map.put("key02", "B");
        map.put("key03", "C");

        System.out.println(map.containsKey("key08"));
    }

}
