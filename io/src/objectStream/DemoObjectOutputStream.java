package objectStream;

/*
* java.io.ObjectOutputStream 类，将Java对象的原始数据类型写出到文件,实现对象的持久存储。
*
* 构造方法：
*           public ObjectOutputStream(OutputStream out) ： 创建一个指定OutputStream的ObjectOutputStream。
*
* 特有的成员方法：
*   void writeObject(Object o) 将指定对象写入
* */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoObjectOutputStream {

    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io\\src\\objectStream\\person.txt"));
        oos.writeObject(new Person("Adam",20));//对象类需要序列化标记
        oos.close();
    }

}
