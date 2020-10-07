package com.test.algorithm.BiTree;

import com.test.temp.JVM1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
从上到下打印出二叉树的每个节点，同一层的节点按照从左到右的顺序打印
 */
public class O_32 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int[] levelOrder(TreeNode root) {
        if(root==null)return new int[0];
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(root); }};
        ArrayList<Integer>list=new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode temp=queue.poll();
            list.add(temp.val);
            if(temp.left!=null) queue.add(temp.left);
            if(temp.right!=null)queue.add(temp.right);
        }
        int a[]=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            a[i]=list.get(i);
        }
        return a;
    }
}

