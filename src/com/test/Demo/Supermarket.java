package com.test.Demo;

public class Supermarket extends Thread {
    Youtiao youtiao;

    public Supermarket(Youtiao youtiao) {
        this.youtiao = youtiao;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (youtiao) {
                try {
                    if (youtiao.flag==false) {
                        youtiao.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                System.out.println("商店正在卖油条！");
                try {
                    sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("油条卖光了！");
                youtiao.notify();
                System.out.println("请开始生产油条！");
            }
        }
    }
}