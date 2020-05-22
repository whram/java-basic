package methodReference.methodArray;

/*
* 数组的构造器引用
* */

public class Demo01 {

    public static void main(String[] args) {
        int[] arr1 = creatArray(5, length -> new int[length]);
        System.out.println(arr1.length);

        //创建的数组类型是已知的，数组长度是已知的
        int[] arr2 = creatArray(6, int[]::new);
        System.out.println(arr2.length);
    }

    public static int[] creatArray(int length, ArrayBuilder ab) {
        return ab.buildArray(length);
    }

}
