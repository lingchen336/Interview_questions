package com.test.temp;
/*
3
3 3
###
#@*
***
3 4
####
#@.*
**.*
3 3
.#.
#@#
.#.
样例输出
1
0
-1
 */

import java.util.Scanner;

public class Al_20 {
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
    }
    public static void depthFirstSearch(int N, int M, StringBuilder[] s){
        int d[][] = {{}, {0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        System.out.println(0);
    }
}
