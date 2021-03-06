package com.test.algorithm.jianzhi;

import java.util.Arrays;

/*
找出数组中重复的数字
给定一个长度为 n 的整数数组 nums，数组中所有的数字都在 0∼n−1 的范围内。

数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。

请找出数组中任意一个重复的数字。

注意：如果某些数字不在 0∼n−1 的范围内，或数组中不包含重复数字，则返回 -1；
 */
public class O_13 {
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
