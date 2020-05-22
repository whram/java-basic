package reacher.scanner;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//键盘输入
        /*int num = sc.nextInt();
        System.out.println(num+10);*/

        String str = sc.next();
        System.out.println(str);
    }

}
