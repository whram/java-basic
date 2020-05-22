package socketTCP;

/*
* TCP通信的服务器端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
* 表示服务器的类：
*       ServerSocket 类：这个类实现了服务器套接字，该对象等待通过网络的请求。
*
* 构造方法：
*       public ServerSocket(int port) ：使用该构造方法在创建ServerSocket对象时，就可以将其绑定到一个指定的端口号上，参数port就是端口号。
*
* 服务器端必须明确一件事情，必须知道哪个客户端请求的服务器
* 成员方法：
*       public Socket accept() ：侦听并接受连接，返回一个新的Socket对象，用于和客户端实现通信。该方法会一直阻塞直到建立连接。
* */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        //1.创建服务器ServerSocket对象和系统指定的端口号
        ServerSocket serverSocket = new ServerSocket(8888);
        //2.使用ServerSocket对象中的方法accept方法获取到客户端对象Socket
        Socket socket = serverSocket.accept();
        //3.使用Socket对象中的方法getInputStream方法获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        //4.使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5.使用Socket对象中的方法getOutputStream()方法获取网络字节输出流OutputStream对象
        OutputStream os = socket.getOutputStream();
        //6.使用网络字节输出流OutputStream对象中的方法write，给客户端回写数据
        os.write("收到".getBytes());
        //7.释放资源（Socket，ServerSocket）
        socket.close();
        serverSocket.close();
    }

}
