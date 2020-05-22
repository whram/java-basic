package trycatch;

/*
* try...catch 异常处理的第二种方式
* */

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo01 {

    public static void main(String[] args) {
        try{
            readFile("d:\\b.txt");
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }

        System.out.println("后续程序");
    }

    public static void readFile(String filePath) throws FileNotFoundException {
        //第一个异常
        if(!filePath.equals("d:\\a.txt")){
            throw new FileNotFoundException("文件路径不正确");
        }
        System.out.println("文件路径正确");
    }

}
