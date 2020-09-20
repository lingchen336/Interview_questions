package learTest1;

class TestCapsulation
{
    public static void main(String[] args)
    {
        Boolean b =true;
        Byte by = 5;
        Short s = 5;
        Integer i =5;
        Long l = 5L;
        Float f =5f;
        Double d = 5d;
        Character c = '5';
        System.out.println("Boolean: " + b.toString());
        System.out.println("Byte: " + by.toString());
        System.out.println("Short: " + s.toString());
        System.out.println("Integer: " + i.toString());
        System.out.println("Long: " + l.toString());
        System.out.println("Float: " + f.toString());
        System.out.println("Double: " + d.toString());
        System.out.println("Character: " + c.toString());
        System.out.println("整数封装类的最大值："+Integer.MAX_VALUE);
        System.out.println("整数封装类的最小值："+Integer.MIN_VALUE);
    }
}