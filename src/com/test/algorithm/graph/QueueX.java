package com.test.algorithm.graph;
//实现广度优先搜索的队列
public class QueueX {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public QueueX(){
        queArray = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public void insert(int j){
        if (rear == SIZE-1)
            rear = -1;
        queArray[++rear] = j;
    }

    public int remove(){
        int temp = queArray[front++];
        if (front == SIZE){
            front = 0;
        }
        return temp;
    }

    public boolean isEmpty(){
        return (rear+1 == front || front+SIZE-1 == rear);
    }

}