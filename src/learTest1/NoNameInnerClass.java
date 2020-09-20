package learTest1;
/*
匿名内部类方式实现线程创建
    匿名：没有名字
    内部类：写在其它类内部的类
    作用：简化代码
        把子类继承父类，重写负累的方法，创建子类对象合为一步进行
        把实现类实现类接口，重写接口中的方法，创建实现类对象合成一部完成
    格式：
        new 父类、接口(){
            重复父类、接口中的方法
        }；
 */
public class NoNameInnerClass {
    public static void main(String[] args) {
        //继承Thread类 new Thread().start();
        new Thread(){
            @Override
            public void run (){
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"P315");
                }
            }
        }.start();

        //实现Runnable接口  Runnable r=new RunnableImpl()

        Runnable r=new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"程序");
                }
            }
        };
        new Thread(r).start();

        //简化接口的方式
        new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName()+"优秀的");
                }
            }
        }).start();
    }
}
