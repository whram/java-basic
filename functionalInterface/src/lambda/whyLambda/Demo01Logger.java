package lambda.whyLambda;

/*
* 日志案例
*
* 发现存在的性能浪费的问题：
*       调用showLog方法，传递的第二个参数是拼接后的字符串
*       showLog方法中如果传递的日志等级不是1，就不会输出，则拼接过程就浪费了
*
* 使用Lambda表达式进行优化
* Lambda有延迟加载的特点
* Lambda的使用前提是必须存在函数式接口
* */

public class Demo01Logger {

    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        String msg3 = "java";

        showLog(2,msg1 + msg2 + msg3);

        /*
        * 使用Lambda优化
        * 使用Lambda表达式进行参数传递，仅仅是把方法作为参数传递到showLogLambda方法中，然而方法并未执行
        * 只有满足日志等级1的条件才会调用函数式接口中的buildMessage方法
        * */
        showLogLambda(1,() -> msg1 + msg2 + msg3);
    }

    //Lambda优化的方法，方法参数传递日志等级和MessageBuilder接口
    public static void showLogLambda(int level, MessageBuilder mb){
        if(level == 1) {
            //接口的方法在这里才调用，将字符拼接过程延迟到了这里
            System.out.println(mb.BuildMessage());;
        }
    }

    //定义一个根据日志级别，显示日志信息的方法
    public static void showLog(int level, String message) {
        if(level == 1) {
            System.out.println(message);
        }
    }
}
