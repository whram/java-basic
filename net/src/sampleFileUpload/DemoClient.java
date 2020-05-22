package sampleFileUpload;

/*
* 文件上传案例的客户端：读取本地的文件，上传到服务器，读取服务器回写的数据
*
* 数据源：C:\Users\79366\Pictures\Saved Pictures\joker.jpg
* 目的地：服务器
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class DemoClient {
    public static void main(String[] args) throws IOException {
        //1.创建本地字节输入流FileInputStream对象，构造方法绑定数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\79366\\Pictures\\Saved Pictures\\joker.jpg");

        //2.创建一个客户端Socket对象，构造方法中绑定服务器地址端口
        Socket socket = new Socket("127.0.0.1", 8888);

        //3.使用Socket对象的getOutputStream方法，获取网络字节输出流OutputSteam对象
        OutputStream os = socket.getOutputStream();

        //4.使用本地字节输入流FileInputStream对象中的方法read，读取本地文件
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1){//read方法不会读到结束标记，因此不会将结束标记
            //5.使用网络字节输出流OutputSteam对象中的方法write，把读取到的文件上传到服务器
            os.write(bytes,0,len);
        }
        //阻塞解决方法，给上传文件后写一个结束标记
        socket.shutdownOutput();

        //6.使用Socket中的方法getInputStream，获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();

        //7.使用网络字节输入流InputStream对象中的read方法读取服务器回写的数据
        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        //8.释放资源（FileInputStream，Socket）
        fis.close();
        socket.close();
    }
}
