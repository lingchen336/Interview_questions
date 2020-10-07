package com.test.algorithm.BiTree;
/*
请完成一个函数，输入一个二叉树，该函数输出它的镜像。
例如输入：

  4
 /  \
 2   7
/ \  / \
1  3 6  9
镜像输出：

  4
 /  \
 7   2
/ \  / \
9  6 3  1

链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof

 */
public class O_27 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null)return null;
        TreeNode rleft=mirrorTree(root.right);
        TreeNode rright=mirrorTree(root.left);
        root.left=rleft;
        root.right=rright;
        return root;
    }
}

