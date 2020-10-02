package com.test.algorithm.jianzhi;

/**
 * 数字以0123456789101112131415…的格式序列化到一个字符序列中。在这个序列中，第5位（从下标0开始计数）是5，第13位是1，第19位是4，等等。
 *
 * 请写一个函数，求任意第n位对应的数字。
 *
 0-9这样的一位数可以贡献长度1，这些数一共可以贡献10个长度；
 10-99这样的两位数可以贡献长度2，这些数一共可以贡献2 * 90 = 180个长度；
 100-999这样的三位数可以贡献长度3，这些数一共可以贡献3 * 900 = 2700个长度；
 以此类推八位数可以贡献长度8，这些数一共可以贡献90000000 * 8 = 720000000个长度

 */

class O_44 {
    private static int[] sum ={10,190,2890,38890,488890,5888890,68888890,788888890};

    public static int findNthDigit(int n) {
        if(n<10)return n;
        int i=0;
        for (; i <sum.length&&n>=sum[i] ; i++);
        int left=n-sum[i-1];
        int index=left/(i+1),offset=left%(i+1);
        String num=String.valueOf((int)Math.pow(10,i)+index);
        return num.charAt(offset)-'0';
    }

    public static void main(String[] args) {
        int n=100000000;
        System.out.print(findNthDigit(n));
    }
}
