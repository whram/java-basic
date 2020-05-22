package sample;

/*
* 练习 对文本内容进行排序
*
* 1.创建HashMap集合对象 key：段落序号
*                      value：段落内容
* 2.创建字符缓冲输入流对象
* 3.创建字符缓冲输出流对象
* 4.使用字符缓冲输入流中的方法readline逐行读取文本
* 5.对读取到的文本进行切割，获取序号与内容
* 6.把切割好的序号和内容存储到hashMap中（key会根据序号自动排序）
* 7.遍历HashMap集合，获取每个键值对
* 8.把每个键值对拼接为一个文本行
* 9.把拼接好的文本使用字符缓冲输出流中的方法write写入到文本中
* 10.释放资源
* */

import java.io.*;
import java.util.HashMap;

public class Demo {

    public static void main(String[] args) throws IOException {
        //1.创建HashMap集合对象
        HashMap<String, String> map = new HashMap<>();
        //2.创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("io\\src\\sample\\in.txt"));
        //3.创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("io\\src\\sample\\out.txt"));
        //4.使用字符缓冲输入流中的方法readline逐行读取文本，读行的时候不会将换行符读取
        String line;
        while ((line = br.readLine()) != null){
            //5.对读取到的文本进行切割，获取序号与内容
            String[] arr = line.split("\\.");
            //6.把切割好的序号和内容存储到hashMap中（key会根据序号自动排序）
            map.put(arr[0],arr[1]);
        }
        //7.遍历HashMap集合，获取每个键值对
        for (String key : map.keySet()) {
            String value = map.get(key);
            //8.把每个键值对拼接为一个文本行
            line = key + "." + value;
            //9.把拼接好的文本使用字符缓冲输出流中的方法write写入到文本中
            bw.write(line);
            bw.newLine();//换行
        }
        //10.释放资源
        bw.close();
        br.close();
    }

}
