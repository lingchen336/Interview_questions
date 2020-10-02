package com.test.algorithm.jianzhi;
/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
例如，[3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1

 */

class O_11 {
    public int minArray(int[] numbers) {
        int l=0,r=numbers.length-1;

        while(l<r){
            int mid=l+(r-l)/2;
            if(numbers[mid]<numbers[r]){
                r=mid;
            }else if(numbers[mid]>numbers[r]){
                l=mid+1;
            }else{
                r--;
            }

        }
        return numbers[l];
    }
}