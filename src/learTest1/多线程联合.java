package learTest1;

class JoinThread implements Runnable
{
    Thread 运货司机,装运工,仓库管理员;
    String step[]={"打开车锁","把握方向盘","挂挡","踩油门","开车"};
    JoinThread()
    {
        运货司机=new Thread(this);
        装运工=new Thread(this);
        仓库管理员=new Thread(this);

        运货司机.setName("运货司机");
        装运工.setName("装运工");
        仓库管理员.setName("仓库管理员");
    }
    public void run()
    {
        if(Thread.currentThread()==运货司机)
        {
            System.out.println(运货司机.getName()+"等"+装运工.getName()+"装货");
            try{
                装运工.join();
            } catch(InterruptedException e) { }
            for(int i=0;i<step.length;i++)
            {
                System.out.println(运货司机.getName()+step[i]);
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ee){ }
            }
        }
        else if(Thread.currentThread()==装运工)
        {
            try{
                Thread.sleep(1000);
            }catch(InterruptedException ee){ }
            System.out.println(装运工.getName()+"等"+仓库管理员.getName()+"开门");
            try{
                仓库管理员.join();
            }catch(InterruptedException e){ }
            for(int i=1;i<=10;i++)
            {
                System.out.println(装运工.getName()+"搬运第"+i+"箱货物到货车");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException ee){ }
            }
        }
        else if(Thread.currentThread()==仓库管理员)
        {
            try{
                Thread.sleep(2000);
            }catch(InterruptedException e){ }
            for(int i=1;i<=5;i++)
            {
                System.out.println(仓库管理员.getName()+"打开第"+i+"道门") ;
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
        a.运货司机.start();
        a.装运工.start();
        a.仓库管理员.start();
    }
}

