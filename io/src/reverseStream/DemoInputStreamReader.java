package reverseStream;

/*
* java.io.InputStreamReader ，是Reader的子类
* 是从字节流到字符流的桥梁。
*
* 构造方法：
*           InputStreamReader(InputStream in) : 创建一个使用默认字符集的字符流。
*           InputStreamReader(InputStream in, String charsetName) : 创建一个指定字符集的字符流。
*                                                                   指定的编码表，参数不区分大小写，默认UTF-8
*
* 注：构造方法中的编码必须和文件的编码相同
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoInputStreamReader {

    public static void main(String[] args) throws IOException {
        //1.创建一个InputStreamReader对象
        //InputStreamReader isr = new InputStreamReader(new FileInputStream("io\\src\\reverseStream\\GBK.txt"),"gbk");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("io\\src\\reverseStream\\UTF-8.txt"));
        //2.使用InputStreamReader的read方法读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        //3.释放资源
        isr.close();
    }

}
