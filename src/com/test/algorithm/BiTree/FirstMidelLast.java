package com.test.algorithm.BiTree;

import java.util.ArrayList;
import java.util.List;
/*
返回二叉树的先序中序和后序遍历的结果，返回值为一个二维数组
 */
public class FirstMidelLast {
    public static void main(String[] args) {
        int []array={8,3,5,20,15,2,29,1,4,6,13,16,21,30};
        BinaryNode root=new BinaryNode(0);
        BinaryTreeUtils.creatBinaryTree(root,array);
        int[][] ints = threeOrders(root);
        System.out.println();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < ints[0].length; j++) {
                System.out.print(ints[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int [][] threeOrders(BinaryNode root){
        List<Integer> arrayList1=new ArrayList<>();
        List<Integer> arrayList2=new ArrayList<>();
        List<Integer> arrayList3=new ArrayList<>();
        arrayList1=theFirstTraversal(root,arrayList1);

        int s1 = arrayList1.size();
        int a[][]=new int[3][s1];
        for (int i = 0; i < s1; i++) {
            a[0][i]= (int) theFirstTraversal(root,arrayList1).get(i);
            a[1][i]= (int) theMidelTraversal(root,arrayList2).get(i);
            a[2][i]= (int) theLastTraversal(root,arrayList3).get(i);
        }
        return a;
    }
//先序遍历
    public static List theFirstTraversal(BinaryNode root, List arrayList1){
        if(root==null) return null;
        System.out.print(root.value+" ");
        arrayList1.add(root.value);
        if(root.left!=null) theFirstTraversal(root.left,arrayList1);

        if(root.right!=null)theFirstTraversal(root.right,arrayList1);
        return arrayList1;
    }
    //中序遍历
    public static List theMidelTraversal(BinaryNode root,List arrayList2){
        if(root==null)return null;
        if(root.left!=null)  theMidelTraversal(root.left,arrayList2);


        arrayList2.add(root.value);
        System.out.print(root.value+" ");
        if(root.right!=null)theMidelTraversal(root.right,arrayList2);
        return arrayList2;
    }
    //后序遍历
    public static List theLastTraversal(BinaryNode root,List arrayList3){
        if(root==null)return null;
        if(root.left!=null) theLastTraversal(root.left,arrayList3);

        if(root.right!=null)theLastTraversal(root.right,arrayList3);
        arrayList3.add(root.value);

        System.out.print(root.value+" ");
        return arrayList3;
    }
}
