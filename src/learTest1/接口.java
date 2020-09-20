package learTest1;//本程序体现接口的实现方式，多继承（多态）

interface 发光体{
    void shine();
}
class 白炽灯 implements 发光体{
    public void shine(){
        System.out.println("发出黄光");
    }
}
class 日光灯 implements 发光体{
    public void shine(){
        System.out.println("发出白色荧光");
    }
}
class TestInterface{
    public static void use(发光体 fgt){ //应用发光体
        System.out.println("安装发光体"); //先安装
        fgt.shine(); //发光体开始工作
    }
    public static void main(String[] args){
        白炽灯 bcd = new 白炽灯(); //可以看作买了一盏白炽灯
        System.out.println("买了一盏白炽灯");
        use(bcd); //应用白炽灯
        System.out.println();
        日光灯 rgd = new 日光灯(); //可以看作买了一盏日光灯
        System.out.println("买了一盏日光灯");
        use(rgd); //应用日光灯
    }
}

