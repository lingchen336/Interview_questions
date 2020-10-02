package com.test.algorithm.jianzhi;
/*
------------------------归并排序算法------------------------------------------------------------------
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 */
class O_51 {
    public static int reversePairs(int[] nums) {
        if(nums.length==0)return 0;
        return merge(nums,0,nums.length-1);
    }

    public static int merge(int nums[],int start,int end){
        if(start==end)return 0;
        int mid=start+(end-start)/2;
        int cnt=merge(nums,0,mid)+merge(nums,mid+1,end);

        int []temp=new int[end-start+1];
        int i=start,j=mid+1,k=0;
        while(i<=mid&&j<=end){
            cnt+=nums[i]<=nums[j]?j-(mid+1):0;
            temp[k++]=nums[i]<=nums[j]?nums[i++]:nums[j++];
        }
        while(i<=mid){
            cnt+=j-(mid+1);
            temp[k++]=nums[i++];
        }
        while(j<=end){
            temp[k++]=nums[j++];
        }
        System.arraycopy(temp,0,nums,start,end-start+1);
        return cnt;
    }

    public static void main(String[] args) {
        int nums[]={};
        System.out.print(reversePairs(nums));
    }
}