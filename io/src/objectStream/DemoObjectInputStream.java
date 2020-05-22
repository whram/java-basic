package objectStream;

/*
* ObjectInputStream反序列化流，将之前使用ObjectOutputStream序列化的原始数据恢复为对象。
*
* 构造方法：
*           public ObjectInputStream(InputStream in) ： 创建一个指定InputStream的ObjectInputStream。
*
* 特有的方法：
*           Object readObject () : 读取一个对象。
*
* 注：readObject方法会抛出ClassNotFoundException异常
* 当不存在class文件时抛出
* 反序列化前提：
*       1.Serializable接口标记
*       2.必须存在类对应的class文件
* */

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DemoObjectInputStream {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io\\src\\objectStream\\person.txt"));
        Object p = ois.readObject();
        ois.close();
        System.out.println(p);
    }

}
