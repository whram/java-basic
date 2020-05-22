package annotation.demo;

/*
* 需要测试的计算器类
* */

public class Calculator {

    @Check
    public void add() {
        System.out.println("1 + 0 = " + (1+0));
    }

    @Check
    public void sub() {
        System.out.println("1 - 0 = " + (1-0));
    }

    @Check
    public void mul() {
        System.out.println("1 * 0 = " + (1*0));
    }

    @Check
    public void div() {
        System.out.println("1 / 0 = " + (1/0));
    }

    public void show() {
        System.out.println("never bug...");
    }

}
