package reacher.extend;

import java.sql.SQLOutput;

public class Teacher extends Employee {

    int num = 2;

    @Override
    public void method() {
        super.method();
        System.out.println("教师方法！");
    }

    public void show() {
        int num = 3;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

}
