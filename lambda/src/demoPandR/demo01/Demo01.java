package demoPandR.demo01;
/*
*Lambda表达式有参数有返回值
* */

import java.util.Arrays;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {
        //创建数组存储多个person对象
        Person[] arr = {
                new Person("Adam",26),
                new Person("Jack",21),
                new Person("Mike",22)
        };

        //使用Array.sort方法根据年龄对数组进行排序
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        for (Person person : arr) {
            System.out.println(person);
        }
        System.out.println("---------------");

        //使用Lambda表达式
        Arrays.sort(arr, (Person o1, Person o2) -> {return o2.getAge() - o1.getAge();});

        //使用Lambda表达式省略情况
        Arrays.sort(arr, (o1, o2) ->  o2.getAge() - o1.getAge());

        for (Person person : arr) {
            System.out.println(person);
        }
    }
}
