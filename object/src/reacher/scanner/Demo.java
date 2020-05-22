package reacher.scanner;

public class Demo {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "Adam";
        stu.age = 18;

        System.out.println(stu.name);
        System.out.println(stu.age);

        stu.eat();
        stu.study();
    }

}
