package com.test.algorithm.BiTree;
/*
请实现一个函数，用来判断一棵二叉树是不是对称的。如果一棵二叉树和它的镜像一样，那么它是对称的。
题解：
对称二叉树定义： 对于树中 任意两个对称节点 L 和 R，一定有：
    L.val = R.valL.val=R.val ：即此两对称节点值相等。
    L.left.val = R.right.valL.left.val=R.right.val ：即 L 的 左子节点 和 R 的 右子节点 对称；
    L.right.val = R.left.valL.right.val=R.left.val ：即 L 的 右子节点 和 R 的 左子节点 对称。

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

