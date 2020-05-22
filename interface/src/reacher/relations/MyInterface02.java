package reacher.relations;

public interface MyInterface02 {

    public abstract void method02();

    public abstract void methodCommon();

    public default void methodDefault() {
        System.out.println("02");
    }


}
