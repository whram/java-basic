package reacher.statice;

public class Demo01 {

    public static void main(String[] args) {
        Student st1 = new Student("Adam", 20);
        Student st2 = new Student("Reacher", 21);
        st1.classRoom = "123";//静态变量，直接给类中的变量赋值

        printInfo(st1);
        printInfo(st2);

        st1.method();
        Student.staticMethod();
    }

    public static void printInfo(Student stu) {
        System.out.println("id: " + stu.getId() + " name: " + stu.getName()
                    + " age: " + stu.getAge() + "   class room: " + stu.classRoom);
        System.out.println("--------------");
    }

}
