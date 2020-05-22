package reacher.extend;

//变量与方法的调用为自上而下寻找
//重名变量与方法调用时，遵守就近原则

public class Demo01 {

    public static void main(String[] args) {
        Teacher t = new Teacher();
        new Assistant();

        t.show();
        t.method();
    }

}
