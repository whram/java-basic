package demoMap;

/*
* Map集合的遍历
*
* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DemoTraverse {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("key06", 60);
        map.put("key02", 20);
        map.put("key01", 10);

        traverse2(map);
    }

    //使用keySet()方法遍历集合
    public static void traverse1(Map<String, Integer> map) {
        //用keySet()方法获取key集合
        Set<String> set = map.keySet();

        for (String s : set) {
            System.out.println(map.get(s));
        }
    }

    //使用EntrySet()方法遍历集合
    public static void traverse2(Map<String, Integer> map) {
        //使用entrySet()方法获取map中的所有entry对象
        Set<Map.Entry<String, Integer>> set = map.entrySet();

        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> en = it.next();
            System.out.println(en.getKey() + ":" + en.getValue());
        }

        for (Map.Entry<String, Integer> en : set) {
            System.out.println(en.getKey() + ":" + en.getValue());
        }
    }

}
