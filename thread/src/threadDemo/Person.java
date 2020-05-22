package threadDemo;

public class Person {

    private String name;

    public void method() {
        for (int i = 0; i < 3; i++) {
            System.out.println(this.name + ": " + i);
        }
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
