package com.test.leetcode;
/*
һֻ����һ�ο�������1��̨�ף�Ҳ��������2��̨�ס������������һ�� n����̨���ܹ��ж�����������

����Ҫȡģ 1e9+7��1000000007����������ʼ���Ϊ��1000000008���뷵�� 1��

 */

class Solution {
    public int numWays(int n) {  //����Ϊ��쳲��������еĵ�N����
        int a=1,b=1;
        int sum;
        for (int i = 0; i < n; i++) {
            sum=(a+b)%1000000007;
            a=b;
            b=sum;
        }
        return a;
    }
}