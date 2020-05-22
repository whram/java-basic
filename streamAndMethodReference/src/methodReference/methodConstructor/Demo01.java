package methodReference.methodConstructor;

/*
* 类的构造器（构造方法）引用
* */

public class Demo01 {

    public static void main(String[] args) {
        printName("Adam", name -> new Person(name));

        //构造方法new Person(String name)已知 创建对象已知 new 可以使用Person引用new对象
        printName("Reacher", Person::new);
    }

    public static void printName(String name, PersonBuilder pb) {
        Person person = pb.buildPerson(name);
        System.out.println(person.getName());
    }
}
