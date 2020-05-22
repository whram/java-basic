package sampleCountChar;

/*
* 计算一个字符串中每个字符出现的个数
* */

import java.util.HashMap;
import java.util.Scanner;

public class Demo01 {

    public static void main(String[] args) {
        //获取输入的字符串
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] chars = str.toCharArray();//将字符串转存为字符数组

        //创建HashMap存储统计结果
        HashMap<Character, Integer> map = new HashMap<>();

        //遍历字符数组
        for (char c : chars) {
            //获取字符的统计结果，字符不存在为0
            int count = map.get(c) == null? 0 : map.get(c);
            //将结果存入map中
            map.put(c, count + 1);
        }

        System.out.println(map);
    }

}
