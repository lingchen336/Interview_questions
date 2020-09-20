package com.test.algorithm;

import java.util.Stack;

/**
 * 参考：https://www.runoob.com/w3cnote/quick-sort.html
 * 快速排序
 */
public class Quick_Sort {
    public static void main(String[] args) {
        int arr[]={1,2 ,2,5,6,1,86,45,35};
        int l=0,r=arr.length-1;
        quick_sort(arr,l,r);
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

        Stack<Integer>stack=new Stack<>();

    }
    static void quick_sort(int s[], int l, int r)
    {
        if (l < r)
        {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j)
            {
                while(i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if(i < j)
                    s[i++] = s[j];

                while(i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if(i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }
}
