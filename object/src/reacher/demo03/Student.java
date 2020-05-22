package reacher.demo03;

import java.sql.SQLOutput;

public class Student {

    private String name;
    private int age;
    private boolean sex;

    public void call(String name) {
        System.out.println(this.name + "正在给" + name + "打电话！");
    }

    public Student() {
    }

    public Student(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
}
