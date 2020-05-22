package define;

/*
* 函数式接口的使用：一般可以作为方法的参数和返回值类型
* */

public class Demo01 {

    public static void main(String[] args) {
        //调用show方法，参数是一个函数式接口，可以传递接口的实现类
        show(new MyFunctionalInterfaceImpl());

        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                //重写抽象方法
                System.out.println("使用匿名内部类重写函数式接口的抽象方法");
            }
        });

        //可以传递Lambda表达式
        show(() -> System.out.println("使用Lambda表达式重写函数式接口的抽象方法"));
    }

    //定义一个方法，参数使用函数式接口
    public static void show(MyFunctionalInterface muInter) {
        muInter.method();
    }
}
