package learTest1;

import java.io.*;
import java.util.*;

class TestFileIOt{
    public static void main(String []args){
        File f=new File("java.txt");
        try{
            FileOutputStream out=new FileOutputStream(f,true);
            Scanner reader =new Scanner(System.in);
            String s="";
            System.out.println("请输入内容：");
            s=reader.nextLine();    //从键盘上接收一个字符串，遇到回车截止（ 方法next（）遇到空格截止）
            while(!s.equals("finish")){
                byte[] c=s.getBytes();
                out.write(c);
                out.write((int)'\r');
                out.write((int)'\n');
                s=reader.nextLine();
            }
            reader.close();
            out.close();
            FileInputStream in =new FileInputStream(f);
            int a ;
            while((a=in.read())!=-1){
                System.out.print((char)a);

            }
            in.close();

        }catch(IOException ioe){
            System.out.println("输入输出错误！");
        }
    }
}