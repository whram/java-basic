package supplier;

/*
* 求数组元素最大值
* 使用 Supplier 接口作为方法参数类型，通过Lambda表达式求出int数组中的最大值。
* 提示：接口的泛型请使用java.lang.Integer 类。
* */

import java.util.function.Supplier;

public class DemoTest {

    public static void main(String[] args) {
        int[] arr = {100,-224,55,323,11};
        int m = getMax(() -> {
            //获取数组的最大值并返回
            int max = arr[0];
            for (int i : arr) {
                if (max < i) {
                    max = i;
                }
            }
            return max;
        });

        System.out.println(m);
    }

    //定义一个方法用于获取int类型数组中元素的最大值，参数传递Supplier接口，泛型Integer
    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
