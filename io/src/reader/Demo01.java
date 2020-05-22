package reader;

/*
* java.io.Reader 字符输入流最顶层的父类，是一个抽象类
*
* public void close() ：关闭此流并释放与此流相关联的任何系统资源。
* public int read() ： 从输入流读取一个字符。
* public int read(char[] cbuf) ： 从输入流中读取一些字符，并将它们存储到字符数组 cbuf中。
*
* java.io.FileReader extends InputStreamReader extends Reader
* FileReader 文件字符输入流
*       作用 把硬盘中的数据一字符的方式读取到内存中
*       构造方法
*           FileReader(File file) ： 创建一个新的 FileReader ，给定要读取的File对象。
*           FileReader(String fileName) ： 创建一个新的 FileReader ，给定要读取的文件的路径名称。
*
* */

import java.io.FileReader;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("io\\b.txt");
        //2.使用read方法读取文件
        int len = 0;
        char[] chars = new char[1024];
        while((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars, 0, len));
        }
        //3.释放资源
        fr.close();
    }

}
