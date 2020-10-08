package com.test.algorithm.BiTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

/*
请实现两个函数，分别用来序列化和反序列化二叉树。
题解：
要实现反序列化，就要求节点中每一个node位置都是唯一确定的，需要把null看做一个节点，存储一个满二叉树可以达到要求。
借助队列，对二叉树做层序遍历，并将越过叶节点的 null 也打印出来。
层序遍历： 当 queue 为空时跳出；
    节点出队，记为 node ；
    若 node 不为空：① 打印字符串 node.val ，② 将左、右子节点加入 queue；
    否则（若 node 为空）：打印字符串 "null"


 */
public class O_37 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public class Codec {

        // Encodes a tree to a single string.
        public String serialize(TreeNode root) {
            if(root==null)return "[]";
            StringBuilder sb=new StringBuilder("[");
            Queue<TreeNode>queue=new LinkedList<TreeNode>(){{add(root);}};
            while (!queue.isEmpty()){
                TreeNode temp=queue.poll();
                if(temp!=null){
                    sb.append(temp.val+",");
                    queue.add(temp.left);
                    queue.add(temp.right);
                }else{
                    sb.append("null,");
                }
            }
            sb.deleteCharAt(sb.length()-1);
            sb.append("]");
            return sb.toString();
        }

        // Decodes your encoded data to tree.
        public TreeNode deserialize(String data) {
            if(data.equals("[]"))return null;
            String[] s = data.substring(1, data.length() - 1).split(",");
            Queue<TreeNode>queue=new LinkedList<TreeNode>();
            TreeNode node=new TreeNode(Integer.parseInt(s[0]));
            queue.add(node);
            int i=1;
            while (!queue.isEmpty()){
                TreeNode temp= queue.poll();
                if(!s[i].equals("null")){
                    temp.left=new TreeNode(Integer.parseInt(s[i]));
                    queue.add(temp.left);
                }
                i++;
                if(!s[i].equals("null")){
                    temp.right=new TreeNode(Integer.parseInt(s[i]));
                    queue.add(temp.right);
                }
                i++;
            }
            return node;
        }
    }
}
