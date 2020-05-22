package reacher.set.hashSet;

import java.util.HashSet;

public class Demo01 {

    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("Adam", 20);
        Person p2 = new Person("Adam", 21);
        Person p3 = new Person("Adam", 20);
        Person p4 = new Person("Reacher", 20);

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }

}
