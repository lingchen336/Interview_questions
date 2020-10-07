package com.test.algorithm.jianzhi;

import java.util.Map;
import java.util.HashMap;

/*
请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 */
class O_44 {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>();//key出现的字符，value对应的最新的位置
        // try to extend the range [i, j]
        for (int end = 0, start = 0; end < n; end++) {
            if (map.containsKey(s.charAt(end))) {
                start = Math.max(map.get(s.charAt(end)) + 1, start);//由于重复的坐标不知道在start的前方还是后方，所以要取个最大值
            }
            ans = Math.max(ans, end - start + 1);
            map.put(s.charAt(end), end);
        }
        return ans;
    }


    public static void main(String[] args) {
        System.out.print(lengthOfLongestSubstring("bbbbbb"));
    }
}