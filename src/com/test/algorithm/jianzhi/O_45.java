package com.test.algorithm.jianzhi;

import java.util.ArrayList;
import java.util.List;
/*
输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
示例1:
输入: [3,30,34,5,9]
输出: "3033459"
 */

class O_45 {
    public String minNumber(int[] nums) {
        List<String > list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(String.valueOf(nums[i]));
        }
        list.sort((o1,o2)->((o1+o2).compareTo(o2+o1)));
        StringBuilder stringBuilder=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(String s : list){
            sb.append(s);
        }
        return sb.toString();
    }
}
