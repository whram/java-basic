package demo01;

/*
* 内部类：
*   将一个类的定义放在另一个类的定义的内部
* */

public class Demo01 {

    class Contents{
        private int i = 11;
        public int value() { return 1; }
    }

    class Destination {
        private String label;
        Destination(String whereTo){
            label = whereTo;
        }
        String readLabel() { return label; }
    }

    public Contents contents() { return new Contents(); }

    //在外部类的方法run（）中实例内部类并调用内部类的方法
    public void run(String dest){
        Contents contents = contents();
        Destination destination = new Destination(dest);
        System.out.println(destination.readLabel());
    }

    public static void main(String[] args) {
        Demo01 d1 = new Demo01();
        d1.run("abc");

        Demo01 d2 = new Demo01();
        //
        Demo01.Contents contents = d2.contents();
    }

}
