package com.test.temp;
/*
输入：第一行 t表示t组测试数据
第二行：输入 n,m 表示接下来两行，表示n个人 m个角色
第三行：输入n个人的最低能接受的戏份值
第四行：输入m 个角色的戏份值

输出：每个人可选多少个角色
百度笔试，超时，case0
难点：输入超时，要用字符串转换
 */

import java.util.Arrays;
import java.util.Scanner;

public class Al_18{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            sc.nextLine();
            String[] s1=sc.nextLine().split(" ");
            String []s2=sc.nextLine().split(" ");

            if(n==0||m==0)
                break;
            Arrays.sort(s1);
            Arrays.sort(s2);

            find(s1,s2,n,m);
        }
    }
    public static void find(String a[],String b[],int n,int m){
        int tem=0;
        for (int i = 0; i < n; i++) {
            for (int j = tem; j < m; j++) {
                if(Integer.parseInt(a[i])<=Integer.parseInt(b[i])){
                    tem=j;

                    System.out.print(m-j);
                    if(i!=n-1) System.out.print(" ");
                    break;
                }
                if(j==m-1&&i==n-1) System.out.print(0);
                else if(j==m-1&&i!=n-1)System.out.print(0+" ");
            }

        }

    }
}