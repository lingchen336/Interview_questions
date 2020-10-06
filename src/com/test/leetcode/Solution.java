package com.test.leetcode;
/*
����һ������ A[0,1,��,n-1]���빹��һ������ B[0,1,��,n-1]������ B �е�Ԫ�� B[i]=A[0]��A[1]������A[i-1]��A[i+1]������A[n-1]��
����ʹ�ó�����

 */

class Solution {
    public int[] constructArr(int[] a) {
        if(a==null||a.length==0)return new int[0];
        int[] res = new int[a.length];
        int left = 1;
        for (int i = 0; i < res.length; i++) {
            res[i] =left;
            left *= a[i];
        }
        int right = 1;
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= a[i];
        }
        return res;
    }
}