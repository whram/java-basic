package reflect.sample;

/*
* * 案例：
		* 需求：写一个"框架"，不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
			* 实现：
				1. 配置文件: pro.properties
				2. 反射
			* 步骤：
				1. 将需要创建的对象的全类名和需要执行的方法定义在配置文件中
				2. 在程序中加载读取配置文件
				3. 使用反射技术来加载类文件进内存
				4. 创建对象
				5. 执行方法
* */

/*
* 框架类
*   前提：不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
* */

import domain.Person;
import domain.Student;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {

    public static void main(String[] args) throws Exception {
        //加载配置文件
        //1.创建Properties对象
        Properties pro = new Properties();
        //2.加载配置文件，转换为一个集合
        //获取class目录下的配置文件
        ClassLoader classLoader = Demo01.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        //加载该类进内存
        Class<?> aClass = Class.forName(className);
        //创建对象
        Object obj = aClass.newInstance();
        //获取方法对象
        Method method = aClass.getMethod(methodName);
        //执行对象
        method.invoke(obj);


    }

}
