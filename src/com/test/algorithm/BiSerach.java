package com.test.algorithm;
/**
 * @author ht
 * 二分查找
 * 以中间元素为标志查找
 */

public class BiSerach {

    public static void main(String[] args) {
        int[] arry = {1, 2, 3, 5, 8};
        int a = 8;
        System.out.println(biSerach(arry, a));

    }

    static int biSerach(int[] arry, int a) {

        int lo = 0, mid;
        int hi = arry.length - 1;
        while (lo <=hi) {
            mid = (lo + hi) / 2;
            if (arry[mid] == a) {
                return mid + 1;
            } else if (arry[mid] < a) {
                lo = mid+1;
            } else {
                hi = mid-1;
            }
        }

        return -1;
    }

}