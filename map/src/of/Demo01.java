package of;

/*
* 在JDK9后List接口 Set接口 Map接口里面新加了一个of()静态方法，可以给一个集合一次性添加多个元素
*   集合中元素的个数已经确定
*   不能适用那三个接口的实现类
*   of()方法的返回值是一个不能改变的集合，不能再使用add() put()方法添加元素
* */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) {
        List<String> l = List.of("a", "b", "c");
        Set<String> s = Set.of("a", "b", "c");
        Map<String, Integer> m = Map.of("a", 1, "b", 2, "c", 3);
    }

}
