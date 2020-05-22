package consumer;

/*
* 按照格式“ 姓名：XX。性别：XX。 ”的格式将信息打印出来。
* 要求将打印姓名的动作作为第一个 Consumer 接口的Lambda实例，
* 将打印性别的动作作为第二个 Consumer 接口的Lambda实例，
* 将两个 Consumer 接口按照顺序“拼接”到一起。
* */

import java.util.function.Consumer;

public class Test {
    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message : arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] array = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };

        printInfo(array, (message) -> {
            //对message进行切割，获取姓名
            String name = message.split(",")[0];
            System.out.print("姓名：" + name);
        }, (message) -> {
            String sex = message.split(",")[1];
            System.out.println("。性别：" + sex + "。");
        });
    }
}
