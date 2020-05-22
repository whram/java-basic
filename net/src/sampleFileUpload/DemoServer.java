package sampleFileUpload;

/*
* 文件上传案例的服务器端
*
* 数据源：客户端上传的文件
* 目的地：C:\Users\79366\Desktop\joker.jpg
* */

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class DemoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);

        /*
        * 让服务器一直处于监听状态
        * */
         while (true) {
             Socket socket = serverSocket.accept();

             /*
             * 使用多线程技术提高程序效率
             * 有一个客户端上传文件，就开启一个线程
             * */
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         InputStream is = socket.getInputStream();

                         //判断C:\Users\79366\Desktop路径是否存在
                         File file = new File("C:\\Users\\79366\\Desktop\\");
                         if (file.exists()) {
                             file.mkdir();
                         }

                         /*
                          * 自定义文件名
                          *   规则：名字 + 毫秒数 + 随机数
                          * */
                         String fileName = "Joker" + System.currentTimeMillis() + new Random().nextInt(10) + ".jpg";

                         FileOutputStream fos = new FileOutputStream(file + "\\" + fileName);
                         byte[] bytes = new byte[1024];
                         int len = 0;
                         while ((len = is.read(bytes)) != -1) {//读取的上传文件没有结束标记，因此始终等待结束标记
                             fos.write(bytes,0,len);
                         }

                         socket.getOutputStream().write("文件已上传！".getBytes());
                         fos.close();
                         socket.close();
                     }catch (IOException e){
                         System.out.println(e);
                     }
                 }
             }).start();


         }
    }

}
