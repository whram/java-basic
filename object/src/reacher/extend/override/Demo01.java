package reacher.extend.override;

/*
* 方法的重写必须保证父子之间的方法名相同，参数列表相同
* 可用@Override这个注解检验是否是有效的重写
* 重写的返回值范围必须【小于等于】原来的返回值的范围
* 重写的权限修饰符必须【大与等于】原方法的权限修饰符   public > protected > (default) > private
* */

public class Demo01 {

    public static void main(String[] args) {
        Father f = new Father();
        Child c = new Child();

        f.method();
        c.method();
    }

}
