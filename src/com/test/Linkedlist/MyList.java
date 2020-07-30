package com.test.Linkedlist;

public class MyList {
    private Node head;
    private Node tail;
    private int size = 0;

    public MyList() {
        head = new Node();
        tail = new Node();
        head.next =null;
        tail.pre = null;
    }

    public boolean empty() {
        if (head.next == null)
            return true;
        return false;
    }
    //找到所找下标节点的前一个节点
    public Node findpre(int index){
        Node rnode = head;
        int dex = -1;
        while(rnode.next != null){
            //找到了插入节点的上一个节点
            if( dex== index - 1){
                return rnode;
            }
            rnode = rnode.next;
            dex++;
        }
        return null;
    }
    public Node findthis(int index){
        Node rnode = head;
        //把rnode想象为指针，dex为指向的下标，这个地方很容易错，因为当指向最后一个节点时没有判断IF就跳出循环了
        int dex = -1;
        while(rnode.next != null){
            if(dex == index)
                return rnode;
            rnode = rnode.next;
            dex++;
        }
        if(dex == size - 1){
            return rnode;
        }
//        Node test = new Node(new Students("haha",1,2));
        return null;
    }

    // 往链表末尾加入节点
    public void add(Object e) {
        Node node = new Node(e);
        Node rnode = head;
        //如果是空链表的话插入一个节点，这个节点的pre不能指向上一个节点，必须指空
        if (this.empty()) {
            rnode.next = node;
            rnode.next.pre = null;
            tail.pre = node;
            size++;
        } else {
            while (rnode.next != null)
                rnode = rnode.next;
            rnode.next = node;
            node.pre = rnode;
            tail.pre = node;
            size++;
        }
    }
    //往链表的某一个标插入一个节点
    public boolean add(int index,Object e){
        if(index <0||index>=size)
            return false;
        Node node = new Node(e);
        Node prenode = this.findpre(index);
        node.next = prenode.next;
        prenode.next.pre = node;
        prenode.next = node;
        node.pre = prenode;
        size++;
        return true;
    }
    public boolean add(int index,MyList myl){
        if(index <0 || index >= size)
            return false;
        Node prenode = this.findpre(index);
//        myl.tail.pre.next = prenode.next;
//        prenode.pre = myl.tail.pre;
//        tail.pre = null;
//        prenode.next = myl.head.next;
//        myl.head.next.pre = prenode;
//        head.next = null;
        myl.tail.pre.next = prenode.next;
        prenode.next.pre = myl.tail.pre.pre;
        myl.head.next.pre = prenode.pre;
        prenode.next = myl.head.next;
        myl.head = null;
        myl.tail = null;
        size+=myl.size;
        return true;
    }

    public Object remove(int index){
        Object ob= this.get(index);
        if(index <0 || index >= size)
            return null;
        //特殊情况，当移除节点是最后一个节点的时候
        //较为复杂通过画图来写代码
        if(index == size - 1){
            Node prenode = this.findpre(index);
            this.tail.pre = this.tail.pre.pre;
            this.tail.pre.next.pre = null;
            this.tail.pre.next =null;
            size--;
            return ob;
        }
        //比较复杂，通过画图解决
        else{
            Node prenode = this.findpre(index);
            prenode.next = prenode.next.next;
            prenode.next.pre.next = null;
            prenode.next.pre = prenode.next.pre.pre;
            size--;
            return ob;
        }
    }


    public Object get(int index){
        Node thisnode = this.findthis(index);
        return thisnode.e;
    }
    public int size(){
        return size;
    }
}