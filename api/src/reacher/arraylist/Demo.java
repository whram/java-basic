package reacher.arraylist;

import java.util.ArrayList;

/*
* ArrayList有<E> 代表泛型
*       泛型： 集合中的所有元素都是统一的数据类型
*              只能是引用类型，不能是基本类型
*
* 直接打印ArrayList集合，得到的是内容而非地址
*
* 基本类型      包装类型
* byte          Byte
* short         Short
* int           Integer
* long          Long
* float         Float
* double        Double
* char          Character
* boolean       Boolean
*/

public class Demo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();//JDK 1.7 开始右侧<>内可省略
        list.add("Adam");//add()方法带有返回值，为boolean型
        list.add("reacher");
        System.out.println(list);

        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(10);
        listInt.add(20);
        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }
    }

}
