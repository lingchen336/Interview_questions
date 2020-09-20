package com.test.temp;
/*1.从键盘输入4个数字int A B a b
    2.若x/y=a/b
        x:[1-A] y:[1-B]
        out:max(x*y) x y;
    else:o o

    分析：ax=by
    1.double z=a/b;
    2.判断a/b是否大于1：
    从1开始遍历小的值：
        A<B:遍历A
            while(x*a/b<B){
                if((x*a/b-x*a/b)==0) falg=x;temp=x*a/b}
                temp=x*a/b
        A>B:遍历B：
            while(y*a/b<A){
                if((y*a/b-y*a/b)==0) temp=y;}
                flag=y*a/b
    3.if(z>a/b||z>B/A)sout(0 0)
*/

import java.util.Scanner;

public class Al4_ali {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int flag=0, temp=0;
        double z = a / b;
        if (z > A / B) System.out.println("0 0");
        else {
            if (A <= B) {
                for (int i = 1; i <= A && i * a / b < B; i++) {
                    if (((int)i * a / b - i * a / b) == 0) {flag = i;
                        temp = i * a / b;}
                }
            }else{
                for (int i = 1; i <= B && i * a / b < A; i++) {
                    if (((int)i * a / b - i * a / b) == 0)
                    {temp = i;
                        flag = i * a / b;}
                }
            }
            if(flag==0)
                System.out.println("0 0");
            System.out.println(flag+" "+temp);
        }


    }
}