package reverseStream;

/*
* 使用字节流读取中文文件的问题
*   1个中文：
*           GBK 占用两个字节
*           UTF-8 占用三个字节
*
* */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io\\b.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len);
        }
        fis.close();
    }

}
