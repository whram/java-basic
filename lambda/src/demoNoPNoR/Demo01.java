package demoNoPNoR;

/*
* Lambda表达式的无参数无返回值
* */

public class Demo01 {

    public static void main(String[] args) {
        //调用invokeCook方法，传递Cook接口的匿名内部类对象
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("吃饭了！");
            }
        });

        //使用Lambda表达式
        invokeCook(() -> {
            System.out.println("吃饭了！");
        });
    }

    //定义一个方法方法内部调用Cook接口中的方法makeFood
    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }

}
