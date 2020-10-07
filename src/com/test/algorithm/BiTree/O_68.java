package com.test.algorithm.BiTree;
/*
给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。

百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”

链接：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof
题解：
当 left 和 right 同时为空 ：说明 root 的左 / 右子树中都不包含 p,q ，返回 null ；
当 left和 right 不同时为空 ：说明 p, q 分列在 root 的 一侧 （分别在 左 / 右子树） ；
当left，right同时不为空，返回root
 */
public class O_68 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)return root;
        TreeNode rleft=lowestCommonAncestor(root.left,p,q);
        TreeNode rright=lowestCommonAncestor(root.right,p,q);
        if(root.left==null)return rright;
        if(root.right==null)return rleft;
        return root;                       //rleft!=null&&rright!=null
    }
}

