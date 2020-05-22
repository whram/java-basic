package outputStream;

/*
* 文件续写
*       FileOutputStream(String name, boolean append)
*       FileOutputStream(File file, boolean append)
*           参数 append 续写开关
*                       true：续写
*                       false：覆盖
*
* 换行
*   windows \r\n
*   linux /n
*   mac /r
* */

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02 {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("io\\c.txt", true);
        fos.write("Hello".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();

    }

}
