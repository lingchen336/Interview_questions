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

                System.out.println("�̵�������������");
                try {
                    sleep(300);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println("���������ˣ�");
                youtiao.notify();
                System.out.println("�뿪ʼ����������");
            }
        }
    }
}