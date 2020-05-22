package trycatch;

/*
* JDK9的新特性
*   try的前边可以定义流对象
*   在try后边的（）中可以直接引入流对象的名称
*   执行完毕后会自定释放流对象
* */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoJDK9 {

    public static void main(String[] args) throws FileNotFoundException {
        //创建一个字节输入流对象
        FileInputStream fis = new FileInputStream("C:\\Users\\79366\\Pictures\\Saved Pictures\\joker.jpg");
        //创建一个字节输出流对象
        FileOutputStream fos = new FileOutputStream("C:\\Users\\79366\\Desktop\\joker.jpg");

        try(fis;fos){
            byte[] bytes = new byte[1024];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0,len);
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }

}
