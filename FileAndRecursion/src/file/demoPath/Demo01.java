package file.demoPath;

/*
* Path
*   绝对路径：是一个完整的路径
*       以盘符开始  c:\\路径\\文件
*   相对路径：是一个简化的路径
*       相对指的是当前项目的根目录  C:\\User\\79366\\IdeaProjects\\java-basic
*       可以省略项目的根目录
*
* 路径是不区分大小写
* */

import java.io.File;

public class Demo01 {

    public static void main(String[] args) {
        //File类的构造方法

        method01();
        method02("c:\\", "a.txt");
        method03();
    }

    /*File(File parent, String child)
     *       parent 父路径
     *       child 子路径
     * */
    private static void method03() {
        File parent = new File("C:\\");
        File file = new File(parent, "a.txt");
        System.out.println(file);
    }

    /*
    * File(String parent, String child)
    *       parent 父路径
    *       child 子路径
    * 父子可单独书写，且都可单独变化
    * */
    private static void method02(String parent, String child) {
        File file = new File(parent,child);
        System.out.println(file);
    }

    /*
    * File(String pathname)通过将给定路径字符串转换为抽象路径名来创建一个新的File实例
    * 参数：
    *       pathname 字符串的路径名称
    *               路径可以是相对的也可是绝对的
    *               路径可以是不存在的
    * */
    private static void method01() {
        File f1 = new File("C:\\\\User\\\\79366\\\\IdeaProjects\\\\java-basic");
        System.out.println(f1);//重写了toString方法
    }

}
