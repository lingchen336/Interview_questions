package com.test.temp;

import java.io.*;
import java.util.*;
/*
作者：牛客354641720号
链接：https://www.nowcoder.com/discuss/484133?type=post&order=time&pos=&page=1&channel=666&source_id=search_post
来源：牛客网

服务器管理 时间限制： 3000MS 内存限制： 786432KB 题目描述： 小A的购买了一批服务器，他准备将这些服务器租用出去。 每一个服务器有一个固定的带宽，
人们根据自己需要的带宽来租用这些服务器。一台服务器只能租给一个人。  小A现在有n个空闲的服务器，第 i 个服务器拥有ai的带宽。 有m个客户来租服务器，第
i 位客户需要带宽至少为bi的服务器，并且愿意花ci元作为预算。 （服务器带宽独立不可叠加，若不能成功租出则输出0）
小A可以选择拒绝一些人，现在，小A想知道自己的服务器最多能租多少钱？  输入描述 输入第一行包含两个数n,m  接下来1行n个数，第i个数ai代表第 i 个服务器的
带宽大小。  接下来m行，每行两个数bi,ci，代表客户需求的带宽大小和他的预算。  n,m≤1000 , 1≤ai,bi,ci≤1000 输出描述 输出一个数，即小A最多能租多少
元的服务器出去。
 */
public class Al10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        String[] strs;
        line = br.readLine();
        strs = line.split(" ");
        //服务器数量n
        int n = Integer.parseInt(strs[0]);
        int[] serves = new int[n];
        //客户数量m
        int m = Integer.parseInt(strs[1]);
        int[][] cons = new int[m][2];
        line = br.readLine();
        strs = line.split(" ");
        for (int i = 0; i < n; i++) {
            serves[i] = Integer.parseInt(strs[i]);
        }
        for (int i = 0; i < m; i++) {
            line = br.readLine();
            strs = line.split(" ");
            cons[i][0] = Integer.parseInt(strs[0]);
            cons[i][1] = Integer.parseInt(strs[1]);
        }
        Arrays.sort(serves);
        Arrays.sort(cons, Comparator.comparingInt(a -> a[0]));
        int index_s = 0;
        int index_c = 0;
        int res = 0;
        List<Integer> arr = new ArrayList<>();
        while (index_s < n && index_c < m) {
            int tmp = cons[index_c][0];
            //服务器带宽先符合要求
            while (index_s < n && serves[index_s] < tmp) {
                index_s++;
            }
            int count = 0;
            //计算这个带宽的客户数量
            while (index_c < m && cons[index_c][0] == tmp) {
                arr.add(cons[index_c][1]);
                index_c++;
            }
            //下一个带宽要求
            if (index_c < m) {
                tmp = cons[index_c][0];
                //计算满足带宽的服务器数量
                while (index_s < n && serves[index_s] < tmp) {
                    count++;
                    index_s++;
                }
            }else{
                while (index_s < n ) {
                    count++;
                    index_s++;
                }
            }
            //记录客户对应的价格
            int[] tmps = new int[arr.size()];
            for (int i = 0; i < arr.size(); i++) {
                tmps[i] = arr.get(i);
            }
            Arrays.sort(tmps);
            int index = tmps.length - 1;
            //服务器不够或者客户不够 退出循环
            while (index >= 0 && count > 0) {
                res += tmps[index];
                index--;
                count--;
            }
            //如果还有余下的客户,更新arr
            arr = new ArrayList<>();
            while (index >= 0) {
                arr.add(tmps[index]);
                index--;
            }
            //这个时候指针s与c分别指向后面
        }
        System.out.println(res);
    }
}