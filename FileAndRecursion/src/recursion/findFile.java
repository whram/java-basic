package recursion;

/*
* 递归查找.java文件
* */

import java.io.File;

public class findFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion");
        getAllFile(file);
    }

    public static void getAllFile(File dir) {
        File[] file = dir.listFiles();
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
