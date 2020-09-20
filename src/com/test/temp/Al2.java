package com.test.temp;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
编程题
        请编写一个程序，从文件src.txt读入一篇英文短文，统计并输出该短文中不同单词出现的次数，然后输出统计结果。*/
//1.从文件中读出所有内容 FileReader
//2.用map集合接收，key=word val=times
public class Al2{
    public static void main(String[] args) throws IOException {
        File fi=new File("F:\\IDEACode\\Interview questions\\src\\lianxi2.txt");
        FileReader read=new FileReader(fi);
        Map<String ,Integer> map=new HashMap<>();
        String s="";
        int a=0;
        while((a= read.read())!=-1){
            if(Character.isLetter(a)){
                String b=String.valueOf((char)a);
                s=s+b;
            }else{
                if(!map.containsKey(s)&&!s.equals(""))
                    map.put(s,1);
                else if(!s.equals(""))map.put(s,map.get(s)+1);
                s="";
            }
        }
        if(!map.containsKey(s)&&!s.equals(""))
            map.put(s,1);
        else if(!s.equals(""))map.put(s,map.get(s)+1);

        Set<String >set=map.keySet();
        for(String key:set){
            System.out.println(key+" "+map.get(key));
        }
    }
}