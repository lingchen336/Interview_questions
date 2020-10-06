package com.test.leetcode;
/*
����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ����СԪ�ص� min �����ڸ�ջ�У����� min��push �� pop ��ʱ�临�Ӷȶ��� O(1)��

ʾ��:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> ���� -3.
minStack.pop();
minStack.top();      --> ���� 0.
minStack.min();   --> ���� -2.
 */

class MinStack {

    /** initialize your data structure here. */
    private ListNode head;
    public MinStack() {
        head=null;
    }

    public void push(int x) {
        if(head==null) head=new ListNode(x,x,null);
        else {
            head=new ListNode(x,Math.min(x,head.min),head);
        }
    }

    public void pop() {
        head=head.next;
    }

    public int top() {
        return head.val;
    }

    public int min() {
        return head.min;
    }

    class ListNode{
        int val;
        int min;
        ListNode next;
        public ListNode(int val,int min,ListNode next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}