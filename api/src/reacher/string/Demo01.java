package reacher.string;

/*
* java中所有字符串都是String类型
*
* 字符串内容用不可变
* 字符串可以共享使用
* 字符串效果上是char[]字符数组，底层是byte[]字节数组
* */

public class Demo01 {

    public static void main(String[] args) {
        String str1 = new String();
        System.out.println("first string: " + str1);

        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        System.out.println("second string: " + str2);

        byte[] byteArray = {97, 98, 99};
        String str3 = new String(byteArray);
        System.out.println("third string: " + str3);
    }

}
