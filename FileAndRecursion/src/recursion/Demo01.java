package recursion;

/*
* 递归打印多级目录
* */

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\79366\\IdeaProjects\\java-basic\\FileAndRecursion");
        getAllFile(file);
    }
    
    public static void getAllFile(File dir) {
        File[] file = dir.listFiles();
        for (File f : file) {
            if(f.isFile()){
                System.out.println(f);
            }else {
                getAllFile(f);
            }
        }
    }
}
