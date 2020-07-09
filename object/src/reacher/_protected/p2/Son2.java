package reacher._protected.p2;

import reacher._protected.p1.Father;

public class Son2 extends Father {
    public static void main(String[] args) {
        Father father = new Father();
        //Father与test不同包
        //father.f();

        Son2 son2 = new Son2();
        ////Father和Son2不同包，但Son2继承了Father,因此f（）可调用
        son2.f();
    }
}
