package reacher.random;

import java.util.Random;

/*r.nextInt() int型所有范围生成随机数
* r.nextInt(n) int型[0,n) n为正整数*/

public class DemoRandom {

    public static void main(String[] args) {
        Random r = new Random();
        int num = r.nextInt(10);
        System.out.println(num);
    }

}
