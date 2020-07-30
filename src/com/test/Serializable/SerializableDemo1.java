package com.test.Serializable;

/*
���л���
    ����(�־û�)������״̬���ڴ���ߴ���
    �� JVM ֹͣ����֮���ܹ�����(�־û�)ָ���Ķ��󣬲��ڽ������¶�ȡ������Ķ���
static �ؼ��֣���static���εĳ�Ա�������ܱ����л������л��Ķ��Ƕ��󡣱�static���εı��������л���������Ĭ��ֵ
transient �ؼ��֣�˲̬�ؼ��֣����ܵ�ͬ��static
    ����ϣ����Ա���������л��Ҳ�ϣ����Ϊstaticʱ����transient�ؼ���
 */
import java.io.IOException;
import java.util.ArrayList;
import domain.Person;
import java.io.*;

/*
��Ŀ�����л�����
      �����������ļ��б���������ʱ�����԰Ѷ������洢��һ��������Լ��Ͻ������л��ͷ����л�
������
    1.����һ���洢Person���ArrayList����
    2.��ArrayList������洢Person����
    3.����һ�����л���ObjectOutputStream����
    4.ʹ��ObjectOutputStream�����е�writeObject�Լ��Ͻ������л�
    5.����һ�������л�ObjectInputStream����
    6.ʹ��ObjectInputStream�����еķ���readObject��ȡ�ļ��б���ļ���
    7.��Object���͵ļ���ת��ΪArrayList����
    8.����ArrayList����
    9.�ͷ���Դ
 */
public class SerializableDemo1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        1.����һ���洢Person���ArrayList����
        ArrayList<Person> arr=new ArrayList<>();
//        2.��ArrayList������洢Person����
        arr.add(new Person("����",18));
        arr.add(new Person("�Ȱ�",19));
        arr.add(new Person("����",20));
//        3.����һ�����л���ObjectOutputStream����
        ObjectOutputStream ooo=new ObjectOutputStream(new FileOutputStream("serializable1.txt"));
//        4.ʹ��ObjectOutputStream�����е�writeObject�Լ��Ͻ������л�
        ooo.writeObject(arr);
//        5.����һ�������л�ObjectInputStream����
        ObjectInputStream inp=new ObjectInputStream(new FileInputStream("serializable1.txt"));
//        6.ʹ��ObjectInputStream�����еķ���readObject��ȡ�ļ��б���ļ���
        Object o = inp.readObject();
//        7.��Object���͵ļ���ת��ΪArrayList����
        ArrayList<Person > list=(ArrayList<Person > )o ;
//        8.����ArrayList����
        for (Person p : list) {
            System.out.println(p);
        }
//        9.�ͷ���Դ
        inp.close();
        ooo.close();
    }
}
