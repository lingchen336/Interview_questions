package com.test.algorithm;
import java.util.Random;
import java.util.Scanner;

/**
 * 猜字游戏，生成一个1-100之间的随机数，盲猜7次
 * Random（） 左闭右开
 */

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        //生成一个1--100的随机数
        int num=rd.nextInt(100)+1;
        System.out.println("范围在1--100之间");
        boolean flag=true;
        for(int i=0;i<7;i++){
            System.out.println("请输入一个数字：");
            int a =sc.nextInt();
            if(a==num){
                System.out.println("恭喜你，猜到了！");
                flag=false;
                break;
            }else if(a>num){
                System.out.println("你猜错了，正确答案比"+a+"小");
            }else{
                System.out.println("你猜错了，正确答案比"+a+"大");
            }
        }

        if(flag){
            System.out.println("猜题次数用光了！");
        }
    }
}
