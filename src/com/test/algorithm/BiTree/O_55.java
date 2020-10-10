package com.test.algorithm.BiTree;

/*
输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
题解：
返回值：
当节点root 左 / 右子树的深度差 \leq 1≤1 ：则返回当前子树的深度，即节点 root 的左 / 右子树的深度最大值 +1+1 （ max(left, right) + 1 ）；
当节点root 左 / 右子树的深度差 > 2>2 ：则返回 -1−1 ，代表 此子树不是平衡树 。
终止条件：
当 root 为空：说明越过叶节点，因此返回高度 00 ；
当左（右）子树深度为 -1−1 ：代表此树的 左（右）子树 不是平衡树，因此剪枝，直接返回 -1−1 ；

 */


class O_55 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isBalanced(TreeNode root) {
        return sub(root)!=-1;
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

