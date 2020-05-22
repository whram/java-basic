package customMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        map.put(new Person("Adam", 20), "k1");
        map.put(new Person("Adam", 21), "k2");
        map.put(new Person("Adam", 20), "k3");
        map.put(new Person("Reacher", 21), "k1");
        //Person作为key，必须保证唯一，因此需要重写Peron类中的hashCode()和equals()方法

        Set<Map.Entry<Person, String>> set = map.entrySet();

        for (Map.Entry<Person, String> en : set) {
            System.out.println(en.getKey() + "=" + en.getValue());
        }
    }

}
