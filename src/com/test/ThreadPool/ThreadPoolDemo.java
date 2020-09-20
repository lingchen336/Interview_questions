package com.test.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
线程池：
    java.util.concurrent.Executors ：线程池的工厂类，用来生成线程池
        static ExecutorService newFixedThreadPool(int nThreads)
        创建一个线程池，该线程池重用固定数量的从共享无界队列中运行的线程。
        返回值：ExcutorService接口，返回的是ExecutorService接口的实现类对象，我们可以使用ExecutorService接口接收（面向接口编程）
    Interface ExecutorService：线程池接口
        从线程池中获取线程，调用start方法，之行线程任务
            submit(Runnable task)提交一个Runnable  任务用于执行
线程池使用步骤：
    1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
    2.创建一个类，实现Runnabke接口，重写run方法，设置线程任务
    3.调用ExecutorService中的方法submit,产地线程任务（实现类），开启线程，执行run方法
    4.调用ExecutorService中的方法shutdown销魂线程池（不建议执行）
使用线程池的优点：
    1.降低资源消耗。减少了创建和销毁线程的次数，每个工作线程都可以被重复利用，可执行多个任务。
    2.提高响应速度。当任务到达时，任务可以不需要等到线程创建就能立即执行。
 */
public class ThreadPoolDemo {
    public static void main(String[] args) {
//        1.使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool生产一个指定线程数量的线程池
        ExecutorService es= Executors.newFixedThreadPool(2);
//        3.调用ExecutorService中的方法submit,产地线程任务（实现类），开启线程，执行run方法
        es.submit(new RunnableImpl());
        es.submit(new RunnableImpl());
        es.shutdown();                      //关闭线程池，获取不到线程
        es.submit(new RunnableImpl());
    }
}
