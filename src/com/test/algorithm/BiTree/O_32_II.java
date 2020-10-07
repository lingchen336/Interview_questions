package com.test.algorithm.BiTree;
/*
从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class O_32_II {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<>();
        List<List<Integer>>list=new ArrayList<>();
        if(root!=null)queue.add(root);
        while (!queue.isEmpty()){
            List<Integer>res=new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode temp= queue.poll();
                res.add(temp.val);
                if(temp.left!=null)queue.add(temp.left);
                if(temp.right!=null)queue.add(temp.right);
            }
            list.add(res);
        }
        return list;
    }
}
