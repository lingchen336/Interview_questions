package com.test.algorithm.jianzhi;

/*
给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。

 */

class O_46 {
    public int translateNum(int num) {
        int a=1,b=1,c=0;
        String s=String.valueOf(num);
        if(s.length()<2)return 1;
        for (int i = 2; i <=s.length() ; i++) {
            String temp=s.substring(i-2,i);
            c=temp.compareTo("10")>=0&& temp.compareTo("25")<=0?a+b:a;
            b=a;
            a=c;
        }
        return a;
    }
}