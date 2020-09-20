package com.test.algorithm.BiTree;

import com.test.temp.TestLinux;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int []array={8,3,5,20,15,2,29,1,4,6,13,16,21,30};
        BinaryNode root=new BinaryNode(0);
        BinaryTreeUtils.creatBinaryTree(root,array);

        printBinaryTreeDepthFirst(root);
        System.out.println();
        printBinaryTreeWidthFirst(root);
        System.out.println();
        int x=calulateDepthBinaryTree(root);
        System.out.println("深度"+x);
    }
//广度优先遍历
    public static void printBinaryTreeWidthFirst(BinaryNode root){
        Queue queue=new LinkedList();
        if(root!=null) queue.add(root);

        while(!queue.isEmpty()){
            root=(BinaryNode)queue.poll();
            System.out.print(root.value+" ");

            if(root.left!=null)queue.offer(root.left);
            if(root.right!=null)queue.offer(root.right);
        }
    }
//深度优先遍历
    public static void printBinaryTreeDepthFirst(BinaryNode root){
        Stack stack=new Stack();
        stack.push(root);
        while(!stack.isEmpty()){
            root=(BinaryNode)stack.pop();
            System.out.print(root.value+" ");
            if(root.right!=null) stack.push(root.right);
            if(root.left!=null)stack.push(root.left);
        }
    }
//    计算二叉树深度
    public static int calulateDepthBinaryTree(BinaryNode root){
        if(root==null) return 0;
        int left=calulateDepthBinaryTree(root.left);
        int right=calulateDepthBinaryTree(root.right);
        return Math.max(left,right)+1;
    }



}
