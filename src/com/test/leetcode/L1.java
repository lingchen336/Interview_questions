package  com.test.leetcode;

import java.util.*;

public class L1{
    public static void main(String[] args) {
        int []nums = {2, 7, 11, 15};
        int target = 13;
        int a[]=twoSum(nums,target);
        System.out.println(a[0]+""+a[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int tem=target-nums[i];
            if(map.containsKey(tem)){
                return new int[]{map.get(tem),i};
            }
            map.put(nums[i],i);
        }
        return nums;
    }

}