package learTest1;
/*
�����ڲ��෽ʽʵ���̴߳���
    ������û������
    �ڲ��ࣺд���������ڲ�����
    ���ã��򻯴���
        ������̳и��࣬��д���۵ķ�����������������Ϊһ������
        ��ʵ����ʵ����ӿڣ���д�ӿ��еķ���������ʵ�������ϳ�һ�����
    ��ʽ��
        new ���ࡢ�ӿ�(){
            �ظ����ࡢ�ӿ��еķ���
        }��
 */
public class NoNameInnerClass {
    public static void main(String[] args) {
        //�̳�Thread�� new Thread().start();
        new Thread(){
            @Override
            public void run (){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"P315");
                }
            }
        }.start();

        //ʵ��Runnable�ӿ�  Runnable r=new RunnableImpl()

        Runnable r=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"����");
                }
            }
        };
        new Thread(r).start();

        //�򻯽ӿڵķ�ʽ
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"�����");
                }
            }
        }).start();
    }
}
