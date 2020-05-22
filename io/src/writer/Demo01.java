package writer;

/*
* java.io.writer 字符输处流最顶层的父类，是一个抽象类
*
* void write(int c) 写入单个字符。
* void write(char[] cbuf) 写入字符数组。
* abstract void write(char[] cbuf, int off, int len) 写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
* void write(String str) 写入字符串。
* void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
* void flush() 刷新该流的缓冲。
* void close() 关闭此流，但要先刷新它
*
* java.io.FileWriter extends OutputStreamWriter extends Writer
* FileWriter 文件字符输出流
*       构造方法：
*               FileWriter(File file) ： 创建一个新的 FileWriter，给定要读取的File对象。
*               FileWriter(String fileName) ： 创建一个新的 FileWriter，给定要读取的文件的名称。
* */

import java.io.FileWriter;
import java.io.IOException;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入的数据的目的地
        FileWriter fw = new FileWriter("io\\d.txt");
        //2.使用Writer方法把数据写入到内存缓冲区（字符转换为字节的过程）
        //fw.write(97);
        //写入字符数组
        char[] chars = {'a','b','c','d'};
        fw.write(chars,1,2);

        //写字符串
        fw.write("--Hello world!--", 2,12);

        //续写和换行和字节流相同

        //3.使用flush方法把内存缓冲区中的数据刷新到文件中
        fw.flush();
        //4.释放资源（会先把内存中的数据刷新到文件中,调用close方法可省略flush方法）
        fw.close();
    }
}
