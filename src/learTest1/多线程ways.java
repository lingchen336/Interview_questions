package learTest1;
/*
�������߳����ַ�ʽ��
    1.�̳�Thread��      class * extends Thread
    2.ʵ��Runnable�ӿ�  class * implements Runnable  �ýӿ�ֻ��run����

    ���ַ�ʽ���𲻴󣬶���Ҫnew Thread() ��дrun()���� �����߳�start()
ʵ��Runnable�ӿڴ������̵߳ĺô���
    1.�����˵��̳еľ�����
    2.��ǿ�˳������չ�ԣ������˳���������
        ʵ��Runnable�ӿڵķ�ʽ���������߳�����Ϳ������߳̽����˷��루���
 */
class Work implements Runnable{
    Thread zhangworker,wangworker,boss;
    Work(){
        boss=new Thread(this);
        boss.setName("�ϰ�");
        zhangworker=new Thread(this);
        zhangworker.setName("�Ź�");
        wangworker=new Thread(this);
        wangworker.setName("����");
    }
    @Override
    public void run(){
        int i=0,j=0;
        if(Thread.currentThread()==zhangworker){
            while(true){

                try {
                    i++;
                    System.out.println("�Ź��Ѿ�����" + i + "��ƻ��");
                    if(i==3)return;
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    System.out.println("�ϰ����Ź���������");
                }
            }
        }
        else if(Thread.currentThread()==wangworker) {
            while (true) {
                try {

                    j++;
                    System.out.println("�����Ѿ�����" + j + "��ƻ��");
                    if (j == 3) return;
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("�ϰ���������������");
                }
            }
        }
        else if(Thread.currentThread()==boss){
            while(true){
                wangworker.interrupt();
                zhangworker.interrupt();
                if(!(wangworker.isAlive()||zhangworker.isAlive())){
                    System.out.println("�ϰ�˵���°��ˣ�");
                    return;
                }
            }
        }
    }
}


class  ���߳�ways {
    public static void main(String []args){
        Work work=new Work();
        work.zhangworker.start();
        work.wangworker.start();
        work.boss.start();
    }
}