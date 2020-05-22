package reacher.demo03;

public class Demo {

    public static void main(String[] args) {
        Student[] stArray = new Student[2];
        stArray[0] = new Student("adam", 18, true);
        stArray[1] = createStudent("reacher", 20, true);
        printStudent(stArray[0]);
        stArray[0].call(stArray[1].getName());
    }

    public static Student createStudent(String name, int age, boolean sex){
        Student stu = new Student();
        stu.setName(name);
        stu.setAge(age);
        stu.setSex(sex);
        return stu;
    }

    public static void printStudent(Student stu){
        System.out.println("姓名：" + stu.getName() + "\n年龄：" + stu.getAge());
    }

}
