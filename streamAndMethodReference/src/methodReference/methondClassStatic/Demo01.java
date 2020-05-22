package methodReference.methondClassStatic;

/*
* 通过类名引用静态成员方法
* 类已经存在
* 类中的静态成员方法已经存在
* */

public class Demo01 {

    public static void main(String[] args) {
        //Math类是存在的，abs()静态方法是已经存在的，可以使用类名直接引用静态方法
        int value = method(-19, Math::abs);
        System.out.println(value);
    }

    public static int method(int num, Calculator calc){
        return calc.calcAbs(num);
    }
}
