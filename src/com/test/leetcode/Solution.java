package com.test.leetcode;

public class Solution {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||q==root||p==root)return root;
        TreeNode rleft=lowestCommonAncestor(root.left,p,q);
        TreeNode rright=lowestCommonAncestor(root.right,p,q);
        if(rleft==null)return rright;
        if(rright==null)return rleft;
        return root;
    }
}