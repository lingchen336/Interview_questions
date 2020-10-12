package com.test.temp;
/*
字符串最长子序列
 */
import java.util.*;

public class Al_23{
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.print(findMaxSubstr(s));
            System.out.println();
        }
    }
    public static String findMaxSubstr (String str) {
        // write code here
        StringBuilder sb=new StringBuilder();//中间变量
        int i=0;
        StringBuilder s=new StringBuilder();//最终结果
        int len= str.length();
        if(len==0)return "";
        int n=0;
        sb.append(str.charAt(0));
        s.append(str.charAt(0));
        for (int k = 1; k <len ; k++) {
            String temp=String.valueOf(str.charAt(k));
            if((n=sb.indexOf(temp))!=-1&&!temp.equals(" ")){
                sb=new StringBuilder(str.substring(i+n+1,k));
                i=n+1;
            }
            sb.append(temp);
            if(sb.length()>s.length())s=sb;
        }
        return s.toString();
    }
}