package copyFile;

/*
* 文件复制练习：一读一写
*   文件源：C:\Users\79366\Pictures\Saved Pictures
*   目的位置：C:\Users\79366\Desktop
* */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //创建一个字节输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\79366\\Pictures\\Saved Pictures\\joker.jpg");
        //创建一个字节输出流对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\79366\\Desktop\\joker.jpg");

        long s = System.currentTimeMillis();

        /*//一次读一个字节，写入一个字节
        int read = 0;
        while ((read = fis.read()) != -1) {
            fos.write(read);
        }*/

        //使用数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0,len);
        }

        //释放资源，应先关闭写的，再关闭读的
        fos.close();
        fis.close();

        long e = System.currentTimeMillis();
        System.out.println("复制文件共用时: " + (e - s));
    }

}
