package learTest1;
import java.net.*;

class TestInetAddress{
    public static void main(String []args){
        try {
            InetAddress address = InetAddress.getByName("www.sust.enu.cn");
            System.out.println(""+address);
            InetAddress add=InetAddress.getLocalHost();
            System.out.println("本机名称"+add.getHostName() );
            System.out.println("本机IP地址"+add.getHostAddress());
        }catch (Exception e){
            System.out.println("链接问题");
        }
    }
}