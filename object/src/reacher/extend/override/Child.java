package reacher.extend.override;

public class Child extends Father {

    @Override
    public void method() {
        super.method();//将父类方法的内容整体搬运过来
        System.out.println("重写的新功能！");
    }

}
