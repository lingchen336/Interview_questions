package com.test.algorithm.BiTree;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。

 */
public class O_32_III {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root!=null) queue.add(root);
        while (!queue.isEmpty()){
            LinkedList<Integer>temp=new LinkedList<>();
            for (int i =queue.size();i>0; i--) {
                TreeNode flag=queue.poll();
                if(list.size()%2==0)temp.addLast(flag.val);  // 偶数层 -> 队列头部
                else temp.addFirst(flag.val);                // 奇数层 -> 队列尾部
                if(flag.left!=null)queue.add(flag.left);
                if(flag.right!=null)queue.add(flag.right);
            }
            list.add(temp);
        }
        return list;
    }
}
