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
import java.io.FileFilter;
import java.io.FilenameFilter;

public class DemoLambda {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        //传递一个过滤器对象，使用匿名内部类
        /*File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                *//*
                 * 过滤规则：
                 *   判断File对象是否以.java结尾
                 * 如果pathname是个文件夹，仍是true
                 * *//*
                return pathname.isDirectory() || pathname.getName().toLowerCase().endsWith(".java");
            }
        });*/

        /*File[] files = dir.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //需要将dir和name封装为一个File对象来判断时候为一个文件夹
                return new File(dir, name).isDirectory() || name.toLowerCase().endsWith(".java");
            }
        });*/

        //使用Lambda表达式
        /*File[] files = dir.listFiles((File d, String name) -> {
            return new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java");
        });*/

        //简化Lambda表达式
        File[] files = dir.listFiles((d, name) -> new File(d, name).isDirectory() || name.toLowerCase().endsWith(".java"));

        for (File f : files) {
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
