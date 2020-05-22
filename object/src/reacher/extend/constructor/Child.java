package reacher.extend.constructor;

public class Child extends Father {

    int num = 2;

    //super()必须为子类构造中的第一个语句
    public Child(){
        //super();//调用父类构造方法
        super(10);//重载调用有参构造方法
        System.out.println("子类构造方法！");
    }

    public void method() {
        System.out.println(super.num);//在子类中用super调用父类中的变量
        System.out.println(this.num);//在子类中用this调用本类的方法
    }

}
