package reacher.twoImplone_Proxy;

public class MyInterfaceImpl02 implements MyInterface {

    private MyInterface proxied;

    public MyInterfaceImpl02(MyInterface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void method01() {
        System.out.println("Impl02 method01");
        proxied.method01();
    }

    @Override
    public void method02(String a) {
        System.out.println("Impl02 method02: " + a);
        proxied.method02(a);
    }
}
