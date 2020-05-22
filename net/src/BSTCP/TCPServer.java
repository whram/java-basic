package BSTCP;

/*
* B/S版本的服务器
* */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        Socket socket = serverSocket.accept();
        InputStream is = socket.getInputStream();

        /*byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }*/

        //把is网络字节输入流对象转换为字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        //把客户端请求的信息的第一行读取出来  GET /net/web/index.html HTTP/1.1
        String line = br.readLine();
        //把读取的信息从 " " 处进行切分  /net/web/index.html
        String[] arr = line.split(" ");
        //把路径前多余的"/"去掉
        String htmlPath = arr[1].substring(1);

        FileInputStream fis = new FileInputStream(htmlPath);
        OutputStream os = socket.getOutputStream();

        //一下不适用于chrome
        // 写入HTTP协议响应头,固定写法
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content‐Type:text/html\r\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\r\n".getBytes());

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes,0,len);
        }

        fis.close();
        os.close();
        socket.close();
        serverSocket.close();
    }

}
