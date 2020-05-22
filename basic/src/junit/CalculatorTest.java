package junit;

public class CalculatorTest {

    public static void main(String[] args) {

        //创建计算器对象
        Calculator c = new Calculator();
        //调用加法
        int result = c.add(1, 3);
        System.out.println(result);
    }

}
