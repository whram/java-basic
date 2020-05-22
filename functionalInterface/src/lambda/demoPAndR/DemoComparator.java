package lambda.demoPAndR;

/*
* 如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
* 当需要通过一个方法来获取一个 java.util.Comparator 接口类型的对象作为排序器时,就可以调该方法获取。
* */

import java.util.Arrays;
import java.util.Comparator;

public class DemoComparator {

    public static void main(String[] args) {
        String[] arr = {"aaaaa", "bbb", "cccccccc", "d"};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }

    //定义一个返回值为函数式接口Comparator
    public static Comparator<String> getComparator(){
        //匿名内部类
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                //按照字符串长度的降序排序
                return o2.length() - o1.length();
            }
        };*/

        //返回Lambda表达式
        return (o1,  o2) ->  o2.length() - o1.length();
    }

}
