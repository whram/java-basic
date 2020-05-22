package objectStream;

/*
* 序列化和反序列化时，会抛出NotSerializableException异常
* 需要实现java.io.Serializable接口以启用序列化功能
* Serializable接口也叫标记型接口
*   序列化和反序列化时会检测类上是否有标记
* */

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
