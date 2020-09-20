package com.test.ThreadPool;
/*
�����ߣ��Ի����ࣺ��һ���߳��࣬���Լ̳�Thread
    �����߳�����run)�԰���
    �԰��ӵ�״̬�����ж�
        false:û�а���
            �Ի�����wait��������ȴ�״̬
        true:�а���
            �Ի��԰���
            �Ի��������
            �޸İ���״̬Ϊfalse
            ���Ѱ������̣߳���������
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
//              �Ի�������� �޸İ���״̬false
                System.out.println("�Ի����ڳ�"+baozi.pi+baozi.xian+"�İ���");
//              �޸İ���״̬false
                baozi.flag=false;
//              ���Ѱ����̽���
                baozi.notify();
                System.out.println("�Ի��Ѿ���"+baozi.pi+baozi.xian+"���ӳ����ˣ������̿�ʼ��������");
                System.out.println("======================================");

            }
        }
    }
}
