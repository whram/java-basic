package reacher.string;

public class Demo02 {

    public static void main(String[] args) {
        String str1 = "abc";//在字符串常量池中，字符串常量池在堆中
        String str2 = "abc";//与str1在字符串常量池中是同一地址值

        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);

        System.out.println(str1 == str2);//true 对于数值类型是进行数值的比较
        System.out.println(str1 == str3);//false 对于引用类型是进行地址值的比较
        System.out.println(str2 == str3);//false

        System.out.println(str1.equals(str3));//true

        String str4 = null;
        System.out.println("abc".equals(str4));//推荐写法
//        System.out.println(str4.equals("abc"));//空指针异常
    }

}
