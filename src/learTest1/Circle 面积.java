package learTest1;

class Circle{
    static double pi;
    double radius;
    Circle(double radius) {
        this.radius=radius;
    }
     double computeArea(){
        return pi*radius*radius;
    }
}
class Test1{
    public static void main(String [] args){
        Circle.pi=3.14;
        Circle a,b;
        a=new Circle(6.5);
        b=new Circle(10.5);
        System.out.println(a.computeArea());
        System.out.println(b.computeArea());
    }
}