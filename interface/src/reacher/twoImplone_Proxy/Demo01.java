package reacher.twoImplone_Proxy;

public class Demo01 {
    public static void show01(MyInterface myInterface){
        myInterface.method01();
        myInterface.method02("a");
    }

    public static void main(String[] args) {
        show01(new MyInterfaceImpl());
        show01(new MyInterfaceImpl02(new MyInterfaceImpl()));
    }
}
