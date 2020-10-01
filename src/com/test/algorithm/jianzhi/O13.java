package com.test.algorithm.jianzhi;

import java.util.Arrays;

public class O13 {
    public int duplicateInArray(int[] nums) {
        Arrays.sort(nums);
        if(nums[0]<0||nums[nums.length-1]>nums.length-1||nums.length==0)
            return -1;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
