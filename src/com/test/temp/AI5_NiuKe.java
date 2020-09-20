package com.test.temp;

import java.util.Scanner;

/*
题目：输入一个数x，小于1000，存在【2--x】之内的两个素数和等于x  找出这样的素数对有几个
1.输入一个数int<1000  if a>1000 return ;
2.遍历【1.x/2]找出素数  i
3.统计结果：
    if(find(i)&&find(x-i))
                    count++;

注意：素数算法中的 <=Math.sqrt()：
        for(int j=2;j<=Math.sqrt(x);j++){
            if(x%j==0)
            return false;
        }

 */
public class AI5_NiuKe {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int count=0;
        if(x<1000&&x>=3){
            for (int i = 3; i <=x/2 ; i++) {
                if(find(i)&&find(x-i))
                    count++;
            }
            System.out.println(count);
        }

    }
    public static boolean find(int  x){
        for(int j=2;j<=Math.sqrt(x);j++){
            if(x%j==0)
                return false;
        }
        return true;
    }
}