package com.test.ThreadPool;
//    2.����һ���࣬ʵ��Runnabke�ӿڣ���дrun�����������߳�����

public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"������һ���µ��߳�ִ��");
    }
}
