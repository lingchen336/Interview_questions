package com.test.temp;
/*
输入：一个数字n
输出：一个*组成的三角形
    输入2:
     *
    ***
 */
import java.util.Scanner;

class Al1 {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();

        for (int i = 1; i <=x; i++) {
            for(int j=0;j<x-i;j++)
                System.out.print(" ");
            for (int j=0;j<i;j++)
                System.out.print("*");
            for (int j=1;j<i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}