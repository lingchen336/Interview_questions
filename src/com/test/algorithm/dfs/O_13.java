package com.test.algorithm.dfs;
/*
地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能
移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进
入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
题解：

 */
public class O_13 {
    public int movingCount(int m, int n, int k) {
        boolean[][]visited=new boolean[m][n];
        return dfs(0,0,m,n,k,visited);
    }
    int dfs(int i,int j,int m,int n,int k,boolean[][]visited){
        if(i>=m||j>=n||k<getsum(i)+getsum(j)||visited[i][j])return 0;
        visited[i][j]=true;
        return 1+dfs(i+1,j,m,n,k,visited)+dfs(i,j+1,m,n,k,visited);
    }
    int getsum(int a){
        int sum=a%10;
        int temp=a/10;
        while (temp>0){
            sum+=temp%10;
            temp=temp/10;
        }
        return sum;
    }
}
