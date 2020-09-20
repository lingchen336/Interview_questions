package com.test.temp;

import java.util.*;

/**
 *  01背包问题
 *  自上而下的求解方式
 *  对于任一时刻：
 *      1.背包容量不足：ks(i,j) =ks(i-1,j)  (j<wi)
 *      2.背包容量充足：ks(i,j)=max{ks(i-1,j) , ks(i-1,j-wi)}  放与不放两种状态
 *      https://www.cnblogs.com/mfrank/p/10533701.html
 */
public class Al_13 {
    static  int vs[]={0,2,4,3,7};
    static int ws[]={0,2,3,5,5};
    public static void main(String[] args) {

        int result=ks(4,10);
        System.out.println(result);
    }
    private static  int ks(int i,int c){
        int result=0;
        if(c<=0||i<=0)return 0;
        else if(ws[i]>c) result=ks(i-1,c);
        else {
            int tmp1=ks(i-1,c);
            int tmp2=ks(i-1,c-ws[i])+vs[i];
            result=Math.max(tmp1,tmp2);
        }
        return result;
    }
}