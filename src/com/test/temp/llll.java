//package com.test;
//
//import java.util.Scanner;
//
//public class Main {
//    static int tem;
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n,m,k;
//
//        n=sc.nextInt();m=sc.nextInt();k=sc.nextInt();
//
//        int a[]=new int[n+1];
//        for (int i = 0; i < n; i++) {
//            a[i]=sc.nextInt();
//        }
//        int result=find(a,n,m);
//        System.out.println(result);
//    }
//    public static int find(int []a,int n,int m){
//        if(m>n)return 0;
//        int result=0;
//        for (int i = 0; i < n; i++) {
//            if(a[i]>=5){
//                int left=i;
//                for (int j = i; j < a.length; j++) {
//                    if(a[j]<5){
//                        int tem=j-left;
//                        result+=tem-m>=0?tem-m+1:0;
//                        break;
//                    }
//                    else {
//                        i++;
//
//                    }
//                }
//            }
//        }
//        return result;
//    }
//}