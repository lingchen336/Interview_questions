package com.test.algorithm.jianzhi;

import java.util.PriorityQueue;
import java.util.Queue;
/*
输入整数数组 arr ，找出其中最小的 k 个数。
例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 */

class O_40 {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(arr.length==0||k==0)return new int[0];
        Queue<Integer> queue=new PriorityQueue<>((o1, o2) -> o2-o1);
        for (int i = 0; i < arr.length; i++) {
            if(queue.size()<k){
                queue.add(arr[i]);
            }else if(queue.peek()>arr[i]){
                queue.poll();
                queue.add(arr[i]);
            }
        }
        int []a=new int[queue.size()];
        for (int i = 0; i < k; i++) {
            a[i]=queue.poll();
        }
        return a;
    }

    public static void main(String[] args) {
        int a[]={1,2,3};
        int n=2;
        int b[]=getLeastNumbers(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}

