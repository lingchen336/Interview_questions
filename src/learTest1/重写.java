package learTest1;

//下面的例子中子类中定义的increase()方法重写了父类中的increase()方法。
class SlowAdder
{
    int x = 10;
    void increase(int addend)
    {
        x += addend; //增加addend
        System.out.println("调用SlowAdder方法，变量x的值是：" + x);
    }
}
class QuickAdder extends SlowAdder
{
    int x = 100;
    void increase(int addend)
    {
        x += 2 * addend; //增加addend的两倍
        System.out.println("调用QuickAdder方法，变量x的值是：" + x);
    }
}

class TestOverride
{
    public static void main(String[] args)
    {
        SlowAdder slow = new SlowAdder();
        System.out.println("对象slow：");
        System.out.println("增加前，x的值为：" + slow.x + "；  增加后：");
        slow.increase(6);
        System.out.println();
        System.out.println("对象quick");
        QuickAdder quick = new QuickAdder();
        System.out.println("增加前，x的值为：" + slow.x + "；  增加后：");
        quick.increase(6);
    }
}