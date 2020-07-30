package com.test.Serializable;

/*
序列化：
    保存(持久化)对象及其状态到内存或者磁盘
    在 JVM 停止运行之后能够保存(持久化)指定的对象，并在将来重新读取被保存的对象
static 关键字：被static修饰的成员变量不能被序列化，序列化的都是对象。被static修饰的变量在序列化对象中有默认值
transient 关键字：瞬态关键字，功能等同于static
    当不希望成员变量被序列化且不希望它为static时，用transient关键字
 */
import java.io.IOException;
import java.util.ArrayList;
import domain.Person;
import java.io.*;

/*
题目：序列化集合
      当我们想在文件中保存多个对象时，可以把多个对象存储到一个集合里，对集合进行序列化和反序列化
分析：
    1.定义一个存储Person类的ArrayList集合
    2.往ArrayList集合里存储Person对象
    3.创建一个序列化流ObjectOutputStream对象
    4.使用ObjectOutputStream对象中的writeObject对集合进行序列化
    5.创建一个反序列化ObjectInputStream对象
    6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
    7.把Object类型的集合转换为ArrayList类型
    8.遍历ArrayList集合
    9.释放资源
 */
public class SerializableDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        1.定义一个存储Person类的ArrayList集合
        ArrayList<Person> arr=new ArrayList<>();
//        2.往ArrayList集合里存储Person对象
        arr.add(new Person("娜扎",18));
        arr.add(new Person("热巴",19));
        arr.add(new Person("冰冰",20));
//        3.创建一个序列化流ObjectOutputStream对象
        ObjectOutputStream ooo=new ObjectOutputStream(new FileOutputStream("serializable1.txt"));
//        4.使用ObjectOutputStream对象中的writeObject对集合进行序列化
        ooo.writeObject(arr);
//        5.创建一个反序列化ObjectInputStream对象
        ObjectInputStream inp=new ObjectInputStream(new FileInputStream("serializable1.txt"));
//        6.使用ObjectInputStream对象中的方法readObject读取文件中保存的集合
        Object o = inp.readObject();
//        7.把Object类型的集合转换为ArrayList类型
        ArrayList<Person > list=(ArrayList<Person > )o ;
//        8.遍历ArrayList集合
        for (Person p : list) {
            System.out.println(p);
        }
//        9.释放资源
        inp.close();
        ooo.close();
    }
}
