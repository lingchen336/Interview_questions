package com.test.algorithm.jianzhi;

public class o_56 {
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
