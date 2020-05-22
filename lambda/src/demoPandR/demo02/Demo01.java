package demoPandR.demo02;

/*
* Lambda表达式有参数有返回值的练习
* */

public class Demo01 {

    public static void main(String[] args) {
        //匿名内部类方法
        invokeCalc(10, 20, new Calculator() {
            @Override
            public int Calc(int a, int b) {
                return a + b;
            }
        });

        //Lambda表达式
        invokeCalc(10, 20, (int a, int b) -> {
            return a + b;
        });

        //Lambda表达式省略情况
        invokeCalc(10, 20, (a, b) ->  a + b);
    }

    public static void invokeCalc(int a, int b, Calculator c) {
        int sum = c.Calc(a, b);
        System.out.println(sum);
    }
}
