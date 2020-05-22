package reacher.statice;

import javax.swing.*;

public class Student {

    private int id;
    private String name;
    private int age;
    static String classRoom;
    private static int idCounter = 0;

    //只有此类第一次调用的时候才会执行，且执行此唯一一次
    static {
        System.out.println("静态代码块执行！");
    }

    public void method() {
        System.out.println("这是一个成员方法！");
    }

    public static void staticMethod() {
        System.out.println("这是一个静态方法！");
    }

    public Student(String name, int age) {
        this.id = ++this.idCounter;
        this.name = name;
        this.age = age;
    }

    public Student() {
        this.id = ++this.idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
