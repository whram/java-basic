package reverseStream.sample;

/*
* 练习：转换文件编码
*       将GBK编码的文件转换为UTF-8编码的文件
* */

import java.io.*;

public class Demo {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("io\\src\\reverseStream\\sample\\GBK.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("io\\src\\reverseStream\\sample\\UTF-8.txt"));
        char[] chars = new char[1024];
        int len = 0;
        while ((len = isr.read(chars)) != -1){
            osw.write(chars);
        }
        osw.close();
        isr.close();
    }

}
