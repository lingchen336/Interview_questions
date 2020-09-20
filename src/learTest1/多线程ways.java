package learTest1;
/*
创建多线程两种方式：
    1.继承Thread类      class * extends Thread
    2.实现Runnable接口  class * implements Runnable  该接口只有run方法

    两种方式区别不大，都需要new Thread() 重写run()方法 开启线程start()
实现Runnable接口创建多线程的好处：
    1.避免了但继承的局限性
    2.增强了程序的扩展性，降低了程序的耦合性
        实现Runnable接口的方式，把设置线程任务和开启新线程进行了分离（解耦）
 */
class Work implements Runnable{
    Thread zhangworker,wangworker,boss;
    Work(){
        boss=new Thread(this);
        boss.setName("老板");
        zhangworker=new Thread(this);
        zhangworker.setName("张工");
        wangworker=new Thread(this);
        wangworker.setName("王工");
    }
    @Override
    public void run(){
        int i=0,j=0;
        if(Thread.currentThread()==zhangworker){
            while(true){

                try {
                    i++;
                    System.out.println("张工已经搬了" + i + "箱苹果");
                    if(i==3)return;
                    Thread.sleep(10000);
                }catch (InterruptedException e){
                    System.out.println("老板让张工继续工作");
                }
            }
        }
        else if(Thread.currentThread()==wangworker) {
            while (true) {
                try {

                    j++;
                    System.out.println("王工已经搬了" + j + "箱苹果");
                    if (j == 3) return;
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    System.out.println("老板让王工继续工作");
                }
            }
        }
        else if(Thread.currentThread()==boss){
            while(true){
                wangworker.interrupt();
                zhangworker.interrupt();
                if(!(wangworker.isAlive()||zhangworker.isAlive())){
                    System.out.println("老板说：下班了！");
                    return;
                }
            }
        }
    }
}


class  多线程ways {
    public static void main(String []args){
        Work work=new Work();
        work.zhangworker.start();
        work.wangworker.start();
        work.boss.start();
    }
}