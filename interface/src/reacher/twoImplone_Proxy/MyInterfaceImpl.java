package reacher.twoImplone_Proxy;

public class MyInterfaceImpl implements MyInterface {
    @Override
    public void method01() {
        System.out.println("Impl01 method01");
    }

    @Override
    public void method02(String a) {
        System.out.println("Impl01 method02: "+a);
    }
}
