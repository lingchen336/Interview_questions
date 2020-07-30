package com.test.ExtendesDemo;

public class NewPhone extends Phone {
    @Override       //覆盖重写
    public void show(){
        super.show();
        System.out.println("显示图像");
        System.out.println("显示姓名");
        super.call();
    }

    //    ===========构造方法===============================
    public NewPhone(){
//        super();//调用父类无参构造方法 默认进行
        System.out.println("子类构造方法");

    }
}
