package com.test.temp;
//-Xms1m -Xmx8m -XX:+HeapDumpOnOutOfMemoryError 通过Dump进行优化判断

//-Xms 设置初始化内存分配大小，默认1/64
//-Xmx 设置最大分配内存，默认1/4
//-XX:+ProntGCDetials 打印GC垃圾回收信息
import java.util.ArrayList;

public class JVM1 {
    public static class A{
        public  int age;
    }
    byte [] arry=new byte[1024*1024];
    public static void main(String[] args){
        ArrayList<JVM1> lsit=new ArrayList<>();
        int count=0;

        try{
            while (true){
                lsit.add(new JVM1());
                count+=1;
            }
        }catch (Error error){
            System.out.println("count:"+count);
            error.printStackTrace();
        }

    }
}

