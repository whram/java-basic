package reacher.extend.constructor;

public class Father {

    int num = 1;

    public Father() {
        System.out.println("父类无参构造方法！");
    }

    //重载构造方法
    public Father(int num) {
        System.out.println("父类有参构造方法！");
    }

}
