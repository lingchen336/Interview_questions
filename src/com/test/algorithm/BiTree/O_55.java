package com.test.algorithm.BiTree;

/*
输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 */


class O_55 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return sub(root)==-1;
    }
    protected int sub(TreeNode root){
        if(root==null)return 0;
        int left=sub(root.left);
        if(left==-1)return -1;
        int right=sub(root.right);
        if(right==-1)return -1;
        return Math.abs(left-right)<2?Math.max(left,right)+1:-1;
    }
}

