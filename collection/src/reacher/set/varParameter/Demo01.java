package reacher.set.varParameter;

/*
* 可变参数
*   参数类型确定，但是参数个数不确定
* 一个方法只能有一个可变参数
* 方法中有多个参数时，可变参数放在参数列表的末尾
* */

public class Demo01 {

    public static void main(String[] args) {
        int s = sum(1,2,3);
        System.out.println(s);
    }

    public static int sum(int...arr){
        int s = 0;
        for (int i : arr) {
            s += i;
        }
        return s;
    }

}
