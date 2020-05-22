package inputStream;

/*
* java.io.InputStream 抽象类是表示字节输入流的所有类的超类，可以读取字节信息到内存中。它定义了字节输入流的基本共性功能方法。
*
* public void close() ：关闭此输入流并释放与此流相关联的任何系统资源。
* public abstract int read() ： 从输入流读取数据的下一个字节。
* public int read(byte[] b) ： 从输入流中读取一些字节数，并将它们存储到字节数组 b中 。读到文件末尾返回-1
*
* java.io.FileInputStream extend InputStream 类是文件输入流，从文件中读取字节。
*
* 构造方法：
*       FileInputStream(File file) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，
*                                     该文件由文件系统中的 File对象 file命名。
*       FileInputStream(String name) ： 通过打开与实际文件的连接来创建一个 FileInputStream ，
*                                     该文件由文件系统中的路径名 name命名。
*       作用：
*       创建FileInputStream对象，并把对象指向构造方法中指定的要读取的文件
*
* 原理 硬盘 -> 内存
*       java程序 -> OS -> OS的读取方法读取文件
*
* 步骤：
*       1.创建FileInputSteam对象，构造方法中绑定要读取的数据源
*       2.使用FileInputSteam的read方法读取文件
*       3.释放资源
* */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.创建FileInputSteam对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("io\\a.txt");
        //2.使用FileInputSteam的read方法读取文件
        //一次只读一个字节
        /*int read = fis.read();//读第一个
        System.out.println(read);

        read = fis.read();//读第二个
        System.out.println(read);

        read = fis.read();//读到末尾-1
        System.out.println(read);*/

        //使用循环体
        //fis.read()方法内有一个指向文件内容的指针，每调用一次指针就后移一位
        int r = 0;
        while((r = fis.read()) != -1){
            System.out.println((char)r);
        }

        //3.释放资源
        fis.close();
    }

}
