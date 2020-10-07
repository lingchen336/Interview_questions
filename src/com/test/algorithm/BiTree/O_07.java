package com.test.algorithm.BiTree;

import java.util.ArrayList;
import java.util.List;

/*
输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

利用分治的思想，找到先序遍历的数在中序遍历中的位置，该位置为当前子树的根，该位置左边为树的左子树，右边为树的右子树；直至不能划分为止。
 */

public class O_07 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode buildTree(int []preorder,int []inorder){
        List<Integer> preList=new ArrayList<>();
        List<Integer>inList=new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preList.add(preorder[i]);
            inList.add(inorder[i] );
        }
        return  helper(preList,inList);
    }

    TreeNode helper(List preList,List inList){
        if(inList.size()==0)return null;
        int rootVal= (int) preList.remove(0);
        TreeNode root=new TreeNode(rootVal);
        int mid=inList.indexOf(rootVal);
        root.left=helper(preList,inList.subList(0,mid));
        root.right=helper(preList,inList.subList(mid+1,inList.size()));
        return root;
    }

}

