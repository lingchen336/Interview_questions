package com.test.algorithm.jianzhi;
/*
请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如，把 9表示成二进制是 1001，有 2 位是 1。因此，如果输入 9，则该函数输出 2

>>>无符号右移
 */
public class O_15 {
    public int hammingWeight(int n) {
        int res=0;
        while (n!=0){
            res+=n&1;
            n>>>=1;
        }
        return res;
    }
}
