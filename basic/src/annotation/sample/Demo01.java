package annotation.sample;

/*
* * 案例：使用注解的框架

* */

/*
* 框架类
*   前提：不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
* */

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "annotation.sample.DemoClass01", methodName = "show")
public class Demo01 {

    public static void main(String[] args) throws Exception {
        //1.解析注解
        //1.1获取该类的字节码文件对象
        Class<Demo01> demo01Class = Demo01.class;
        //2.获取上边的注解对象
        //其实就是在内存中生成了一个该注解接口的子类的实现对象
        /*
        * 内存中做的事相当于以下：
        *   public class ProImpl implement Pro{
        *       public String className() {
        *           return "package annotation.sample.DemoClass01"
        *       }
        *       public String methodName() {
        *           return "show"
        *       }
        *   }
        * */
        Pro an = demo01Class.getAnnotation(Pro.class);
        //3.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();

        //加载该类进内存
        Class<?> aClass = Class.forName(className);
        //创建对象
        Object obj = aClass.getDeclaredConstructor().newInstance();
        //获取方法对象
        Method method = aClass.getMethod(methodName);
        //执行对象
        method.invoke(obj);
    }

}
