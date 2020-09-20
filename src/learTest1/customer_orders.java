package learTest1;

class Customer {
    private String name,address,telephone;//姓名 地址 电话
    private float balance;  //余额
    private Order[] orders; //订单
    void setAddress (String address){
        this.address=address;
    }
    String getAddress(){
        return address;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setTelephone(String telephone){
        this.telephone=telephone;
    }
    String getTelephone(){
        return telephone;
    }
    void setBalance(float balance){
        this.balance=balance;
    }
    float getBalance(){
        return balance;
    }
    Boolean addOrder(Order order){
        if(orders==null){       //添加新订单
            orders=new Order[20];
        }
        for(int i=0;i<orders.length;i++){
            if(orders[i]==null){
                orders[i]=order;
                return true;
            }
        }
        return false;
    }
    Order getOrder(){
        if(orders==null)return null;
        Order temp_order;
        for(int i=0;i<orders.length;i++){
            if(orders[i]!=null){
                temp_order=orders[i];
                orders[i]=null;
                return temp_order;
            }
        }return null;
    }
}
class Order{
    private Customer receiver;
    private Item[] items;   //商品信息
}
class Item{
    private Merchandise item;   //商品信息
    private int quantity;   //数量
}
class Merchandise {
    private String name;    //商品名称
    private String code;    //商品编号
    private String price;      //商品价格
}


class custrom_orders {
    public static void main(String [] args){

        Customer customerTest1=new Customer();
        Customer customerTesr2=new Customer();
        Order or1=null;
        Order or2=null;
        //设置顾客基本信息
        customerTest1.setName("Xin Feng");
        customerTest1.setAddress("#2008 Nan Road");
        customerTest1.setTelephone("242-35345");
        customerTest1.setBalance(15.33f);
        customerTest1.addOrder(null);


        System.out.println(customerTest1.getName());
        System.out.println(customerTest1.getAddress());
        System.out.println(customerTest1.getTelephone());
        System.out.println(customerTest1.getBalance());
        System.out.println(customerTest1.getOrder());
    }

}
