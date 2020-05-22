package buffered.output;

/*
* java.io.BufferedOutputStream extends OutputStream
* 字节缓冲输出流
* 增加一个缓冲区，提高字节写入效率
* */

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //1.创建一个FileOutputStream对象，构造对象中绑定输出目的地
        FileOutputStream fos = new FileOutputStream("io\\f.txt");
        //2.创建BufferedOutputStream对象，构造方法中传递FileOutputSteam对象，提高FileOutputStream对象效率
        BufferedOutputStream bos = new BufferedOutputStream(fos,1024);
        //3.使用BufferedOutputStream中的方法write，把数据写入到内部缓冲区中
        bos.write("数据".getBytes());
        //4.使用BufferedOutputStream中的方法flush，把内部缓冲区中的数据刷新到文件中
        bos.flush();
        //5.释放资源（可省略flush方法）
        bos.close();
    }

}
