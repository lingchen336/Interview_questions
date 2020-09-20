package com.test.algorithm.DiGui;

public class HanNuoTa {
    public static void hanoi(int n,int p1,int p2,int p3)
    {
        if(1==n)
            System.out.println("盘子从"+p1+"移到"+p3);
        else
        {
            hanoi(n-1,p1,p3,p2);

            System.out.println("盘子从"+p1+"移到"+p3);

            hanoi(n-1,p2,p1,p3);
        }
    }
    public static void main(String[] args) {
        /*4表示盘数，1表示开始柱子，2表示开始柱子，3表示开始柱子*/
        hanoi( 4, 1, 2, 3);
    }

}