package com.test.algorithm;

/**
 *
 * @author 何涛
 * 冒泡排序
 * 比较/交换相邻两个元素
 */
public class Bubble {
    public static void main(String[] args) {
        int []arry={1 ,2,5 , 6, 7 ,8 ,14, 5,64};
        Bubble(arry);
        for(int n=0;n<arry.length;n++){
            System.out.println(arry[n]);
        }


    }

    static void Bubble(int []arry){

        for(int i=0;i<arry.length-2;i++){
            for(int j=i+1;j<arry.length-1;j++){
                if(arry[j-1]>arry[j]){
                    int a=arry[j];
                    arry[j]=arry[j-1];
                    arry[j-1]=a;
                }
            }
        }
    }
}
