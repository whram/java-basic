package methodReference.methodObject;

/*
* 通过对象名引用成员方法
* 前提：
*       对象名存在
*       成员方法存在
* 可以使用对象名引用成员方法
* */

public class Demo01 {

    public static void main(String[] args) {
        printString("Hello World!", s -> {
            MethodReferenceObject obj = new MethodReferenceObject();
            obj.printUpCaseString(s);
        });

        //对象是存在的，成方法也是存在的，可以使用对象名来引用成员方法
        MethodReferenceObject obj = new MethodReferenceObject();
        printString("Hello World!",obj::printUpCaseString);
    }

    public static void printString(String s, Printable p){
        p.print(s);
    }

}
