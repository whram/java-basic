package methodReference.methodSuperAndThis;

public class Child extends Father {
    @Override
    public void sayHello() {
        System.out.println("Hello! I am child");
    }

    public void method(GreetInterface g) {
        g.greet();
    }

    public void show1() {
        //子父类关系存在关键字super代表父类，可以直接用super引用父类成员方法
        method(super::sayHello);
    }

    public void show2(){
        //this代表本类，可以直接用this引用本类的成员方法
        method(this::sayHello);
    }

    public static void main(String[] args) {
        new Child().show1();
        new Child().show2();
    }
}
