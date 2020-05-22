package reacher.set.hashCode;

/*
* hash值是一个逻辑地址值
* Object类中的hashCode（）方法可以返回对象的逻辑地址值
*   public native int hashCode();
*   native 代表调用的是本地操作系统的方法
* */

public class Demo01 {

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1.hashCode());
        System.out.println(Integer.toHexString(p1.hashCode()));//十进制转换为16进制
        System.out.println(p1);
        System.out.println(p2.hashCode());

        System.out.println("重地".hashCode() == "通话".hashCode());

    }

}
