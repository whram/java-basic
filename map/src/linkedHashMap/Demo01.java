package linkedHashMap;

/*
* LinkedHashMap<K,V> extends HashMap<K.V>
* */

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo01 {

    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();

        map.put("a", "a");
        map.put("c", "a");
        map.put("b", "a");

        System.out.println(map);
    }

}
