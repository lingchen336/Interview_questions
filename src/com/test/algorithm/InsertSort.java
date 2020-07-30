package com.test.algorithm;

/**
 * 插入排序
 * 遍历数组，数组中未排序的数a 插入已排好序的数组序列中，每次a都要遍历的比较已排好序的数组以找到位置；
 * 如果输入数组已经是排好序的话，插入排序出现佳情况，其运行时间是输入规模的一个线性函数。如果输入数组
 * 是逆序排列的，将出现坏情况。平均情况与坏情况一样，其时间代价是(n2)；
 */
public class InsertSort {
    public static void main(String[] args) {
        int arry[]={2,3 ,5,8 ,10,56,89};
        int a=44;
        InsertSort(arry,a);
        for(int i=1;i<arry.length-1;i++)
        System.out.println(arry[i]);
    }
    static void InsertSort(int arr [],int a){

        for(int i =1; i<arr.length;i++)
        {
            //插入的数
            int insertVal = arr[i];
            //被插入的位置(准备和前一个数比较)
            int index = i-1;
            //如果插入的数比被插入的数小
            while(index>=0&&insertVal<arr[index])
            {
                //将把arr[index] 向后移动
                arr[index+1]=arr[index];
                //让index向前移动
                index--;
            }
            //把插入的数放入合适位置
            arr[index+1]=insertVal;
        }
}

}
