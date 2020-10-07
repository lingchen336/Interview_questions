package com.test.algorithm.BiTree;
/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
题解：
二叉搜索树的特点是： 左子树的值<根节点<右子树的值。
而后续遍历的顺序是：左子节点→右子节点→根节点；
例如：
一个二叉搜索树的后续遍历是[3，5，13，10，12，9]
我们来根据数组拆分，第一个比9大的后面都是9的右子节点[13，10，12]。然后再拆分这个数组，12是根节点，第一个比12大的后面都是12的右子节点[13，10]，
但我们看到10是比12小的，他不可能是12的右子节点，所以我们能确定这棵树不是二叉搜索树

 */
public class O_33 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    boolean recur(int []postorder,int l,int r){
        if(l>=r)return true;
        int mid=l;
        int root= postorder[r];
        while (postorder[mid]<root) mid++;//从左往右找出第一个比根节点大的值，他后面的都是根节点的右子节点（包含当前值，不包含最后一个值),他前面的都是根节点的左子节点
        while (mid<r){
            if(postorder[mid++]<root)
                return false;
        }
        return recur(postorder,l,mid-1)&&recur(postorder,mid,r-1);
    }
}
