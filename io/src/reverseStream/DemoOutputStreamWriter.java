package reverseStream;

/*
* java.io.OutputStreamWriter ，是Writer的子类
* 是从字符流到字节流的桥梁。可使用指定的charset将要写入流中的字符编码成字节
*
* 构造方法：
*       OutputStreamWriter(OutputStream in) : 创建一个使用默认字符集的字符流。
*       OutputStreamWriter(OutputStream in, String charsetName) : 创建一个指定字符集的字符流。
*                                                                 指定的编码表，参数不区分大小写，默认UTF-8
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class DemoOutputStreamWriter {

    public static void main(String[] args) throws IOException {
        //1.创建一个OutputStreamWriter对象
        //OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io\\src\\reverseStream\\UTF-8.txt"),"utf-8");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io\\src\\reverseStream\\GBK.txt"),"gbk");
        //2.使用OutputStreamWriter中的方法writer，把字符转换为字节存储到缓冲区
        osw.write("你好");
        //3.flush刷新到文件中
        osw.flush();
        //4.释放资源
        osw.close();
    }

}
