package com.test.algorithm.jianzhi;
/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。

通过找到target+0.5与target-0.5的位置相减得到重复数字的长度。
 */
import java.util.*;

class O_53 {
    public static int search(int[] nums, int target) {
        return binarySearch(nums,target+0.5)-binarySearch(nums,target-0.5);
    }
    static int  binarySearch(int []nums,double target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+r>>1;
            if(nums[mid]>target) r=mid-1;
            else if(nums[mid]<target) l=mid+1;
        }
        return l;
    }

    public static void main(String[] args) {
        int num[]={1};
        int a=1;
        System.out.print(search(num,a));
    }
}