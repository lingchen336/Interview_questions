package learTest1;

import java.util.*;

class TestPackage
{
    public static void main(String[] args)
    {
        Scanner reader=new Scanner(System.in);
//        Calculate triangle=new Calculate();
        System.out.println("请输入三角形的边长：");
        double a = reader.nextDouble();
        double b = reader.nextDouble();
        double c = reader.nextDouble();
//        double s = triangle.calculateArea(a, b, c);
        reader.close();
//        System.out.println("边长为"+a+","+b+","+c+"的三角形面积是"+s);
    }
}