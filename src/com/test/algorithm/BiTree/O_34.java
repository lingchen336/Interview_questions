package com.test.algorithm.BiTree;

import java.util.LinkedList;
import java.util.List;
/*
输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
题解：
每经过一个节点sum-=node.vla 当遇到leaves节点时判断sum==0？list.add(path):path.removeLast();
 */
public class O_34 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    List<List<Integer>>list=new LinkedList<>();
    LinkedList<Integer>path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        helper(root,sum);
        return list;
    }
    void helper(TreeNode root,int sum){
        if(root==null)return;
        path.add(root.val);
        sum-=root.val;
        if(root.left==null&&root.right==null&&sum==0)
            list.add(new LinkedList<>(path));
        helper(root.left,sum);
        helper(root.right,sum);
        path.removeLast();
    }
}
