package demoThrows;

/*
* throws关键字 异常处理的第一种方法，交给别人处理
*       把方法中的异常交给方法的调用者处理，最终交给JVM处理（程序中断）
*   必须写在方法声明处
*   关键字后面声明的异常必须是Exception或者Exception的子类
*   方法内多个异常对象，则throws后也必须声明多个异常
*       如果异常对象有子父类关系，只声明父类即可
* */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        readFile("d:\\a.xt");
    }

    //判断文件是否在路径下                                FileNotFoundException是IOException的子类可以不用写
    public static void readFile(String filePath) throws FileNotFoundException, IOException {
        //第一个异常
        if(!filePath.equals("d:\\a.txt")){
            throw new FileNotFoundException("文件路径不正确");
        }

        //第二个异常
        if(!filePath.endsWith(".txt")){
            throw new IOException("文件后缀名不正确");
        }

        System.out.println("文件路径正确");
    }

}
