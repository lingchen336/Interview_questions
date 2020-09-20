package com.test.ThreadPool;
/*
消费者（吃货）类：是一个线程类，可以继承Thread
    设置线程任务（run)吃包子
    对包子的状态进行判断
        false:没有包子
            吃货调用wait方法进入等待状态
        true:有包子
            吃货吃包子
            吃货吃完包子
            修改包子状态为false
            唤醒包子铺线程，生产包子
 */
public class ChiHuo extends Thread {
    private Baozi baozi;
    public ChiHuo(Baozi baozi ){
        this.baozi=baozi;
    }
    @Override
    public void run() {
        while(true){
            synchronized(baozi){
                if(baozi.flag==false){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//              吃货吃完包子 修改包子状态false
                System.out.println("吃货正在吃"+baozi.pi+baozi.xian+"的包子");
//              修改包子状态false
                baozi.flag=false;
//              唤醒包子铺进程
                baozi.notify();
                System.out.println("吃货已经把"+baozi.pi+baozi.xian+"包子吃完了，包子铺开始生产包子");
                System.out.println("======================================");

            }
        }
    }
}
