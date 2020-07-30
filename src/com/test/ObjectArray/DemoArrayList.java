package com.test.ObjectArray;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList���飺���ȿ��Ըı䣻
��ArrayList<E>��˵��<E>�����ͣ�����������Ԫ�ض���ͳһ���ͣ�
��д��toString()������

���÷�����
boolean Add(E e):���Ԫ�أ�β�壬һ����ִ�гɹ�������ֵ���ÿɲ��ã� �������ϲ�һ���ɹ���
E get(int index) :��ȡԪ�أ�������������ţ�����ֵ�Ƕ�Ӧλ�õ�Ԫ�أ�
E remove(int index):�Ӽ�����ɾ��Ԫ�أ�������������ţ�����ֵ�Ǳ�ɾ����Ԫ�أ�
int size():��ȡ���ϳ��ȣ�����ֵ�Ǽ����е�Ԫ�ظ�����
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String > list=new ArrayList<>();
//��������ĩβ���Ԫ��
        list.add("����ӱ");
        list.add("����͢");
        list.add("����");
        list.add("������");
        System.out.println(list);
//��ȡ���ϳ���
        int size=list.size();
        System.out.println(size);
//��ȡ������Ԫ��
        String get=list.get(2);
        System.out.println(get);
//ɾ��������Ԫ��
        String rm=list.remove(2);
        System.out.println(rm+list);

//���ϱ���
        //��ͨfor����
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        //��ǿfor����
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
        //Iterator���������м��ϡ����鶼��ͨ������������
        Iterator it=list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

    }
}

