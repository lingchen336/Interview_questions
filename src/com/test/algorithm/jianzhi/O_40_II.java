package com.test.algorithm.jianzhi;
/*
输入整数数组 arr ，找出其中最小的 k 个数。
例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。

部分快排解法
 */

class O_40_II {
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k==0){
            return new int[0];
        }else if(arr.length<=k){
            return arr;
        }

        quicksort(arr,0,arr.length-1,k);
        int []a=new int[k];
        for (int i = 0; i < k; i++) {
            a[i]=arr[i];
        }
        return a;
    }

    protected static void quicksort(int []arr,int l,int r,int k){
        if(l<r){
            int mid=selectMid(arr,l,r,k);
            if(mid==k)return ;
            else if(mid<k)  quicksort(arr,mid+1,r,k);
            else quicksort(arr,l,mid-1,k);
        }

    }

    protected static int selectMid(int a[],int l,int r,int k){
        int x=a[l];
        while(l<r){
            while(l<r&&a[r]>=x)r--;
            if(l<r)a[l++]=a[r];
            while(l<r&&a[l]<=x)l++;
            if(l<r)a[r--]=a[l];
        }
        a[l]=x;
        return l;
    }

    public static void main(String[] args) {
        int a[]={0,0,2,3,2,1,1,2,0,4};
        int n=10;
        int b[]=getLeastNumbers(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(b[i]+" ");
        }
    }
}
