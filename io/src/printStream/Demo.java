package printStream;

/*
* java.io.PrintStream 打印流 继承了OutputStream
*   该类能够方便地打印各种数据类型的值，是一种便捷的输出方式。
*
* 特点：
*   1.只负责数据的输出，不能读数据
*   2.永远不会抛出IOException
*   3.有特有方法，print(任意类型的值), println(任意类型的值)
*   4.可以改变输出语句的目的地（打印流的流向）
*       输出语句默认输出在控制台
*       可使用 static void setOut(PrintStream out) 改变输出语句的目的地为打印流的目的地
*
* 构造方法：
*       PrintStream(String fileName) ： 输出的目的地是一个文件路径
*       PrintStream(File file) ： 输出的目的地是文件
*       PrintStream(OutputStream out)：输出的目的地是一个字节输出流
*
* 注：如果使用继承自父类的write方法写数据时，查看数据会查询编码表
*     如果使用自己特有的print/println方法写数据时，数据输出原样
 * */

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hello world!");//out就是一个打印流

        PrintStream ps = new PrintStream("io\\src\\printStream\\print.txt");
        ps.write(97);
        ps.println(97);

        System.setOut(ps);//此方法把输出语句的目的地改变为打印流的目的地
        System.out.println("输出语句！");//此语句并未在控制台打印，而是打印在print.txt文件中

        ps.close();
    }

}
