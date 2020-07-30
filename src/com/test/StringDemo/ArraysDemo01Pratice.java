package com.test.StringDemo;
import java.util.*;
/*
题目：
请使用Arrays相关的API，将一个素以及字符串中的所有字符升序排列，并倒序打印。

分析：
1、输入一个字符串，String
2、必须是数组才能使用sort升序排列 toCharArray
3、for循环倒序输出
 */
public class ArraysDemo01Pratice {
    public static void main(String[] args) {
        Scanner dc =new Scanner(System.in);
        String arr=dc.nextLine();
        char[] chars=arr.toCharArray();
        System.out.println(arr);
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]+" ");
        }

        System.out.println();

        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]+" ");
        }
    }
}
