package com.test.algorithm.jianzhi;

import sun.plugin.javascript.navig.Link;

import java.util.ArrayList;
import java.util.List;

/*
输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。
序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

题解：
当窗口的和小于 target 的时候，窗口的和需要增加，所以要扩大窗口，窗口的右边界向右移动
当窗口的和大于 target 的时候，窗口的和需要减少，所以要缩小窗口，窗口的左边界向右移动
当窗口的和恰好等于 target 的时候，我们需要记录此时的结果。设此时的窗口为 [i, j)，那么我们已经找到了一个 i 开头的序列，也是唯一一个 i 开头的序列，
接下来需要找 i+1 开头的序列，所以窗口的左边界要向右移动

 */
public class O_57_II {
    public int[][] findContinuousSequence(int target) {
        int i=1,j=1,sum=0;
        List<int[]> list=new ArrayList<>();
        while (i<=target/2){
            if(sum<target){
                sum+=j;
                j++;
            }else if(sum>target){
                sum-=i;
                i++;
            }else {
                int []arr=new int[j-i];
                for (int k = 0; k <j-i ; k++) {
                    arr[k]=k+i;
                }
                list.add(arr);
                sum-=i;
                i++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
