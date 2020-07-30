package com.test.ObjectArray;

public class DemoArray {

    public static void main(String[] args) {
        //对象数组
        Person [] arr=new Person[2];
        Person one=new Person("热巴",18);
        Person two=new Person("娜扎",19);
        //将对象的地址赋给数组
        arr[0]=one;
        arr[1]=two;

        System.out.println(arr[0].getName()+" "+arr[0].getAge());
    }
}
