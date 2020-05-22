package properties;

/*
* java.util.Properties extends Hashtable<k,v> implements Map<k,v>\
*
* Properties集合是唯一和io流相结合的集合
*       可以使用properties集合中的方法store，把集合中的临时数据持久化写入到硬盘中存储
*       可以使用properties集合中的方法load，把硬盘中的文件（键值对）读取到集合中
*
* public Object setProperty(String key, String value) ： 保存一对属性。
* public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
* public Set<String> stringPropertyNames() ：所有键的名称的集合。
* */

import java.io.*;
import java.util.Properties;
import java.util.Set;

public class Demo01 {

    public static void main(String[] args) throws IOException {
        //method01();
        //method02();//store方法
        method03();
    }

    /*
    * void load(inputStream inStream)
     * void store(Reader reader)
     * 参数：
     *       inputStream inStream 字节输入流，不能读中文
     *       Reader reader 字符输入流，可以读中文
    * */
    private static void method03() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用Properties集合中的load方法读取保存键值对的文件
        prop.load(new FileReader("io\\prop.txt"));

        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }

    /*
    * void store(OutputStream out, String comment)
     * void store(Writer writer, String Comment)
     * 参数：
     *       OutputStream out 字节输出流，不能写入中文
     *       Writer writer 字符输出流，可以写入中文
     *       String Comment 注释，不能使用中文，由于编码问题会乱码
    * */
    private static void method02() throws IOException {
        //创建一个properties集合对象
        Properties prop = new Properties();
        prop.setProperty("Adam","20");
        prop.setProperty("Reacher","21");

        //创建一个字符流
        /*FileWriter fw = new FileWriter("io\\prop.txt");

        prop.store(fw, "save data");
        fw.close();*/

        prop.store(new FileOutputStream("io\\prop.txt"),"save data");
    }

    private static void method01() {
        //创建一个properties集合对象
        Properties prop = new Properties();
        prop.setProperty("Adam","20");
        prop.setProperty("Reacher","21");

        //使用stringPropertiesNames方法把Properties集合中的键取出，存到一个set集合中
        Set<String> set = prop.stringPropertyNames();

        //遍历Set集合，取出Properties集合中的每一个键
        for (String key : set) {
            //使用getProperties方法通过key获取value
            String value = prop.getProperty(key);
            System.out.println(key + ": " + value);
        }
    }

}
