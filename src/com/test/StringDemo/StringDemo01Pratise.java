package com.test.StringDemo;

import java.util.Scanner;

/*
题目：定义一个方法，读入数组｛1，2，3｝按照指定格式拼接成一个字符串。格式参考如下：[word1#word2#word3]。

分析：
1.首先准备一个String数组，内容【1.2.3】,nextLine():识别空格为字符串，next（）遇到空格停止读入字符串
2.定义一个方法,替换数组成分
三要素：
方法名称：toArray
返回值类型：String
参数列表：String
用到的方法：for() charAt()
 */
public class StringDemo01Pratise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String arr="";

            arr+=sc.nextLine();

        System.out.println(arr);
        String s = toArray(arr);
        System.out.println(s);
    }
    public static String toArray(String arr){
        String s="[";
        for (int i = 0; i <arr.length(); i++) {
            if(i==arr.length()-1)
                s+="word"+arr.charAt(i)+"]";
            else
            s+="word"+arr.charAt(i)+"#";
        }
        return s;
    }
}
