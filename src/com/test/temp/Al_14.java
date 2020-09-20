package com.test.temp;

import java.util.Scanner;
/*
链接：https://www.nowcoder.com/questionTerminal/3f99492e23d9403d923e44bb1061cc86
能跳出循环为true，跳不出为false
例1：
输入数组a[5] = [1,2,3,2,5];从第一个元素开始a[0]=1,下次向后移动1位到第二个元素a[1]=2,再次向后移动2位到第四个元素a[3],因为下次向后
移动2位(a[3]=2)后,向后数组越界,即跳出数组,输出true;
 */
public class Al_14{

    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        String s=sc.nextLine().replace("[","").replace("]","").replace(",","").replace(" ","");
        System.out.println(find(s));
    }

    static boolean find(String s){
        char[] a = s.toCharArray();
        int i=0;int j=a.length;int k=0;
        while(i>=0&&i<j&&k<=j){
            if(a[i]!='-'){
                int val=a[i]-'0';
                i+=val;
            }else{
                i++;
                int val=a[i]-'0';
                i=i-val-1;
            }
            k++;

        }
        if(k>j)return false;
        else return true;

    }
}