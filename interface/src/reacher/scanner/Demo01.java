package reacher.scanner;

public class Demo01 {

    public static void main(String[] args) {
        MyInterfaceImpl impl = new MyInterfaceImpl();
        impl.methodAbs();
        impl.methodDef();

        MyInterfaceImpl2 impl2 = new MyInterfaceImpl2();
        impl2.methodAbs();
        impl2.methodDef();

        MyInterface.methodStatic();//接口的静态方法的正确调用方式

        System.out.println("接口的常量： " + MyInterface.NUM_OF_MY);

    }

}
