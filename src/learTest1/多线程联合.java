package learTest1;

class JoinThread implements Runnable
{
    Thread �˻�˾��,װ�˹�,�ֿ����Ա;
    String step[]={"�򿪳���","���շ�����","�ҵ�","������","����"};
    JoinThread()
    {
        �˻�˾��=new Thread(this);
        װ�˹�=new Thread(this);
        �ֿ����Ա=new Thread(this);

        �˻�˾��.setName("�˻�˾��");
        װ�˹�.setName("װ�˹�");
        �ֿ����Ա.setName("�ֿ����Ա");
    }
    public void run()
    {
        if(Thread.currentThread()==�˻�˾��)
        {
            System.out.println(�˻�˾��.getName()+"��"+װ�˹�.getName()+"װ��");
            try{
                װ�˹�.join();
            } catch(InterruptedException e) { }
            for(int i=0;i<step.length;i++)
            {
                System.out.println(�˻�˾��.getName()+step[i]);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ee){ }
            }
        }
        else if(Thread.currentThread()==װ�˹�)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ee){ }
            System.out.println(װ�˹�.getName()+"��"+�ֿ����Ա.getName()+"����");
            try{
                �ֿ����Ա.join();
            }catch(InterruptedException e){ }
            for(int i=1;i<=10;i++)
            {
                System.out.println(װ�˹�.getName()+"���˵�"+i+"����ﵽ����");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ee){ }
            }
        }
        else if(Thread.currentThread()==�ֿ����Ա)
        {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){ }
            for(int i=1;i<=5;i++)
            {
                System.out.println(�ֿ����Ա.getName()+"�򿪵�"+i+"����") ;
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){ }
            }
        }
    }
}
class JoinExample
{
    public static void main(String args[])
    {
        JoinThread  a=new JoinThread();
        a.�˻�˾��.start();
        a.װ�˹�.start();
        a.�ֿ����Ա.start();
    }
}

