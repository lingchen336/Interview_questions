package com.test.algorithm.DiGui;

public class HanNuoTa {
    public static void hanoi(int n,int p1,int p2,int p3)
    {
        if(1==n)
            System.out.println("���Ӵ�"+p1+"�Ƶ�"+p3);
        else
        {
            hanoi(n-1,p1,p3,p2);

            System.out.println("���Ӵ�"+p1+"�Ƶ�"+p3);

            hanoi(n-1,p2,p1,p3);
        }
    }
    public static void main(String[] args) {
        /*4��ʾ������1��ʾ��ʼ���ӣ�2��ʾ��ʼ���ӣ�3��ʾ��ʼ����*/
        hanoi( 4, 1, 2, 3);
    }

}