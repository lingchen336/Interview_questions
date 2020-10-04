package com.test.algorithm.jianzhi;

/*
我们把只包含质因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
1 是丑数。
n 不超过1690。
 */


class O_49 {
    public int nthUglyNumber(int n) {
        int a=0,b=0,c=0;
        int dp[]=new int[n];
        dp[0]=1;
        for (int i = 1; i < n; i++) {
            int n2=2*dp[a],n3=3*dp[b],n5=5*dp[c];
            int x=Math.min(Math.min(n2,n3),n5);
            if(x==n2)a++;
            if(x==n3)b++;
            if(x==n5)c++;
            dp[i]=x;
        }
        return dp[n-1];
    }
}
