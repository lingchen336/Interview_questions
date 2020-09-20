package com.test.ThreadPool;
/*
�����ߣ������̣��ࣺ��һ���߳��࣬���Լ̳�Thread
    �����߳�����(run)����������
    �԰���״̬�����ж�
        true:�а���
            �����̵���wait��������ȴ�״̬
        false:û�а���
            ��������������
                �����������ְ��� ��i%2==0)
            �������������ˣ��޸İ���״̬Ϊtrue
            ���ѳԻ��̣߳��óԻ��԰���
    ע�⣺
        �������̺߳Ͱ����̹߳�ϵ-->ͨ�ţ����⣩
        ����ͬʱͬ��������֤�����߳�ֻ����һ����ִ��
        ��������뱣֤Ψһ������ʹ�ð��Ӷ�����Ϊ������
        �����̺ͳԻ��������Ҫ�Ѱ��Ӷ�����Ϊ�������ݽ���
            1.��Ҫ�ڳ�Աλ�ô���һ�����ӱ���
            2.ʹ�ô��ι��췽����Ϊ������ӱ�����ֵ��
 */
public class Baozipu extends Thread{
//                1.��Ҫ�ڳ�Աλ�ô���һ�����ӱ���
    private Baozi baozi;
//            2.ʹ�ô��ι��췽����Ϊ������ӱ�����ֵ��
    public Baozipu(Baozi baozi){
        this.baozi=baozi;
    }
//    �����߳�����(run):��������
    @Override
    public void run() {
        int count = 0;//��������
        while(true){
            synchronized(baozi){
//            �԰���״̬�����ж�
                if(baozi.flag==true){
                    try {
                        baozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
//          ������֮��ִ�У��������������ӣ������������ְ���
                if(count%2==0){
                    baozi.pi="��Ƥ";
                    baozi.xian="����";
                }else{
                    baozi.pi="��Ƥ";
                    baozi.xian="�ܲ�����";
                }
                count++;
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//          �޸İ���״̬true
                baozi.flag=true;
                baozi.notify();
                System.out.println("�������Ѿ��������˰��ӣ�"+baozi.pi+baozi.xian+"���Ի����Կ����ˣ�");
            }
        }
    }
}
