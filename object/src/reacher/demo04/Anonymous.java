package reacher.demo04;

//匿名对象：只能使用唯一的一次

import java.util.Scanner;

public class Anonymous {

    public static void main(String[] args) {
        new Person().showName();
        method1(new Scanner(System.in));
        System.out.println(method2().next());
    }

     public static void method1(Scanner sc){
         String s = sc.next();
         System.out.println("is " + s);
     }

     public static Scanner method2() {
        return new Scanner(System.in);
     }

}
