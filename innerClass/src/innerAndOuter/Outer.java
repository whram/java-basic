package innerAndOuter;

/*
* 内部类自动拥有对外围类所有成员的访问权
* 在外围类内创建一个内部类时，内部类会获取一个外围类对象的引用
* 内部类只作用于外部类中，因此在拥有外部类之前是不可能创建内部对象的
*
* */

public class Outer {
    private Object[] items;
    private int next = 0;

    //实例内部对象
    public Inner inner(){
        return new Inner();
    }

    public void add(Object x) {
        if (next < items.length){
            items[next++] = x;
        }
    }

    public void outerMethod() {
        System.out.println("outer method...");
    }

    //外部类的构造方法
    public Outer(int size) { items = new Object[size]; }

    //内部类使用外部类中的items对象
    private class Inner implements Selector{

        private int i = 0;

        //内部对象实现对外围对象的援引
        public Outer innerMethod(){
            return Outer.this;
        }

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i<items.length) i++;
        }

    }

    public static void main(String[] args) {
        Outer outer = new Outer(10);
        for (int i = 0; i < 10; i++) {
            outer.add(Integer.toString(i));
        }
        Inner inner = outer.inner();
        while (!inner.end()){
            System.out.print(inner.current() + " ");
            inner.next();
        }

        //内部对象调用外围对象的方法
        inner.innerMethod().outerMethod();

        //外部对象直接.new 内部对象，不使用inner（）方法实例内对象，但要注意Inner的访问权限
        Inner inner1 = outer.new Inner();
        inner1.innerMethod().outerMethod();

    }
}
