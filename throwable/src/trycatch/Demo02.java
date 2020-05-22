package trycatch;

/*
* 多异常多处理
* */

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class Demo02 {

    public static void main(String[] args) {
        //多异常一次捕获多次处理
        try {
            int[] a = {1,2,3};
            System.out.println(a[3]);
            List<Integer> list = List.of(1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e) {//ArrayIndexOutOfBoundsException是IndexOutOfBoundsException的子类，可以省去
            System.out.println(e);//数组越界异常
        }catch (IndexOutOfBoundsException e) {
            System.out.println(e);//集合越界异常
        }
        // 一个try多个catch 如果catch里的多个异常存在子父类关系，则子类必须写在上边

        //运行异常可以不处理，交给JVM处理

        System.out.println("后续代码");
    }

}
