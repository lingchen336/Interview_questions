package com.test.algorithm.QuickSort;

import java.util.Stack;

public class Quick_sortI {
    public static void main(String[] args) {
        int arr[]={1,4,6,8,3,0,11};
        quickSort(arr,0,arr.length-1);
        for( int i:arr ){
            System.out.print(i+" ");
        }
    }

    protected static void quickSort(int a[],int l,int r)
    {
        if(l<r){
            Stack<Integer>stack=new Stack<>();
            stack.push(l);
            stack.push(r);
            while (!stack.isEmpty()){
                int j=stack.pop();
                int i=stack.pop();
                int mid=selectMid(a,i,j);
                if(mid-1>i){     //左边有值
                    stack.push(i);
                    stack.push(mid-1);
                }
                if(mid+1<j){    //右边有值
                    stack.push(mid+1);
                    stack.push(j);
                }
            }
        }
    }
    protected static int selectMid(int a[],int l,int r){
        int temp=a[l];
        while (l<r){
            while ((l<r&&a[r]>=temp))r--;  //从右往左找第一个大于枢值的值 并交换
            if(l<r)a[l++]=a[r];
            while ((l<r&&a[l]<=temp))l--;    //从左往右找第一个小于枢值的值 并交换
            if(l<r)a[r--]=a[l];
        }
        a[l]=temp;
        return l;
    }
}
