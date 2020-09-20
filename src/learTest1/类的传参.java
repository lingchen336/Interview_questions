package learTest1;//本程序证明 方法传参无法改变类成员变量的值 方法传对象可以改变类中对象的值

class Exchange {
    int a, b;

    void exchange(int a, int b) {
        this.a = a;
        this.b = b;
        int temp = this.a;
        this.a = this.b;
        this.b = temp;
    }
    void exchange(Exchange u) {
        u.a = a;
        u.b = b;
        int temp = u.a;
        u.a = u.b;
        u.b = temp;
    }
}
    class Test2{
        public static void main(String [] args){
            int x,y;        //存储在栈中
            x=10;y=20;
            // 传参数
            System.out.println("交换前"+x+" "+y);
            Exchange test=new Exchange();   //堆内存中开辟空间，栈中存储的是Exchange的地址
            test.exchange(x,y);         //改变堆内存中的值
            System.out.println("交换后"+x+" "+y);

            //对象作为参数传递
            test.a=10;test.b=20;
            test.exchange(test);
            System.out.print("传递后"+test.a+" "+test.b);
        }
    }

