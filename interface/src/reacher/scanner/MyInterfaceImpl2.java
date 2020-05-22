package reacher.scanner;

public class MyInterfaceImpl2 implements MyInterface{
    @Override
    public void methodAbs() {
        System.out.println("这是二号接口抽象方法!");
    }

    @Override
    public void methodDef() {
        System.out.println("这是二号重写的默认方法！");
    }
}
