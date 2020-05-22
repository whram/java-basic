package socketTCP;

/*
* TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写数据
* 表示客户端的类：
*       Socket 类：该类实现客户端套接字，套接字指的是两台设备之间通讯的端点。
*                   套接字：包含了IP地址和端口号的网络单位
*
* 构造方法：
*       public Socket(String host, int port) :创建套接字对象并将其连接到指定主机上的指定端口号。如果指定的host是null ，则相当于指定地址为回送地址。
*                   String host 服务器主机的名称/IP地址
*                   int port：服务器端口号
*
* 成员方法：
*       public InputStream getInputStream() ： 返回此套接字的输入流。
*       public OutputStream getOutputStream() ： 返回此套接字的输出流。
*       public void close() ：关闭此套接字。
*       public void shutdownOutput() ： 禁用此套接字的输出流。
*
* 注：
*   1.客户端和服务端进行交互，必须使用Socket中提供的网络流，不能使用自己创建的流对象
*   2.创建客户端对象Socket时，会请求服务器，和服务器进行三次握手建立连接通路，若服务器没启动，会抛出异常
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {
        //1.创建一个客户端对象Socket，构造方法中绑定服务器
        Socket socket = new Socket("127.0.0.1", 8888);
        //2.使用Socket对象中的方法getOutputStream()方法获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //3.使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        os.write("你好服务器".getBytes());
        //4.使用Socket对象中的方法getInputStream方法获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //5.使用网络字节输入流InputStream对象中的方法read。读取服务器回写的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //6.释放资源
        socket.close();
    }

}
