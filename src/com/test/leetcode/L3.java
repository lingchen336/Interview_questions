package com.test.leetcode;
/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */

import java.util.HashMap;
import java.util.Map;

class L3 {
    public static int lengthOfLongestSubstring(String s) {
        int max=0;
        Map<Character,Integer> map=new HashMap<>();
        for (int start = 0,end=0; end<s.length() ; end++) {
            if(map.containsKey(s.charAt(end))){
                start=Math.max(map.get(s.charAt(end))+1,start);
            }
            max=Math.max(max,end-start+1);
            map.put(s.charAt(end),end);
        }
        return max;
    }

    public static void main(String[] args) {
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}