package objectStream;

/*
* 练习：序列化集合
*       可以把多个对象存储到一个集合中，对集合进行序列化和反序列化
* */

import java.io.*;
import java.util.ArrayList;

public class DemoObjectArrayList {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建一个对象集合
        ArrayList<Person> pLIst = new ArrayList<>();
        pLIst.add(new Person("Adam",20));
        pLIst.add(new Person("Reacher",25));

        //将序列化集合写入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io\\src\\objectStream\\personList.txt"));
        oos.writeObject(pLIst);
        oos.close();

        //读取文件
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io\\src\\objectStream\\personList.txt"));
        Object o = ois.readObject();
        ois.close();

        //把o强转成ArrayList<Person>
        ArrayList<Person> pList2 = (ArrayList<Person>)o;

        for (Person person : pList2) {
            System.out.println(person);
        }
    }

}
