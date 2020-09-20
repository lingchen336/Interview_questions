package com.test.buffer;

import java.util.*;

public class Bf_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(",");
        String s2=s1[0];
        String s3=s1[1];
        find(s2,s3);
    }
    public static void find(String s1,String s2){

        int x=s1.length();int y=s2.length();
        if(x==0||y==0)return ;
        List<String>list=new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
            StringBuilder sb=new StringBuilder();
            while(s2.contains(String.valueOf(s1.charAt(i)))){
                int index=s2.indexOf(s1.charAt(i));
                int k=i;
                for (int j = index; j<y&&k<x; j++,k++) {
                    if(s1.charAt(k)==s2.charAt(j)){
                        sb.append(s2.charAt(j));
                    }else break;
                }
                list.add(String.valueOf(sb));
                break;
            }
        }
        Object[] b = list.toArray();
        if(list.isEmpty())return;
        String tem= (String) b[0];
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            String ss= (String) b[i];
            if(ss.length()>tem.length()){
                tem=ss;
            }

        }
        System.out.println(tem);
    }
}
