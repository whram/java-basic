package predicate;

/*
* Predicate接口中有一个方法and（），表示“与”用于连接两个判断
* */

import java.util.function.Predicate;

public class DemoAnd {

    public static void main(String[] args) {
        String str = "abcdef";
        boolean b = checkString(str, (s) -> s.length() > 5, (s) ->  s.contains("a"));
        System.out.println(b);
    }

    /*
    * 定义一个方法，传递两个Predicate接口
    * 一个判断字符串长度时候大与5
    * 一个判断字符串时候包含a
    * */
    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
        return pre1.and(pre2).test(s);
    }

}
