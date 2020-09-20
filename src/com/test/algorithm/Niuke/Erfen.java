package com.test.algorithm.Niuke;

public class Erfen {
/*
请实现有重复数字的有序数组的二分查找。
输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 */
     public class Solution {
        /**
         * 二分查找
         * @param n int整型 数组长度
         * @param v int整型 查找值
         * @param a int整型一维数组 有序数组
         * @return int整型
         */
        public int upper_bound_ (int n, int v, int[] a) {
            // write code here
            int high,low,mid=0;

            if(a[0]<a[n-1]){
                high=n-1;
                low=0;
            }else{
                low=n-1;
                high=0;
            }
            if(v<=a[low])return 1;

            while(low<high){
                mid=low+(high-low)/2;
                if(a[mid]>=v){
                    if(a[mid-1]<v)return mid+1;
                    else high=mid;
                }else{
                    low=mid+1;
                }
            }
            return n+1;
        }
    }
}

