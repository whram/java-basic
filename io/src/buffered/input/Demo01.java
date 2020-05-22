package buffered.input;

/*
 * java.io.BufferedInputStream extends InputStream
 * 字节缓冲输入流
 * 增加一个缓冲区，提高字节读取效率
 * */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.创建一个FileInputStream对象，构造对象中绑定输出目的地
        FileInputStream fis = new FileInputStream("io\\f.txt");
        //2.创建BufferedInputStream对象，构造方法中传递FileInputSteam对象，提高FileInputStream对象效率
        BufferedInputStream bis = new BufferedInputStream(fis,1024);
        //3.使用BufferedInputStream中的方法read
        int len = 0;
        while ((len = bis.read()) != -1){
            System.out.println(len);
        }
        bis.close();
    }

}
