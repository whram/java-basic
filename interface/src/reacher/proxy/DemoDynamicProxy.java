package reacher.proxy;

import reacher.twoImplone_Proxy.MyInterface;
import reacher.twoImplone_Proxy.MyInterfaceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DemoDynamicProxy {
    public static void show(MyInterface myInterface) {
        myInterface.method01();
        myInterface.method02("a");
    }

    public static void main(String[] args) {
        MyInterfaceImpl myInterface = new MyInterfaceImpl();
        System.out.println("-----------------");
        show(myInterface);

        MyInterface proxy = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[]{MyInterface.class},
                new DynamicProxyHandler(myInterface));

        System.out.println("-----------------");
        show(proxy);
    }
}
