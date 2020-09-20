package com.test.algorithm.Niuke;

public class Sloution {
    /*
    输入一个链表，反转链表后，输出新链表的表头。
    */

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

    public ListNode ReverseList(ListNode head) {
        ListNode pre=null;   //画图实现；
        while(head!=null){
            ListNode current;
            current =head;
            head=head.next;
            current.next=pre;
            pre=current;

        }
        return pre;
    }

}
