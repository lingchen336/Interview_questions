package com.test.algorithm.jianzhi;
/*
实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。

思路：
如果n为负数，那么x取倒数，保证n为正数；

先判断n是否为奇数
是奇数，由于接下来还要减半，需要将多余的x累乘积到res中；
n除以2减半；
x自身相乘；
这里需要注意的是：

n为int型，取值范围为[-2^31, 2^31-1];
如果n为负数，x取倒数，n取相反数变成正数，恰如恰好x为-2^31，而其相反数2^31不在int型范围内，所以要将n转化为long型；
 */

class O_16 {
    public double myPow(double x, int n) {
        if(x==0)return 0;
        long b=n;
        if(n<0){
            b=-b;
            x=1/x;
        }
        double res=1.0;
        while(b>0){
            if((b&1)==1)res*=x;
            b>>>=1;
            x*=x;
        }
        return res;
    }
}