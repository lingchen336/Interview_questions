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
            System.out.println("���������ݣ�");
            s=reader.nextLine();    //�Ӽ����Ͻ���һ���ַ����������س���ֹ�� ����next���������ո��ֹ��
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
            System.out.println("�����������");
        }
    }
}