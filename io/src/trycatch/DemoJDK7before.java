package trycatch;

/*
* 在jdk1.7之前使用try catch finally
* */

import java.io.FileWriter;
import java.io.IOException;

public class DemoJDK7before {

    public static void main(String[] args) {
        FileWriter fw = null;
        try{
            fw = new FileWriter("o\\e.txt");
            for (int i = 0; i<10; i++) {
                fw.write("Hello world" + i + "\r\n");
            }
        }catch (IOException e) {
            System.out.println(e);
        }finally {
            //创建对象失败了，fw对象为null。null是不能调用方法的
            if(fw != null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
