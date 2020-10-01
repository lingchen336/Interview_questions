package com.test.leetcode;
/*
给定两个大小为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的中位数。
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class L4 {
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m= nums2.length;
        int left=(n+m+1)/2;
        int right=(n+m+2)/2;
        double i = (getKth(nums1, 0, n-1, nums2, 0, m-1, left) + getKth(nums1, 0, n-1, nums2, 0, m-1, right) )/ 2.0;
        return i;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int []num1=new int[n];int []num2=new int[m];
        String[] s1 = sc.nextLine().split(" ");
        String[]s2=sc.nextLine().split(" ");
        for (int i = 0; i < n||i<m; i++) {
            if(i<n)
                num1[i]=Integer.parseInt(s1[i]);
            if(i<m)
                num2[i]=Integer.parseInt(s2[i]);
        }
        System.out.println(findMedianSortedArrays(num1, num2));
    }
    private static int getKth(int nums1[],int start1,int end1,int nums2[],int start2,int end2,int k){
        int len1=end1-start1+1;
        int len2=end2-start2+1;
        //保证len1<len2
        if(len1>len2)return getKth(nums2,start2,end2,nums1,start1,end1,k);
        if(len1==0)return nums2[start2+k-1];

        if(k==1)return Math.min(nums1[start1],nums2[start2]);

        int i=start1+Math.min(len1,k/2)-1;
        int j=start2+Math.min(len2,k/2)-1;

        if(nums1[i]>nums2[j]){
            return getKth(nums1,start1,end1,nums2,j+1,end2,k-(j-start2+1));
        }else{
            return getKth(nums1,i+1,end1,nums2,start2,end2,k-(i-start1+1));
        }
    }
}
