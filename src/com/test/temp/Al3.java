package com.test.temp;
/*在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
        如果没有则返回 -1（需要区分大小写）.（从0开始计数）*/
//1.输入一个字符串String ，
//2.遍历字符串写入map集合里 key=string val=times
// 3.遍历集合 false:-1 1：sout key;
//4.遍历String 找到key下标
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Set;

public class Al3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please input a String !");
        String s=sc.nextLine();
        Map<String ,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++){
            String  a= String.valueOf(s.charAt(i));
            if(!map.containsKey(a))
                map.put(a,1);
            else if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
        }
        Set<String >set=map.keySet();
        int flag=0;
        for(String arr:set){
            Integer in = map.get(arr);
            if(in==1){
                for(int i=0;i<s.length();i++){
                    String a= String.valueOf(s.charAt(i));
                    if(a.equals(arr)) {
                        flag=1;
                        System.out.print(i);
                        break;
                    }
                }
                break;
            }
        }
        if(flag!=1) System.out.println(-1);
    }
}