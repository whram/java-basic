package trycatch;

/*
* JDK7新特性
*   在try后加一个（），在括号内定义流对象，作用域在try中，在try执行完毕会自动释放流对象，因此不用再在finally中释放流对象
*
* 格式：
*       try(定义流对象;...;.){
*           可能异常的代码
*       }catch(异常类变量 变量名) {
*           异常处理
*       }
*
* */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoJDK7after {

    public static void main(String[] args) {
        try(//创建一个字节输入流对象
            FileInputStream fis = new FileInputStream("C:\\Users\\79366\\Pictures\\Saved Pictures\\joker.jpg");
            //创建一个字节输出流对象
            FileOutputStream fos = new FileOutputStream("C:\\Users\\79366\\Desktop\\joker.jpg");
            ){
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
