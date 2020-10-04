package com.test.algorithm.jianzhi;

/*
写一个函数 StrToInt，实现把字符串转换成整数这个功能。
假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。

示例1:

输入: "42"
输出: 42

输入: "   -42"
输出: -42
解释: 第一个非空白字符为 '-', 它是一个负号。
我们尽可能将负号与后面所有连续出现的数字组合起来，最后得到 -42 。


 */

class O_67 {
    public static int strToInt(String str) {
        char s[]=str.toCharArray();
        long res=0;
        int flag=1;
        int index=0;
        if(s.length==0)return 0;

        for (int i = index; i < s.length; i++) {
            if(s[i]==' ')index++;
            else if(s[i]=='-'||s[i]=='+'){
                if(s[i]=='-') flag=-1;
                ++index;
                break;
            }
            else break;
        }

        for (int i = index; i <s.length ; i++) {
            if(!Character.isDigit(s[i]))break;
            res=res*10+s[i]-'0';
            if(res>Integer.MAX_VALUE||(res==Integer.MAX_VALUE&&s[i]>'7'))
                return flag==-1?Integer.MIN_VALUE: Integer.MAX_VALUE;
        }
        return (int)res*flag;
    }

    public static void main(String[] args) {
        String s=" 2147483648";
        int a=strToInt(s);
        System.out.println(strToInt(s));
    }
}