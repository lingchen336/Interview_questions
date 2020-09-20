package com.test.temp;
/*
从文件中读取字符创，每行一串，排序后写到文件out.txt中
 */

import java.io.*;
import java.util.*;

public class Al_15{

    public static void main(String[] args) throws IOException {
        File fi=new File("F:\\IDEACode\\Interview questions\\src\\lianxi2.txt");
        File fo=new File("F:\\IDEACode\\Interview questions\\src\\java.txt");
        StringBuilder sb=new StringBuilder();

        BufferedWriter bw=new BufferedWriter(new FileWriter(fo,true));
        BufferedReader bf=new BufferedReader(new InputStreamReader(new FileInputStream(fi),"GBK"));
        String s=null;
        while((s=bf.readLine())!=null){
            sb.append(s+System.lineSeparator());  //lineSeparator()换行

        }
        sb.deleteCharAt(sb.length()-1);
        String s1 = sb.toString();
        System.out.println(s1);
        bw.write(String.valueOf(sb));
        System.out.println("=========");
        List<String> list=new ArrayList<>();
        String[] split = s1.split(System.lineSeparator());
        for (int i = 0; i < split.length; i++) {
            list.add(split[i]);
        }

        bf.close();

        Collections.sort(list);
        Iterator it= list.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }


}