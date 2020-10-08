package com.test.algorithm.dfs;
/*
请设计一个函数，用来判断在一个矩阵中是否存在一条包含某字符串所有字符的路径。路径可以从矩阵中的任意一格开始，每一步可以在矩阵中向左、右、上、下移动一格。
如果一条路径经过了矩阵的某一格，那么该路径不能再次进入该格子.
示例:
输入：board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
输出：true
题解：
递归参数： 当前元素在矩阵 board 中的行列索引 i 和 j ，当前目标字符在 word 中的索引 k 。
终止条件：
    返回 false ： ① 行或列索引越界 或 ② 当前矩阵元素与目标字符不同 或 ③ 当前矩阵元素已访问过 （③ 可合并至 ② ） 。
    返回 true ： 字符串 word 已全部匹配，即 k = len(word) - 1 。

递推工作：
    标记当前矩阵元素： 将 board[i][j] 值暂存于变量 tmp ，并修改为字符 '/' ，代表此元素已访问过，防止之后搜索时重复访问。
    搜索下一单元格： 朝当前元素的 上、下、左、右 四个方向开启下层递归，使用 或 连接 （代表只需一条可行路径） ，并记录结果至 res 。
    还原当前矩阵元素： 将 tmp 暂存值还原至 board[i][j] 元素。
    回溯返回值： 返回 res ，代表是否搜索到目标字符串。
 */
public class O_12 {
    public boolean exist(char[][] board, String word) {
        char[] a=word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board,a,i,j,0)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][]board,char []a,int i,int j,int k){
        if(i<0||j<0||i>= board.length||j>=board[0].length||a[k]!=board[i][j])return false;
        if(k==a.length-1)return true;
        char temp=board[i][j];
        board[i][j]='/';
        boolean res=dfs(board,a,i+1,j,k+1)||dfs(board,a,i-1,j,k+1)||dfs(board,a,i,j+1,k+1)||dfs(board,a,i,j-1,k+1);
        board[i][j]=temp;
        return res;
    }
}



















