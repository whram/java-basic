package filter;

/*
* FileFilter的实现类重写accept()过滤方法
* */

import java.io.File;
import java.io.FileFilter;

public class FileFilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        * 过滤规则：
        *   判断File对象是否以.java结尾
        * 如果pathname是个文件夹，仍是true
        * */
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
