package com.test.algorithm.jianzhi;
/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 */
public class O_29 {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length==0)return new int[0];
        int l=0,r= matrix[0].length-1;
        int t=0,b= matrix.length-1,x=0;
        int []res=new int[(r+1)*(b+1)];
        while (true){
            for (int i = l; i <=r ; i++) res[x++]= matrix[t][i];
            if(++t>b)break;
            for (int i=t;i<=b;i++)res[x++]=matrix[i][r];
            if(l>--r)break;
            for (int i=r;i>=l;i--)res[x++]=matrix[b][i];
            if(--b<t)break;
            for (int i=b;i>=t;i--)res[x++]=matrix[i][l];
            if(r<++l)break;
        }
        return res;
    }
}
