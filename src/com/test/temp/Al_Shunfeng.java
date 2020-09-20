package com.test.temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*
3
-1 -1 -1
3
-1 -1 1
3
1 -1 2
7
-1 -1 -1 4 5 1 2

测试数据 1 1 2 2
给定一个数列 含n个数，其中存在未知数用-1代替 ，数列中所有数都是正整数，求数列存在几个等差数列。

暂时未完成，数据2 和3 无法兼容
 */

public class Al_Shunfeng {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String line;
        int xxx=1;
        while(true) {
            line = bf.readLine();

            int n = Integer.parseInt(line);
            int[] a = new int[n+3];
            String s = bf.readLine();
            String[] str = s.split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int count = 1;
            int flag=0;
            //向右遍历找打第一一个非-1 数
            for (int i=0; i < n; i++) {
                int j=1,k=1;
                while(a[i]==-1&&i<n){
                    i++;
                    j++;
                }
                if(i==n+1)break;    //没找到 最后一个数
                //向右遍历找到第二个非-1的数
                int m=i+1;
                while(a[m]==-1&&m<n){
                    m++;
                    k++;
                }
                if(i==n)break;
                if(i==0){       //1...
                    continue;
                }
                else if(a[i-1]!=-1){
                    if(k*(a[i]-a[i-1])!=(a[i+k]-a[i])){ //1 2 ...
                        i=i+k-1;
                        flag++;
                        continue;
                    }
                }else{
                    if(k*a[i]>=j*(a[i+k]-a[i])){
                        //构成等差
                        i=i+k-1;
                        continue;
                    }
                    if(k*a[i]<j*(a[i+k]-a[i])){         //-1 2 ...
                        //不构成等差
                        count++;
                        i=i+k-1;
                        continue;
                    }
                    if(i-j<0){
                        double x=(double)(a[i]-a[0])/j; //1 -1 2
                        if((x-(int)x)!=0){
                            //不构成等差
                            count++;
                            i=i+k-1;
                            continue;
                        }
                    }else{
                        double x=(double)(a[i]-a[i-j])/j; //1 -1 2
                        if((x-(int)x)!=0){
                            //不构成等差
                            count++;
                            i=i+k-1;
                            continue;
                        }
                    }

                }

            }
            if(xxx==1) System.out.println();
            xxx++;
            System.out.println(count+(flag-1)/2);
        }
    }
}


