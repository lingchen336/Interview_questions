package learTest1;

class Single  //没有重写Object类的toString()方法
{
    int x;
    Single(int x)
    {
        this.x = x;
    }
}
class Pair
{
    int x;
    int y;
    Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()  //重写了Object类的toString()方法
    {
        String result = "x=" + x + "; y=" + y;
        return result;
    }
}
class TestToString
{
    public static void main(String[] args)
    {
        Single a = new Single(7);
        Pair b = new Pair(5, 8);
        System.out.println("Single对象a和Pair对象b的内部信息是：\n" + a + "\n" + b);
    }
}