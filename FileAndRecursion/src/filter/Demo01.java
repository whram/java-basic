package filter;

/*
* java.io.FileFilter 是一个接口，是File的过滤器。 该接口的对象可以传递给File类的 listFiles(FileFilter)作为参数
*
* File[] listFiles(FileFilter filter) 路径名过滤器
* 抽象方法：boolean accept(File pathname) ：测试pathname是否应该包含在当前File目录中，符合则返回true。
*
* File[] listFiles(FilenameFilter filter) 文件名称过滤器
* 抽象方法：boolean accept(File dir, String name)  测试某文件/文件夹是否在某一目录内
*
* 注：
*     两个过滤器接口是没有实现类的，需要写实现类，并重写实现方法，自己定义过滤规则
* */

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] file = dir.listFiles(new FileFilterImpl()); //传递一个过滤器对象
        /*
        * listFiles方法一共做了三件事情
        *   1.对构造方法中传递的目录进行遍历，获取目录中每一个文件/文件夹 --> 封装为File对象
        *   2.调用参数传递的过滤器中的accept方法
        *   3.会把遍历得到每一个File对象传递给accept方法的参数pathname
        * */

        for (File f : file) {
            if(f.isFile()){
                //只要.java结尾的文件
                //把File对象f转换为String类型
                String fName = f.getName();
                //转换成小写
                fName = fName.toLowerCase();
                //判断文件是否是.java结尾
                if(fName.endsWith(".java")) {
                    System.out.println(f);
                }
            }else {
                getAllFile(f);
            }
        }
    }
}
