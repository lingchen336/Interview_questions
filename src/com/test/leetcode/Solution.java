package com.test.leetcode;
/*
��n���������ڵ��ϣ��������ӳ���һ��ĵ���֮��Ϊs������n����ӡ��s�����п��ܵ�ֵ���ֵĸ��ʡ�
����Ҫ��һ�����������鷵�ش𰸣����е� i ��Ԫ�ش����� n ���������������ĵ��������е� i С���Ǹ��ĸ��ʡ�

����:
����: 1
���: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
 */
class Solution {
    public double[] twoSum(int n) {
        double pre[]={1/6d,1/6d,1/6d,1/6d,1/6d,1/6d};
        for (int i = 2; i <= n; i++) {
            double temp[]=new double[5*i+1];
            for (int j = 0; j < pre.length; j++) {
                for (int k = 0; k < 6; k++) {
                    temp[j+k]+=pre[j]/6;
                }
            }
            pre=temp;
        }
        return pre;
    }
}