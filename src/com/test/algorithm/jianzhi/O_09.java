package com.test.algorithm.jianzhi;
/*
用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。
(若队列中没有元素，deleteHead操作返回 -1 )
题解：
为了维护队列先进先出的特性，我们引入第二个栈，用第二个栈维护待删除的元素，在执行删除操作的时候我们首先看下第二个栈是否为空。
如果为空，我们将第一个栈里的元素一个个弹出插入到第二个栈里，这样第二个栈里元素的顺序就是待删除的元素的顺序，要执行删除操作的时候我们直接弹出第二个栈的元素返回即可。
 */
import java.util.Deque;
import java.util.LinkedList;

public class O_09 {
    private Deque<Integer> a,b;
    public O_09() {
        a=new LinkedList<>();
        b=new LinkedList<>();
    }

    public void appendTail(int value) {
        a.add(value);
    }

    public int deleteHead() {
        if(b.isEmpty()){
            while (!a.isEmpty()){
                b.push(a.poll());
            }
        }
        if(b.isEmpty()){
            return -1;
        }else{
            int deleteItem=b.poll();
            return deleteItem;
        }
    }
}
