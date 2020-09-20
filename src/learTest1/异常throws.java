package learTest1;

import java.util.*;
class TriangleMinusLengthException extends Exception

{
    String name;
    public TriangleMinusLengthException(String str)

    {
        name = str;
    }
    public String toString()

    {
        return name;
    }
}
class TriangleUnequationException extends Exception

{
    String name;
    public TriangleUnequationException(String str)

    {
        name = str;
    }
    public String toString()

    {
        return name;
    }
}

class TestAllException

{
    public static double calculateArea(double a, double b, double c) throws TriangleMinusLengthException, TriangleUnequationException

    {
        if (a<0 || b<0 || c<0)
            throw new TriangleMinusLengthException("负边长异常");
        if (a+b<c || a+c<b || b+c<a)
            throw new TriangleUnequationException("不满足三角不等式异常");
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public static void main(String[] args)

    {
        try{
            Scanner reader=new Scanner(System.in);
            System.out.println("请输入三角形的边长：");
            double a = reader.nextDouble();
            double b = reader.nextDouble();
            double c = reader.nextDouble();
            double s = calculateArea(a, b, c);
            System.out.println("边长为" + a + ","+ b + "," + c + "的三角形面积是" + s);
            reader.close();
        } catch(InputMismatchException e2){
            System.out.println("输入的参数必须是数字！");
        } catch(TriangleMinusLengthException e3){
            System.out.println("边长不能是负数");
        } catch(TriangleUnequationException e4){
            System.out.println("边长必须满足三角不等式");
        }
    }
}