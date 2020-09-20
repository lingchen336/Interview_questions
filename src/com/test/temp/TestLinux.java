package com.test.temp;
import java.util.*;


public class TestLinux {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * M包糖果，抛M次硬币，硬币连续n次为正面，最多能得到多少颗糖果
     * @param candies int整型一维数组 每包糖果的数量
     * @param coin int整型一维数组 抛硬币的结果
     * @param n int整型 连续是正面的次数
     * @return int整型
     */
    public static int maxCandies (int[] candies, int[] coin, int n) {
        int res=0;
        int flag = 0;
        int flag1=0;
        int length=candies.length;
        int a[]=new int[length];
        int b[]=new int[length];

        for (int i = 0; i <length; i++) {
            if(coin[i]==0){
                res+=candies[i];
            }else if(coin[i]==1){
                a[i]=candies[i];
                b[i]=i;
            }

        }
        for (int j = 0; j < n&&b[j]<n; j++) {
            flag=flag+a[j];
        }
        for (int i = 1; i < length; i++) {

            for (int j = i; j < i+n&&j<length; j++) {
                if(b[j]<i+n)
                    flag1=flag1+a[j];
            }
            if(flag1>flag)flag=flag1;
            flag1=0;
        }

        return res+flag;
    }

    public static void main(String[] args) {
        int a[]={3,5,7,2,8,8,15,3};
        int b[]={1,0,1,0,1,0,1,0};
        int n=3;
        System.out.println(maxCandies(a, b, n));
    }

}