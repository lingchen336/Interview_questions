package com.test.ExtendesDemo;
/*
1.在子类NewPhone的show方法中继承父类的show方法

继承关系中，父子类构造方法的访问特点
1、子类构造方法中有一个默认隐含的"super()"调用，所以一定是先调用的父类构造，后执行子类构造
2、可以通过super关键字在子类构造中调用父类构造（默认进行父类的无参构造调用）
    重载：被重载的方法必须改变参数列表，无法以返回值类型作为重载函数的区分标准（可以修改） 修饰符可以修改
    重写：在继承关系中，方法名称一样，参数一样，返回值类型不能修改，权限修饰不能更严格（可以降低）
3、super的父类构造调用必须是子类构造方法的第一条语句，不能一个子类构造多次super构造

静态内容优先于非静态内容执行，构造方法优先于其它方法执行
当第一次用到本类时，静态代码执行唯一的一次
 */
public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.show();
        System.out.println("+++++++++++");
        NewPhone newPhone=new NewPhone();
        newPhone.show();
    }
}
