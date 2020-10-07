package com.test.algorithm.BiTree;
/*
请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。

 */

public class O_28 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        return root==null?true:recur(root.left,root.right);
    }
    boolean recur(TreeNode l,TreeNode r){
        if(l==null&&r==null)return true;
        if(l==null||r==null||l.val!=r.val)return false;
        return recur(l.left,r.right)&&recur(l.right,r.left);
    }
}

