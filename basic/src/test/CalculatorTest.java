package test;

import junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /*
    * 初始化方法：
    *   用于资源申请，所有测试的方法在执行之前都会先执行该方法
    * */
    @Before
    public void init() {
        System.out.println("init...");
    }

    /*
    * 释放资源的方法：
    *   在所有测试方法执行完后，都会自动执行该方法
    * */
    @After
    public void close(){
        System.out.println("close...");
    }

    /*
    * 测试add方法
    * */
    @Test
    public void testAdd() {
        //System.out.println("Running");
        //创建计算器对象
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        int result = c.add(1, 2);
        //System.out.println(result);

        /*
        * 断言  断言结果应该是什么
        * 一般我们会使用断言操作来处理结果
        * Assert.assertEquals(期望的结果,运算的结果);
        * */
        Assert.assertEquals(3,result);
    }

    @Test
    public void subTest() {
        System.out.println("testSub...");
        Calculator c = new Calculator();
        int result = c.sub(1, 2);
        Assert.assertEquals(-1,result);
    }
}
