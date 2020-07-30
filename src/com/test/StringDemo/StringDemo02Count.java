package com.test.StringDemo;
import java.util.Scanner;
/*
题目：键盘输入一个字符串，并且统计其中各种字符出现的次数。
种类有：大写字母、小写字母、数字、其它

分析：
1、从键盘输入一个字符串String,arr.nextLine();
2、遍历字符串，char[],toCharArray(),for
3、定义四个变量，识别字符种类，统计结果赋给四个变量
 */
public class StringDemo02Count {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String arr=sc.nextLine();
        int a=0,b=0,c=0,d=0;
        for (int i = 0; i <arr.length() ; i++) {
            if(arr.charAt(i)>='0'&&arr.charAt(i)<='9')a++;
            else if (arr.charAt(i)>='a'&&arr.charAt(i)<='z')b++;
            else if(arr.charAt(i)>='A'&&arr.charAt(i)<='Z')c++;
            else d++;
        }
        System.out.println("数字的个数是："+a+"小写字母的个数是："+b+"大写字母的个数是："+c+"其它类型字母的个数是："+d);
    }
}
