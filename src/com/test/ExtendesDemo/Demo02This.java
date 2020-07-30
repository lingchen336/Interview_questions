package com.test.ExtendesDemo;
/*
super关键字用来访问父类内容，而this关键字用来访问本类内容。

1、在本类的成员方法中，访问本类的成员变量。
2.在本类的成员方法中访问本类的成员方法。
3、在本类的构造方法中访问本类的另一个构造方法。
    A:　this（...)调用也必须是构造方法的第一个语句，唯一一个。
    B:　this与super不能同时出现
 */
public class Demo02This extends Demo02Ｔest {
        int num=super.n;
    public Demo02This(){
        this(123);
    }
    public Demo02This(int n){
        System.out.println("this is "+n);
    }
    public  void supergrils() {
        int num=10;
        System.out.println(num);
        System.out.println("fanbingbing大美女分割线！！");
        System.out.println(this.num);
    }
}
