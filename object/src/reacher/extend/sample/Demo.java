package reacher.extend.sample;

import javax.swing.*;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
        Manager manager = new Manager(100);
        Member m1 = new Member(0);
        Member m2 = new Member(0);
        Member m3 = new Member(0);

        System.out.println(manager.getMoney());
        System.out.println(m1.getMoney());
        System.out.println(m2.getMoney());
        System.out.println(m3.getMoney());

        System.out.println("---------------");

        ArrayList<Integer> list = manager.send(50, 3);

        m1.receive(list);
        m2.receive(list);
        m3.receive(list);

        System.out.println(manager.getMoney());
        System.out.println(m1.getMoney());
        System.out.println(m2.getMoney());
        System.out.println(m3.getMoney());
    }

}
