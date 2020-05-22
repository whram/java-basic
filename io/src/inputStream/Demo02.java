package inputStream;

/*
* 字节输入流一次读取多个字节
*       int read(byte[] b) 从输入流中读取一些字节数，并将它们存储到字节数组 b中
*                          方法返回的是有效字节个数（读取到字节的个数），即覆盖字节数组b的位数
*
* String类的构造方法
*       String(byte[] bytes) 把字节数组转换为字符串
*       String(byte[] bytes, int offset, int length) 把字节数组一部分转换为字符串
* */

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("io\\c.txt");
        /*byte[] bytes = new byte[2];
        int read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));

        read = fis.read(bytes);//read方法返回的是有效字节个数，即覆盖字节数组的位数
        System.out.println(read);
        System.out.println(new String(bytes));

        read = fis.read(bytes);
        System.out.println(read);
        System.out.println(new String(bytes));*/

        //循环优化，循环结束条件是读取到-1
        byte[] bytes = new byte[1024];
        int read = 0;//记录每次读取到的有效字节个数
        while ((read = fis.read(bytes)) != -1) {
            System.out.println(read);
            System.out.println(new String(bytes, 0, read));
        }

        fis.close();
    }

}
