package com.test.ObjectArray;

public class DemoArray {

    public static void main(String[] args) {
        //��������
        Person [] arr=new Person[2];
        Person one=new Person("�Ȱ�",18);
        Person two=new Person("����",19);
        //������ĵ�ַ��������
        arr[0]=one;
        arr[1]=two;

        System.out.println(arr[0].getName()+" "+arr[0].getAge());
    }
}
