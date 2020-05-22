package reacher.scanner;

/*
动态初始化（指定长度）
    默认值：
        整数类型：0；
        浮点类型：0.0；
        字符类型：'\u0000';
        布尔类型： false;
        引用类型：null;
静态初始化（指定内容）

动态格式： 数据类型[] 数组名称 = new 数据类型[数组长度]；
静态格式： 数组名称 = new 数据类型[] {元素1, 元素2, ... };
    静态省略格式： 数据类型[] 数据名称 = {元素1, 元素2, ... };

*/

public class ArrayDefine {

    public static void main(String[] args) {
        int[] arrayA = new int[10];

        double[] arrayB = new double[10];

        String[] arrayC = new String[10];

        String[] arrayD = new String[] {"aaa", "bbb", "ccc"};

        int[] arrayE = {1, 2, 3};//不能拆分成两个步骤

        int[] arrayF;
        arrayF = new int[] {1, 2, 3};

        System.out.println(arrayD);//打印为内存地址的Hash值

    }

}
