package learTest1;

class Daemon
{
    public static void work()
    {
        for(int i=0; i<20; i++)
        {
            System.out.println("¹¤×÷ "+i);
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
        }
    }
    public static void daemon()
    {
        while(true)
        {
            System.out.println("ÊØ»¤ ");
            try{
                Thread.sleep(100);
            }catch(InterruptedException e){}
        }
    }
}
class WorkThread extends Thread
{
    public void run()
    {
        Daemon.work();
    }
}
class DaemonThread extends Thread
{
    public void run()
    {
        Daemon.daemon();
    }
}
class TestDaemonThread
{
    public static void main(String[] args)
    {
        WorkThread workThread = new WorkThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        workThread.start();
        daemonThread.start();
    }
}