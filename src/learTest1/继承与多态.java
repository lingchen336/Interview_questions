package learTest1;

class A{
    int first = 100;
    int add(int x, int y)
    {
        return x+y;
    }
}
class B extends A{
    int second = 200;
    int mult(int x, int y)
    {
        return x*y;
    }
}

class TestInherit{
    public static void main(String[] args)
    {
        int x=20, y=4;
        A a = new A();
        System.out.println("父类A有属性first，其值是：" + a.first);
        B b = new B();
        System.out.println("子类B也有属性first，其值是：" + b.first);
        System.out.println("子类B还有属性second，其值是：" + b.second);
        int sumA = a.add(x, y);
        System.out.println("父类A有方法add：" + x + "+" +y + "的值是：" + sumA);
        int sumB = b.add(x, y);
        System.out.println("子类B也有方法add：" + x + "+" +y + "的值是：" + sumB);
        int product = b.mult(x, y);
        System.out.println("子类B还有方法mult：" + x + "*" +y + "的值是：" + product);
    }
}