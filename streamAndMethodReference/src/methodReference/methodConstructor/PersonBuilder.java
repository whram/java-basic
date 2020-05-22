package methodReference.methodConstructor;

/*
* 创建Person对象的函数式接口
* */

@FunctionalInterface
public interface PersonBuilder {
    //根据传递的姓名创建Person对象
    Person buildPerson(String name);
}
