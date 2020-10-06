package com.test.algorithm.jianzhi;
/*
定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。

示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.min();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.min();   --> 返回 -2.
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
        public ListNode(int val, int min, ListNode next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
}
