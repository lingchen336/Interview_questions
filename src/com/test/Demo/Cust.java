package com.test.Demo;

public class Cust extends Thread{
    Youtiao youtiao;

    public Cust(Youtiao youtiao) {
        this.youtiao=youtiao;
    }

    public void Cust(Youtiao youtiao) {
        this.youtiao = youtiao;
    }
    @Override
    public void run() {
        while (true) {
            synchronized (youtiao) {
                try {
                    if (youtiao.flag==true) {
                        youtiao.wait();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("����������");
                youtiao.flag = true;
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("������������");
                youtiao.notify();
                System.out.println("�̵�����������ˣ�");
            }
        }

    }
}
