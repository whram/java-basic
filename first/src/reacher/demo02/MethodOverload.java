package reacher.demo02;

/*可重载：
参数个数不同
参数类型不同
参数类型顺序不同

不可重载：
仅参数名称不同
仅返回值类型不同*/

public class MethodOverload {

    public static void main(String[] args) {
        System.out.println(sum(1,2));
    }

    public static int sum(int a, int b){
        return  a+b;
    }

    public static int sum(int a, int b,int c){
        return  a+b+c;
    }

    public static int sum(int a, double b){
        return (int)(a+b);
    }

}
