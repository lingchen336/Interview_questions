package com.test.algorithm.jianzhi;
/*
数组中只出现一次的数字
一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */

public class O_56 {
    public int[] singleNumbers(int[] nums) {
        int sum=0;
        int []res=new int[2];
        for (int i = 0; i < nums.length; i++) {
            sum^= nums[i];
        }
        int lowbit=sum&(-sum);
        for( int num:nums ){
            if((num&lowbit)==0) res[0]^=num;
            else res[1]^=num;
        }
        return res;
    }
}
