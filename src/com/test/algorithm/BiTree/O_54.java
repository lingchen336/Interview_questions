package com.test.algorithm.BiTree;
/*
给定一棵二叉搜索树，请找出其中第k大的节点。

题解：
本文解法基于此性质：二叉搜索树的中序遍历为 递增序列 。
因此，求 “二叉搜索树第 k 大的节点” 可转化为求 “此树的中序遍历倒序的第 k 个节点”。

 为求第 k个节点，需要实现以下 三项工作 ：
    递归遍历时计数，统计当前节点的序号；
    递归到第 k 个节点时，应记录结果 res ；
    记录结果后，后续的遍历即失去意义，应提前终止（即返回）。

 */

public class O_54 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int res,k;
    public int kthLargest(TreeNode root, int k) {
        this.k=k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root){
        if(root==null)return;
        dfs(root.right);
        if(--k==0){
            res= root.val;
            return;
        }
        dfs(root.left);
    }
}

