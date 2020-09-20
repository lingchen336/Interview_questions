package com.test.algorithm.BiTree;

public class BinaryTreeUtils {
    public static void creatBinaryTree(BinaryNode root,int []array){
        root.value=array.length>0?array[0]:1;
        for (int i = 1; i < array.length; i++) {
            insertBinaryTreeBode(root,array[i]);
        }
    }

    public static void insertBinaryTreeBode(BinaryNode root,int value){
        if(root.value>=value){
            if(root.left==null){
                root.left=new BinaryNode(value);
                return;
            }else{
                insertBinaryTreeBode(root.left,value);
            }
        }else {
            if(root.right==null){
                root.right=new BinaryNode(value);
                return;
            }else insertBinaryTreeBode(root.right,value);
        }
    }
}
