package learTest1;

//下面的程序中，子类的构造方法的第一条语句使用super调用父类的构造方法。
class Father
{
    int a;
    Father()
    {
        a = 0;
    }
    Father(int givenA){
        a = givenA;
    }
}
class Son extends Father{
    int b;
    Son()
    {
        super();
        b = 0;
    }
    Son(int givenA, int givenB)
    {
        super(givenA);      //继承了Father里的单参初始化
        b = givenB;
    }
    void show()
    {
        System.out.println("a=" + a + "; b=" + b);
    }
}

class TestSuper{
    public static void main(String[] args)
    {
        Son son1 = new Son();
        System.out.println("new son():");
        son1.show();
        System.out.println();
        Son son2 = new Son(-10, +7);
        System.out.println("new son(-10, +7):");
        son2.show();
    }
}
