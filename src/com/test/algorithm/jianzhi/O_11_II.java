package com.test.algorithm.jianzhi;

/*
写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：

F(0) = 0, F(1)= 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1
 */
class O_11_II {
    public static int fib(int n) {
        if(n == 0) return 0;
        int fn0 = 0;
        int fn1 = 1;
        int temp;
        for(int i = 2; i <= n; i++){
            temp = fn0 + fn1;
            fn0 = fn1;
            fn1 = temp% 1000000007; // 每次运算都取模 避免越界
        }
        return fn1;
    }

    public static void main(String[] args) {
        System.out.println(fib(100));
    }
}