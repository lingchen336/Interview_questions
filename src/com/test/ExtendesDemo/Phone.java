package com.test.ExtendesDemo;

public class Phone {
    static{
        System.out.println("静态代码执行！！");
        System.out.println("====================");
    }
    public void show(){
        System.out.println("打电话");
        System.out.println("发短信");
        System.out.println("显示来电号码！！");
    }
    public void call(){
        System.out.println("callcallcall!!!!!!");
    }
//    ===========构造方法===============================
    public Phone(){
        System.out.println("父类构造方法");
    }

}
