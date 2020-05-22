package annotation.demo;

/*
* 简单的测试框架
*
* 当主方法执行后，会自动执行被检测的方法（加了@Check的方法）判断时候有异常，并将异常记录在文件中
* */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {

    public static void main(String[] args) throws IOException {
        //创建计算器对象
        Calculator c = new Calculator();
        //获取字节码文件
        Class aClass = c.getClass();
        //获取所有方法
        Method[] methods = aClass.getMethods();

        int sumExc = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("basic\\src\\annotation\\demo\\bug.txt"));

        for (Method method : methods) {
            //判断方法是否有@Check
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    //捕获异常
                    sumExc++;
                    bw.write(method.getName() + "方法异常了！");
                    bw.newLine();
                    bw.write("异常名称为: " + e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常原因： " + e.getCause().getMessage());
                    bw.newLine();
                    bw.write("----------------------------");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一个出现" + sumExc + "次异常");
        bw.close();
    }

}
