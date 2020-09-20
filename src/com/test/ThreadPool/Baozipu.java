package com.test.ThreadPool;
/*
生产者（包子铺）类：是一个线程类，可以继承Thread
    设置线程任务：(run)：生产包子
    对包子状态进行判断
        true:有包子
            包子铺调用wait方法进入等待状态
        false:没有包子
            包子铺生产包子
                交替生产两种包子 （i%2==0)
            包子铺生产好了，修改包子状态为true
            提醒吃货线程，让吃货吃包子
    注意：
        包子铺线程和包子线程关系-->通信（互斥）
        必须同时同步技术保证两个线程只能有一个再执行
        所对象必须保证唯一，可以使用包子对象作为锁对象
        包子铺和吃货的类就需要把包子对象作为参数传递近来
            1.需要在成员位置创建一个包子变量
            2.使用带参构造方法，为这个包子变量赋值。
 */
public class Baozipu extends Thread{
//                1.需要在成员位置创建一个包子变量
    private Baozi baozi;
//            2.使用带参构造方法，为这个包子变量赋值。
    public Baozipu(Baozi baozi){
        this.baozi=baozi;
    }
//    设置线程任务(run):生产包子
    @Override
    public void run() {
        int count = 0;//包子类型
        while(true){
            synchronized(baozi){
//            对包子状态进行判断
                if(baozi.flag==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//          被唤醒之后执行，包子铺生产包子，交替生产两种包子
                if(count%2==0){
                    baozi.pi="薄皮";
                    baozi.xian="三鲜";
                }else{
                    baozi.pi="冰皮";
                    baozi.xian="萝卜大肉";
                }
                count++;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//          修改包子状态true
                baozi.flag=true;
                baozi.notify();
                System.out.println("包子铺已经生产好了包子："+baozi.pi+baozi.xian+"，吃货可以开吃了！");
            }
        }
    }
}
