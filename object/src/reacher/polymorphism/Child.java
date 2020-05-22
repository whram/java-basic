package reacher.polymorphism;

public class Child extends Father {

    int num = 20;

    @Override
    public void method() {
        System.out.println("子类方法！");
    }

    public void methodChild() {
        System.out.println("子类特有的方法！");
    }

}
