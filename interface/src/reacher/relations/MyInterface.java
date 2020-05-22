package reacher.relations;

public interface MyInterface extends MyInterface01, MyInterface02 {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
