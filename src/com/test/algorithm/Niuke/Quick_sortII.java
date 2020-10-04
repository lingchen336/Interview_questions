package com.test.algorithm.Niuke;

/*
quickSort 快速排序。。。
 */

import java.sql.SQLOutput;

public class Quick_sortII{
    public static void main(String[] args) {
        int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
        quickSort(arr,0,arr.length-1);
        System.out.println("排序后：");
        for (int i:arr
        ) {
            System.out.print(i+" ");
        }

    }

    private static void quickSort(int []arr,int low,int high){
        if(low<high){
            int index=getIndex(arr,low,high);

            quickSort(arr,low,index-1);
            quickSort(arr,index+1,high);
        }
    }

    private static int getIndex(int []arr,int low,int high){
        int tmp=arr[low];
        while(low<high){
            while(low<high&&arr[high]>=tmp){
                high--;
            }
            arr[low]=arr[high];
            while(low<high&&arr[low]<=tmp){
                low++;
            }
            arr[high]=arr[low];
        }

        arr[low]=tmp;
        return low;
    }
}
