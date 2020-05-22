package file.method;
/*
* public String getAbsolutePath() ：返回此File的绝对路径名字符串。
* public String getPath() ：将此File转换为路径名字符串。
* public String getName() ：返回由此File表示的文件或目录的名称。
* public long length() ：返回由此File表示的文件的长度(文件的大小)。
*
* public boolean exists() ：此File表示的文件或目录是否实际存在。
* public boolean isDirectory() ：此File表示的是否为目录。
* public boolean isFile() ：此File表示的是否为文件。
*
* public boolean createNewFile() ：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
* public boolean delete() ：删除由此File表示的文件或目录。
* public boolean mkdir() ：创建由此File表示的目录。
* public boolean mkdirs() ：创建由此File表示的目录，包括任何必需但不存在的父目录
*
* public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
* public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。
* */

import java.io.File;

public class Demo01 {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion\\src\\file\\demo01\\Demo01.java");
        System.out.println("文件绝对路径:"+f.getAbsolutePath());
        System.out.println("文件构造路径:"+f.getPath());
        System.out.println("文件名称:"+f.getName());
        System.out.println("文件长度:"+f.length()+"字节");

        File f2 = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion\\src\\file\\demo01");
        System.out.println("目录绝对路径:"+f2.getAbsolutePath());
        System.out.println("目录构造路径:"+f2.getPath());
        System.out.println("目录名称:"+f2.getName());
        System.out.println("目录长度:"+f2.length());//文件夹没有大小概念因此返回0
    }

}
