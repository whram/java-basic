package reacher.demo02;

public class Phone {

    //成员变量
    String brand;
    double price;
    String color;

    //成员方法
    public void call(String who){
        System.out.println("给" + who + "打电话");
    }

    public void game(){
        System.out.println("打游戏");
    }

}
