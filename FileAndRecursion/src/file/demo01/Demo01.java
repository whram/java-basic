package file.demo01;

/*
* java.io.File类
*   文件和目录路径的抽象表示形式。
*   java把电脑中的文件和文件夹封装为一个File类，我们可以使用File类对文件和文件夹进行操作
*
* File类是一个与系统无关的类
*
* file 文件
* directory 文件夹/目录
* path 路径
*
* 路径分割符 windows为 ;  linux为 :
* static String pathSeparator 与系统有关的路径分隔符，是一个字符串
* static char pathSeparatorChar 与系统有关的路径分隔符
*
* 文件名称分割符 windows为 \  linux为 /
* static String separator 与系统有关的默认名称分隔符，是一个字符串
* static char separatorChar 与系统有关的默认名称分隔符
*
* 操作路径不能写死，不同系统符号不同
* 例：
*     "C:" + File.separator + "某文件夹" + File.separator + "某文件名.文件格式"
 * */

import java.io.File;

public class Demo01 {

    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);

        String separator = File.separator;
        System.out.println(separator);
    }

}
