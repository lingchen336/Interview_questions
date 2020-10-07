package com.test.algorithm.BiTree;
/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的循环双向链表。要求不能创建任何新的节点，只能调整树中节点指针的指向。
题解：
本文解法基于性质：二叉搜索树的中序遍历为 递增序列 。
将 二叉搜索树 转换成一个 “排序的循环双向链表”
 */
public class O_36 {
    class Node {
        int val;
        Node left;
        Node right;
        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
    Node pre,head;
    public Node treeToDoublyList(Node root) {
        if(root==null)return null;
        dfs(root);
        pre.right=head;
        head.left=pre;
        return head;
    }
    void dfs(Node cur){
        if(cur==null)return;
        dfs(cur.left);
        //pre用于记录双向链表中位于cur左侧的节点，即上一次迭代中的cur,当pre==null时，cur左侧没有节点,即此时cur为双向链表中的头节点
        if(pre==null)head=cur;
        else pre.right=cur;
        cur.left=pre;
        pre=cur;
        dfs(cur.right);
    }
}
