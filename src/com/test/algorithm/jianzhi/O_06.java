package com.test.algorithm.jianzhi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class O_06 {
    public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x; }
 }
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer>lsit=new LinkedList<>();
        while (head!=null){
            lsit.addFirst(head.val);
            head=head.next;
        }
        int x[]=new int[lsit.size()];
        int i=0;
        for(int a :lsit){
            x[i++]=a;
        }
        return x;
    }
}
