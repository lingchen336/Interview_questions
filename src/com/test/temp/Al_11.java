package com.test.temp;

import java.io.*;
import java.util.*;
/*
作者：牛客354641720号
链接：https://www.nowcoder.com/discuss/484133?type=post&order=time&pos=&page=1&channel=666&source_id=search_post
来源：牛客网

赏金猎人 时间限制： 3000MS 内存限制： 786432KB 题目描述： 克里森是一名赏金猎人，他平时需要完成一些任务赚钱。最近他收到了一批任务， 但是受到时间的
限制，他只能完成其中一部分。
    具体来说就是有n个任务，每个任务用l, r, w来表示任务开始的时间l， 结束的时间r和完成任务获得的金钱。 克里森是个贪心的人，他想知道自己在任务不冲突
    的情况下最多获得多少金钱。 输入描述 第一行一个数n表示任务的个数。(1≤n≤1e3)  接下来n行每行三个整数l, r, w表示第i个任务的开始时间，结束时间，
    yi及收益。(1≤l≤r≤1e6,1≤w≤1e9)  输出描述 输出一个值表示克里森最多获得的金钱数量。
 */
public class Al_11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] strs;
        //任务数量n
        int n = Integer.parseInt(br.readLine());
        int[][] nums = new int[n][3];
        //读取后面
        for (int i = 0; i < n; i++) {
            line = br.readLine();
            strs = line.split(" ");
            //开始
            nums[i][0] = Integer.parseInt(strs[0]);
            //结束
            nums[i][1] = Integer.parseInt(strs[1]);
            //赏金
            nums[i][2] = Integer.parseInt(strs[2]);
        }
        Arrays.sort(nums, Comparator.comparingInt(a -> a[0]));

        long[] res = new long[n];
        int end = nums[n - 1][0];
        long ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            //如果结束时间超过最后一个任务的开始时间 直接记录赏金
            if (nums[i][1] > end) res[i] = nums[i][2];
            else {
                //当前任务的结束时间
                int r = nums[i][1];
                long max = 0;
                for (int j = i + 1; j < n; j++) {
                    //开始时间大于结束时间的
                    if (nums[j][0] > r) {
                        max = Math.max(max, res[j]);
                    }
                }
                //记录当前格的赏金
                res[i] = nums[i][2]+max;
                ans = Math.max(ans,res[i]);
            }
        }
        System.out.println(ans);
    }
}