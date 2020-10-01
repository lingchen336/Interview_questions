package com.test.temp;

import java.util.Scanner;

public class Al_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(), M = sc.nextInt();
            sc.nextLine();
            StringBuilder s[]=new StringBuilder[N];
            for (int j = 0; j < N; j++) {
                s[j]=new StringBuilder(sc.nextLine());
            }
            depthFirstSearch(N,M,s);
        }
    }static void depthFirstSearch(int N, int M, StringBuilder[] s){
        int d[][] = {{}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        System.out.println(0);
    }
}
