package learTest1;

//匿名类的使用
class Change1{
    int increase(int x){
        int y=x+1;
        return y;
    }
    int decrease(int x){
        int y=x-1;
        return y;
    }
}
class Anonymous{
    static void use(Change1 c){
        final int x=10;
        System.out.println("基础数据结果为"+x);
        int y=c.increase(x);
        System.out.println("增加后的结果"+y);
        int z=c.decrease(x);
        System.out.println("减值后的结果"+z);
    }
    public static void main(String [] args){
        use(new Change1());     //不使用匿名类
        System.out.println("使用匿名类");
        use(new Change1(){
            int increase(int x){
                int y=x+5;
                return y;
            }
        });
    }
}