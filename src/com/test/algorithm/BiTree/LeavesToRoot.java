package com.test.algorithm.BiTree;

import java.util.LinkedList;

public class LeavesToRoot {
    static int temp=0,sum=0;
    public static void main(String[] args) {
        int []array={8,3,5,20,15,2,29,1,4,6,13,16,21,30};
        BinaryNode root=new BinaryNode(0);
        BinaryTreeUtils.creatBinaryTree(root,array);

        System.out.println(sum(root));

        LinkedList<String >res=new LinkedList<>();
        System.out.println(printPath(root, "", res));

    }
//计算所有叶子节点到根节点路径之和
    public static int  sum(BinaryNode root){
        if(root==null)return 0;
        temp+= root.value;
        if(root.left==null&&root.right==null){
            sum+=temp;
        }
        if(root.left!=null){
            sum(root.left);
        }
        if(root.right!=null){
            sum(root.right);
        }
        return sum;
    }
    //打印所有根节点到叶子节点路径
    public static LinkedList<String> printPath(BinaryNode root, String s, LinkedList<String >res){
        if(root==null)return null;
        s+=root.value;
        if(root.left==null&&root.right==null){
            res.add(s);
        }
        if(root.left!=null){
            printPath(root.left,s+"->",res);
        }
        if(root.right!=null){
            printPath(root.right,s+"->",res);
        }
        return res;
    }




}













