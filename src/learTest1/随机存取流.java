package learTest1;

import java.io.*;
class 随机存取流
{
    public static void main(String[] args)
    {
        try{
            RandomAccessFile raf2 = new RandomAccessFile("lianxi1.txt", "rw");
            String s1,s2;
            for(int i=0;i<2;i++)
            {
                s1=raf2.readLine();
                s2=new String(s1.getBytes("iso-8859-1"),"GBK");//转换为国标读取 （源程序国标为：“iso-8859-1”）
                System.out.println(s2);
            }
            raf2.seek(raf2.length());
            raf2.write("\r\n你好！".getBytes("GBK"));
            raf2.close();

        }catch(FileNotFoundException ioe){
            System.out.println(ioe);
        }
        catch(IOException ioe){
            System.out.println(ioe);
        }
    }
}