package trycatch;

public class finallyDemo {

    public static void main(String[] args) {
        int a = getA();
        System.out.println(a);
    }

    public static int getA() {
        int a = 10;
        try{
            return a;
        }catch (Exception e) {
            System.out.println(e);
        }finally {
            //一定会执行的代码
            a = 100;
            return a;
        }
    }
}
