package com.test.ThreadPool;
/*
测试类：
    包涵main()方法，程序入口
    创建包子对象；
    创建包子铺线程，开启，生产包子
    创建吃货线程，开启，吃包子
 */
public class BaoziDemoTest {
    public static void main(String[] args) {
        Baozi baozi=new Baozi ();
        new Baozipu(baozi).start();
        new ChiHuo(baozi).start();
    }
}
