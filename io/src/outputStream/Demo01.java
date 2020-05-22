package outputStream;

/*
* java.io.OutputStream 抽象类，是表示输出字节流的所有类的超类
*
* public void close() ：关闭此输出流并释放与此流相关联的任何系统资源。
* public void flush() ：刷新此输出流并强制任何缓冲的输出字节被写出。
* public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
* public void write(byte[] b, int off, int len) ：从指定的字节数组写入 len字节，从偏移量 off开始输出到此输出流。
* public abstract void write(int b) ：将指定的字节输出流。
*
* java.io.FileOutputStream extend OutputStream
* FileOutputStream 文件字节输出流
*       作用 把内存中的数据写入到硬盘的文件中
*       构造方法：
*           FileOutputStream(String name) 创建一个向具有指定名称的文件中写入数据的输出文件流
*           FileOutputStream(File file) 创建一个向指定File对象表示的文件中写入数据的文件输出流
*               参数 写入数据的目的地
*                   name 文件的路径
*                   file 文件
*            作用 创建一个FileOutputStream对象
*                 创建一个空文件
*                 将FileOutputStream对象指向创建好的文件
*
* 写入数据的原理  内存 --> 硬盘
*       java程序 --> JVM --> OS --> OS调用写数据方法将数据写入到文件
*
* 字节输出流的使用步骤：
*       1.创建一个FileOutputStream对象，构造方法中传递目的地
*       2.调用FileOutputStream的方法write，把数据写入到文件
*       3.释放内存资源
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象，构造方法中传递目的地
        FileOutputStream fos = new FileOutputStream("io\\a.txt");
        //2.调用FileOutputStream的方法write，把数据写入到文件
        fos.write(97);//一次写入一个字节的方法
        fos.write(98);
        //3.释放内存资源
        fos.close();

        FileOutputStream fos02 = new FileOutputStream(new File("io\\b.txt"));
        /*
        * public void write(byte[] b) ：将 b.length字节从指定的字节数组写入此输出流。
        * 如果第一个字节是正整数（0-127），那么显示的时候会查询ASCII表
        * 如果第一个字节是负数，那么第一个字节和第二个字节组成一个中文字符查询GBK表
         * */
        byte[] bytes = {-65,-66,-67,68,69};
        fos02.write(bytes);//将整个字节数组写入文件
        fos02.write(bytes,1,2);//将字节数组的一部分写入

        //将字符串写入文件
        byte[] bytes1 = "Hello world!".getBytes();
        System.out.println(Arrays.toString(bytes1));
        fos02.write(bytes1);
        fos02.close();
    }

}
