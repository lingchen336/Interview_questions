package  com.test;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        String s1="http://www.";
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean b=es(s);
        System.out.println(b);
    }
   static boolean es(String s){
        String s1="http://www.";
        String s2="www.";
        boolean f1,f2,f3;
       int length = s.length();
       if(s.length()<5){
           return false;
       }
       if(s.charAt(0)=='h'&&s.length()>15){
           if(s.substring(0,11).equals(s1)){
               int i=s.indexOf(".",11);
               if(s.substring(i+1,i+4).equals("com"))
                   return true;
           }
       }else if(s.charAt(0)=='w'&&length<=8){
           if(s.substring(0,4).equals(s2)){
               int i = s.indexOf(".",4);
               if(s.substring(i+1,i+4).equals("com"))return true;
           }
       }else {
           int i = s.indexOf(".");
           if(s.substring(i+1,i+4).equals("com"))return true;
       }

       return false;
    }

}

/*
给定一个string，猜测是不是url。

isUrl("http://www.baidu.com"); //true
isUrl("http://www.baidu.com?query=神策数据"); //true
isUrl("abcd");// false
 */