package reacher._protected.p2;

import reacher._protected.p1.Son1;

public class Test {
    public static void main(String[] args) {

        Son1 son1 = new Son1();
        //Father和Test不同包，且Test未继承Father,f()不可调用,这里与Son1无关
        //son1.f();

        Son2 son2 = new Son2();
        //Father和Test不同包，且Test未继承Father,f()不可调用，这里与Son2无关
        //son2.f();
    }
}
