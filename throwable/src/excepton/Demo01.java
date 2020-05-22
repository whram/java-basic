package excepton;

/*
* Throwable类是所有错误和异常的超类
*   Exception 编译期异常
*       RuntimeException 运行期异常，程序运行过程中出现的问题，把问题处理掉可继续执行
*   Error 错误
* */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
                                           //将异常交给JVM处理
    public static void main(String[] args) /*throws ParseException*/ {
        //methodExp02();
        //methodRunTimeExp();
        methodError();

        System.out.println("后续程序");
    }

    //Exception 编译期异常            将异常交给JVM处理
    public static void methodExp01() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");//用来格式化日期
        Date date = sdf.parse("1999-0909");//把字符串格式的日期，解析为Data格式
    }

    //Exception 编译期异常 使用try/catch处理异常可以继续执行后续程序，将异常绕过
    public static void methodExp02() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");//用来格式化日期

        Date date = null;
        //try/catch处理异常可以继续执行后续程序，将异常绕过
        try {
            date = sdf.parse("1999-0909");//把字符串格式的日期，解析为Data格式
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
    }

    //RuntimeException 运行期异常 也可用try/catch处理
    public static void methodRunTimeExp() {
        int[] arr = {1,2,3};
        try {
            //可能出现问题的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void methodError() {
        int[] arr = new int[1024*1024*1024];//数组太大，超出内存，想要继续运行，必须修改代码
    }
}
