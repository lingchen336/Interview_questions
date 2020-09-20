package com.test.temp;

import java.util.Scanner;

public class Al_16{
    static int tem;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m;
        n=sc.nextInt();m=sc.nextInt();
        int a[][]=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j]=sc.nextInt();
            }
        }
        find(a, n - 1, m);
        int l=tem+1;
        for (int i = 0; i <=l; i++) {
            for (int j = 0; j < m; j++) {
                if(true)
                    System.out.print(a[i][j]+" ");
                else if(i==l-1&&j==m)
                    System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    public static int find(int a[][],int n,int m){
        int fla=n;
        if(fla==0) {
            return 0;
        }
        tem=fla/2;
        int flag=1;
        for (int i = 0; i <= tem; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]!=a[fla-i][j]){
                    flag=0;
                }
            }

        }
        if(flag!=0){
            find(a,n/2,m);
        }
        return 1;
    }

}