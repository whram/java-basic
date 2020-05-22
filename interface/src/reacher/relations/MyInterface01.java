package reacher.relations;

public interface MyInterface01 {

    public abstract void method01();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("01");
    }

}
