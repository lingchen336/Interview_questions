package reflect;

import java.io.InputStream;

/*
反射：将类的各个组成部分封装为其他对象，这就是反射机制
    好处：
        1.可以在程序运行过程中，操作这些对象。
        2.可以解耦，提高程序的可扩展性。
 */
import java.lang.reflect.Method;
import java.util.Properties;

/*
需求：写一个“框架”，在不改变让任何代码的前提下，可以帮我们创建任意类的对象，并执行其中任意方法
步骤：
    1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
    2.在程序中加载读取配置文件
    3.使用反射技术来加载类配置文件进内存
    4.创建对象
    5.执行方法
 */
public class Reflect {
    public static void main(String[] args) throws Exception {
        //可以创建任意类对象，可以执行任意类方法
/*    传统方法：
        Person person=new Person();
        person.eat();
       */

//1.加载配置文件
        //1.1创建properties对象
        Properties pro=new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = Reflect.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("reflect/pro.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取对象方法
        Method method=cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);
    }
}
