package reflect;

import domain.Person;
import domain.Student;

public class ReflectDemo01 {

    /*
    * 获取Class对象的方式：
		1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
			* 多用于配置文件，将类名定义在配置文件中。读取文件，加载类
		2. 类名.class：通过类名的属性class获取
			* 多用于参数的传递
		3. 对象.getClass()：getClass()方法在Object类中定义着。
			* 多用于对象的获取字节码的方式
			*
	* Class对象功能：
		* 获取功能：
			1. 获取成员变量们
				* Field[] getFields() ：获取所有public修饰的成员变量
				* Field getField(String name)   获取指定名称的 public修饰的成员变量

				* Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
				* Field getDeclaredField(String name)
			2. 获取构造方法们
				* Constructor<?>[] getConstructors()
				* Constructor<T> getConstructor(类<?>... parameterTypes)

				* Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
				* Constructor<?>[] getDeclaredConstructors()
			3. 获取成员方法们：
				* Method[] getMethods()
				* Method getMethod(String name, 类<?>... parameterTypes)

				* Method[] getDeclaredMethods()
				* Method getDeclaredMethod(String name, 类<?>... parameterTypes)

			4. 获取全类名
				* String getName()
    * */

    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")
        Class c1 = Class.forName("domain.Person");
        System.out.println(c1);

        //2. 类名.class
        Class<Person> c2 = Person.class;
        System.out.println(c2);

        //3. 对象.getClass()
        Person person = new Person();
        Class c3 = person.getClass();
        System.out.println(c3);

        /*
        * * 结论：
			同一个字节码文件(*.class)在一次程序运行过程中，只会被加载一次，不论通过哪一种方式获取的Class对象都是同一个。
        * */
        System.out.println(c1 == c2);
        System.out.println(c1 == c3);

        Class<Student> cs = Student.class;
        System.out.println(cs == c1);
    }

}
