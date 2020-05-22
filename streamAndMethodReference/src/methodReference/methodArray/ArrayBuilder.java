package methodReference.methodArray;

/*
* 定义一个创建数组的函数式接口
* */

@FunctionalInterface
public interface ArrayBuilder {

    //定义一个创建int类型数组的方法，参数为数组长度，返回值为int类型数组
    int[] buildArray(int length);

}
