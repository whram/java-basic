package methodReference;

/*
*  s -> System.out.println(s)
*  System.out::println
* 第一种语义是指：拿到参数之后经Lambda之手，继而传递给 System.out.println 方法去处理。
* 第二种等效写法的语义是指：直接让 System.out 中的 println 方法来取代Lambda。
* 两种写法的执行效果完全一样，而第二种方法引用的写法复用了已有方案，更加简洁。
* 注:Lambda 中 传递的参数 一定是方法引用中 的那个方法可以接收的类型,否则会抛出异常
* */

public class Demo01Printable {

    public static void main(String[] args) {
        printString("Hello world!", s -> System.out.println(s));

        /*
        * System.out对象和其方法println是已经存在的
        * 可以使用System.out直接引用println方法对Lambda表达式简化，将参数传递省略
        * ::为引用运算符
        * */
        printString("Hello world!", System.out::println);
    }

    public static void printString(String s,Printable p) {
        p.print(s);
    }
}
