package com.test.algorithm.dp;

import java.util.Scanner;
/*
0 1 背包问题（背过）
 */
public class dp_01{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        sc.nextLine();
        int v[]=new int[n+1];
        int w[]=new int[n+1];
        int f[]=new int[m+1];
        for (int i = 1; i <= n; i++) {
            v[i]=sc.nextInt();
            w[i]=sc.nextInt();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = m; j >=v[i] ; j--) {
                f[j]=Math.max(f[j],f[j-v[i]]+w[i]);
            }
        }
        System.out.print(f[m]);
    }
}